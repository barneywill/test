import pygame
import random

# Initialize Pygame
pygame.init()

# Constants
SCREEN_WIDTH = 300
SCREEN_HEIGHT = 600
PREVIEW_WIDTH = 150
GRID_SIZE = 30
GRID_WIDTH = SCREEN_WIDTH // GRID_SIZE
GRID_HEIGHT = SCREEN_HEIGHT // GRID_SIZE

# Colors
BLACK = (0, 0, 0)
WHITE = (255, 255, 255)
GRAY = (128, 128, 128)
COLORS = [
    (0, 255, 255),    # Cyan - I
    (255, 255, 0),    # Yellow - O
    (128, 0, 128),    # Purple - T
    (0, 255, 0),      # Green - S
    (255, 0, 0),      # Red - Z
    (0, 0, 255),      # Blue - J
    (255, 165, 0),    # Orange - L
]

# Tetromino shapes
SHAPES = [
    [[1, 1, 1, 1]],  # I
    [[1, 1], [1, 1]],  # O
    [[0, 1, 0], [1, 1, 1]],  # T
    [[0, 1, 1], [1, 1, 0]],  # S
    [[1, 1, 0], [0, 1, 1]],  # Z
    [[1, 0, 0], [1, 1, 1]],  # J
    [[0, 0, 1], [1, 1, 1]],  # L
]

class Tetromino:
    def __init__(self):
        self.shape_index = random.randint(0, len(SHAPES) - 1)
        self.shape = SHAPES[self.shape_index]
        self.color = COLORS[self.shape_index]
        self.x = GRID_WIDTH // 2 - len(self.shape[0]) // 2
        self.y = 0
    
    def rotate(self):
        self.shape = list(zip(*self.shape[::-1]))

class Tetris:
    def __init__(self):
        self.grid = [[0 for _ in range(GRID_WIDTH)] for _ in range(GRID_HEIGHT)]
        self.current_piece = Tetromino()
        self.next_piece = Tetromino()
        self.game_over = False
        self.score = 0
        
    def valid_move(self, piece, x, y):
        for row in range(len(piece.shape)):
            for col in range(len(piece.shape[row])):
                if piece.shape[row][col]:
                    new_x = x + col
                    new_y = y + row
                    if (new_x < 0 or new_x >= GRID_WIDTH or 
                        new_y >= GRID_HEIGHT or
                        (new_y >= 0 and self.grid[new_y][new_x])):
                        return False
        return True
    
    def freeze_piece(self):
        for row in range(len(self.current_piece.shape)):
            for col in range(len(self.current_piece.shape[row])):
                if self.current_piece.shape[row][col]:
                    y = self.current_piece.y + row
                    x = self.current_piece.x + col
                    if y >= 0:
                        self.grid[y][x] = self.current_piece.color
        
        self.clear_lines()
        self.current_piece = self.next_piece
        self.next_piece = Tetromino()
        
        if not self.valid_move(self.current_piece, self.current_piece.x, self.current_piece.y):
            self.game_over = True
    
    def clear_lines(self):
        lines_cleared = 0
        y = GRID_HEIGHT - 1
        while y >= 0:
            if all(self.grid[y]):
                del self.grid[y]
                self.grid.insert(0, [0 for _ in range(GRID_WIDTH)])
                lines_cleared += 1
            else:
                y -= 1
        
        self.score += lines_cleared * 100
    
    def move_down(self):
        if self.valid_move(self.current_piece, self.current_piece.x, self.current_piece.y + 1):
            self.current_piece.y += 1
        else:
            self.freeze_piece()
    
    def move_left(self):
        if self.valid_move(self.current_piece, self.current_piece.x - 1, self.current_piece.y):
            self.current_piece.x -= 1
    
    def move_right(self):
        if self.valid_move(self.current_piece, self.current_piece.x + 1, self.current_piece.y):
            self.current_piece.x += 1
    
    def rotate_piece(self):
        old_shape = self.current_piece.shape
        self.current_piece.rotate()
        if not self.valid_move(self.current_piece, self.current_piece.x, self.current_piece.y):
            self.current_piece.shape = old_shape
    
    def drop(self):
        while self.valid_move(self.current_piece, self.current_piece.x, self.current_piece.y + 1):
            self.current_piece.y += 1
        self.freeze_piece()

