import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        LongestConsecutiveSequence instance = new LongestConsecutiveSequence();
        System.out.println(instance.longestConsecutive(new int[]{100,4,200,1,3,2}));
        System.out.println(instance.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
        System.out.println(instance.longestConsecutive(new int[]{0}));
        System.out.println(instance.longestConsecutive(new int[]{1, 2, 0, 1}));
    }
    public int longestConsecutive(int[] nums) {
        int result = 0;
        if (nums.length > 0) {
            if (nums.length < 1000) {
                Arrays.sort(nums);
                int current = 0;
                for (int i = 1; i < nums.length; i++) {
                    if (nums[i] != nums[i - 1]) {
                        if (nums[i] - nums[i - 1] == 1) {
                            current++;
                        } else {
                            if (current + 1 > result) {
                                result = current + 1;
                            }
                            current = 0;
                        }
                    }
                }
                if (current + 1 > result) {
                    result = current + 1;
                }
            } else {
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for (int num : nums) {
                    if (num > max) {
                        max = num;
                    }
                    if (num < min) {
                        min = num;
                    }
                }
                byte[] bits = new byte[max - min + 1];
                for (int num : nums) {
                    bits[num - min] = 1;
                }
                int current = 0;
                for (byte bit : bits) {
                    if (bit > 0) {
                        current++;
                    } else {
                        if (current > result) {
                            result = current;
                        }
                        current = 0;
                    }
                }
                if (current > result) {
                    result = current;
                }
            }
        }
        return result;
    }
}