def draw_grid(screen, game):
    # Draw grid
    for y in range(GRID_HEIGHT):
        for x in range(GRID_WIDTH):
            color = game.grid[y][x] if game.grid[y][x] else BLACK
            pygame.draw.rect(screen, color, (x * GRID_SIZE, y * GRID_SIZE, GRID_SIZE, GRID_SIZE))
            pygame.draw.rect(screen, GRAY, (x * GRID_SIZE, y * GRID_SIZE, GRID_SIZE, GRID_SIZE), 1)
    
    # Draw current piece
    for row in range(len(game.current_piece.shape)):
        for col in range(len(game.current_piece.shape[row])):
            if game.current_piece.shape[row][col]:
                x = (game.current_piece.x + col) * GRID_SIZE
                y = (game.current_piece.y + row) * GRID_SIZE
                pygame.draw.rect(screen, game.current_piece.color, (x, y, GRID_SIZE, GRID_SIZE))
                pygame.draw.rect(screen, GRAY, (x, y, GRID_SIZE, GRID_SIZE), 1)

def draw_preview(screen, game):
    # Draw preview box background
    preview_x = SCREEN_WIDTH + 10
    preview_y = 100
    preview_box_size = 120
    
    pygame.draw.rect(screen, GRAY, (preview_x, preview_y, preview_box_size, preview_box_size), 2)
    
    # Draw "Next" label
    font = pygame.font.Font(None, 30)
    next_text = font.render('Next', True, WHITE)
    screen.blit(next_text, (preview_x + 30, preview_y - 35))
    
    # Calculate offset to center the preview piece
    shape = game.next_piece.shape
    piece_width = len(shape[0]) * GRID_SIZE
    piece_height = len(shape) * GRID_SIZE
    offset_x = preview_x + (preview_box_size - piece_width) // 2
    offset_y = preview_y + (preview_box_size - piece_height) // 2
    
    # Draw next piece
    for row in range(len(shape)):
        for col in range(len(shape[row])):
            if shape[row][col]:
                x = offset_x + col * GRID_SIZE
                y = offset_y + row * GRID_SIZE
                pygame.draw.rect(screen, game.next_piece.color, (x, y, GRID_SIZE, GRID_SIZE))
                pygame.draw.rect(screen, GRAY, (x, y, GRID_SIZE, GRID_SIZE), 1)

def main():
    screen = pygame.display.set_mode((SCREEN_WIDTH + PREVIEW_WIDTH, SCREEN_HEIGHT))
    pygame.display.set_caption("Tetris")
    clock = pygame.time.Clock()
    game = Tetris()
    
    fall_time = 0
    fall_speed = 500  # milliseconds
    fast_fall_speed = 50  # milliseconds when down is held
    
    running = True
    while running:
        # Check if down key is currently pressed
        keys = pygame.key.get_pressed()
        current_fall_speed = fast_fall_speed if keys[pygame.K_DOWN] and not game.game_over else fall_speed
        
        fall_time += clock.get_rawtime()
        clock.tick()
        
        if fall_time >= current_fall_speed:
            fall_time = 0
            if not game.game_over:
                game.move_down()
        
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False
            
            if event.type == pygame.KEYDOWN and not game.game_over:
                if event.key == pygame.K_LEFT:
                    game.move_left()
                elif event.key == pygame.K_RIGHT:
                    game.move_right()
                elif event.key == pygame.K_UP:
                    game.rotate_piece()
                elif event.key == pygame.K_SPACE:
                    game.drop()
            
            if event.type == pygame.KEYDOWN and game.game_over:
                if event.key == pygame.K_r:
                    game = Tetris()
        
        screen.fill(BLACK)
        draw_grid(screen, game)
        draw_preview(screen, game)
        
        # Draw score
        font = pygame.font.Font(None, 36)
        score_text = font.render(f'Score: {game.score}', True, WHITE)
        screen.blit(score_text, (10, 10))
        
        if game.game_over:
            game_over_text = font.render('GAME OVER', True, WHITE)
            restart_text = font.render('Press R to restart', True, WHITE)
            screen.blit(game_over_text, (SCREEN_WIDTH // 2 - 100, SCREEN_HEIGHT // 2 - 20))
            screen.blit(restart_text, (SCREEN_WIDTH // 2 - 120, SCREEN_HEIGHT // 2 + 20))
        
        pygame.display.flip()
    
    pygame.quit()

if __name__ == "__main__":
    main()