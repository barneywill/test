import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedianOfTwoSortedArrays {

    /**
     * 24: 11,12
     *
     * [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22]
     * [0,6]
     * @param args
     */
    public static void main(String[] args) {
        MedianOfTwoSortedArrays app = new MedianOfTwoSortedArrays();
        int[] nums1 = new int[]{29,126,242,263,315,349,390,521,530,539,578,690,691,704,770,787,793,826,858,910,1002,1048,1060,1076,1199,1247,1265,1282,1306,1346,1393,1407,1414,1427,1433,1449,1464,1474,1512,1589,1663,1677,1692,1700,1773,1789,1794,1806,1822,1829,1853,1869,1881,1887,1963,2142,2146,2147,2179,2244,2256,2271,2300,2360,2388,2423,2564,2609,2620,2632,2670,2714,2721,2761,2778,2834,2846,2858,2867,2893,2922,2958,3020,3027,3032,3201,3233,3297,3420,3440,3451,3510,3532,3565,3589,3599,3631,3633,3686,3707,3773,3805,3829,3843,3852,3891,3980,4013,4063,4064,4154,4194,4207,4254,4327,4380,4478,4498,4518,4537,4555,4560,4569,4696,4765,4775,4776,4787,4788,4797,4813,4829,4857,4872,4881,4909,4934,4937,4952,4971,4978,5050,5090,5262,5303,5386,5390,5409,5420,5465,5472,5482,5498,5577,5616,5674,5840,5877,5887,5940,6121,6172,6174,6189,6235,6330,6374,6450,6480,6497,6498,6528,6612,6633,6639,6659,6675,6697,6738,6754,6804,6809,6873,6887,7056,7074,7133,7134,7143,7157,7162,7163,7185,7238,7352,7354,7388,7411,7430,7487,7527,7573,7575,7639,7661,7681,7696,7742,7745,7763,7776,7812,7816,7818,7865,7898,7912,7954,7959,8001,8029,8096,8124,8132,8167,8201,8227,8351,8365,8369,8394,8401,8408,8410,8411,8428,8451,8473,8478,8661,8710,8746,8758,8779,8823,8828,8828,8977,8982,9005,9069,9111,9144,9265,9294,9303,9327,9344,9355,9446,9466,9508,9510,9525,9634,9666,9699,9734,9786,9887,9962,9974,10006,10033,10048,10137,10158,10216,10269,10344,10441,10536,10544,10552,10572,10628,10654,10662,10684,10697,10844,10853,10861,10872,10951,10966,11008,11157,11183,11217,11229,11259,11299,11344,11479,11479,11518,11532,11553,11554,11572,11610,11656,11734,11760,11762,11777,11827,11843,11843,11849,11872,11927,12046,12164,12179,12204,12208,12212,12238,12267,12314,12331,12352,12353,12355,12416,12481,12490,12505,12512,12580,12650,12659,12671,12728,12730,12777,12856,12892,12914,13021,13037,13062,13127,13152,13160,13165,13166,13175,13189,13224,13307,13346,13393,13523,13541,13588,13665,13720,13728,13773,13817,13817,13831,13839,13845,13907,13921,13976,14003,14023,14025,14077,14240,14355,14370,14406,14491,14535,14557,14563,14578,14584,14591,14651,14662,14664,14681,14682,14724,14730,14746,14808,14817,14842,14874,14908,14964,14996,15023,15056,15066,15124,15145,15183,15228,15385,15403,15498,15529,15541,15552,15679,15738,15746,15759,15778,15781,15818,15832,15836,15901,15904,15955,15993,16056,16075,16077,16101,16113,16115,16134,16253,16274,16275,16281,16291,16306,16334,16366,16399,16455,16496,16522,16532,16551,16601,16607,16611,16618,16645,16655,16815,16816,16825,16857,16892,16906,16933,16948,17000,17008,17071,17092,17147,17250,17256,17268,17290,17383,17393,17394,17452,17549,17558,17572,17602,17629,17645,17663,17692,17696,17744,17766,17777,17819,17871,17915,18070,18086,18124,18131,18169,18228,18281,18298,18339,18370,18378,18387,18402,18414,18415,18420,18463,18469,18473,18489,18527,18540,18566,18586,18586,18655,18741,18744,18796,18833,18849,18895,18904,18945,18969,18973,18999,19001,19073,19074,19157,19177,19196,19232,19270,19360,19461,19559,19572,19575,19593,19701,19761,19841,19859,19886,19898,19918,19923,19960,19986,20043,20087,20105,20175,20203,20214,20272,20283,20284,20294,20327,20390,20407,20407,20420,20433,20458,20464,20466,20549,20704,20715,20751,20842,20898,20905,21028,21052,21069,21075,21080,21124,21166,21172,21178,21183,21275,21296,21325,21338,21342,21400,21452,21482,21494,21536,21613,21690,21708,21718,21720,21793,21831,21876,21903,21911,21915,21932,21971,22018,22049,22058,22072,22097,22211,22230,22233,22265,22306,22329,22338,22363,22397,22421,22476,22490,22550,22558,22581,22607,22750,22758,22779,22843,22877,22935,22950,22996,23019,23046,23122,23143,23166,23210,23263,23344,23348,23394,23426,23467,23481,23492,23584,23594,23597,23606,23622,23653,23700,23780,23786,23809,23896,23904,23917,23937,24054,24077,24115,24134,24142,24218,24266,24285,24295,24313,24315,24319,24355,24432,24444,24470,24482,24485,24539,24580,24696,24724,24751,24751,24787,24841,24843,24856,24876,24889,24916,24933,25049,25062,25087,25264,25375,25386,25411,25446,25450,25453,25457,25466,25521,25529,25560,25631,25654,25707,25721,25724,25762,25814,25828,25843,25845,25857,25859,25865,25892,25954,25965,26034,26062,26069,26077,26090,26188,26244,26277,26294,26296,26299,26312,26321,26349,26381,26431,26472,26552,26574,26591,26628,26639,26642,26664,26704,26711,26718,26743,26843,26898,26950,26981,27018,27105,27110,27123,27124,27147,27246,27260,27297,27350,27354,27398,27408,27472,27503,27530,27572,27614,27662,27682,27729,27733,27802,27804,27812,27833,27837,27913,27938,27981,28016,28028,28043,28145,28164,28207,28279,28303,28305,28337,28375,28397,28471,28549,28563,28581,28600,28660,28698,28806,28872,28915,28930,29040,29061,29064,29077,29180,29229,29232,29252,29338,29354,29354,29371,29371,29379,29393,29400,29430,29444,29514,29516,29523,29539,29587,29588,29654,29714,29780,29788,29879,29882,29916,29944,29971,30008,30013,30037,30074,30089,30118,30168,30194,30237,30251,30272,30278,30308,30340,30380,30419,30419,30439,30494,30495,30507,30550,30582,30665,30673,30703,30757,30786,30804,30823,30897,30966,30967,31004,31043,31054,31055,31083,31086,31094,31108,31239,31261,31303,31327,31350,31366,31407,31434,31479,31497,31560,31634,31681,31684,31684,31762,31849,31890,31909,32157,32163,32187,32231,32249,32267,32269,32296,32381,32452,32502,32510,32582,32604,32619,32660,32694,32737};
        int[] nums2 = new int[]{25,84,86,134,143,144,251,259,259,386,428,460,574,585,880,882,958,971,1111,1130,1209,1216,1243,1338,1342,1427,1474,1554,1576,1614,1718,1736,1793,1814,1877,1894,1973,1985,2036,2161,2163,2263,2310,2386,2431,2615,2680,2777,2807,2858,3070,3102,3162,3177,3362,3420,3470,3473,3641,3711,3748,3811,3852,3852,3906,3965,4080,4103,4153,4294,4325,4382,4392,4468,4535,4624,4672,4715,4764,4807,4848,4887,5008,5144,5184,5215,5284,5314,5379,5478,5540,5550,5565,5778,5810,5936,5968,6092,6110,6120,6164,6204,6283,6288,6294,6303,6376,6460,6497,6521,6552,6636,6714,6715,6886,7001,7028,7053,7099,7271,7287,7366,7464,7466,7656,7670,7694,7694,7810,7813,7829,7835,7904,7913,8127,8138,8177,8206,8276,8286,8434,8473,8572,8594,8635,8637,8678,8735,8794,8821,8871,8882,8915,8941,8974,9070,9091,9097,9158,9165,9198,9205,9288,9356,9391,9482,9578,9592,9596,9626,9718,9736,9772,9813,9847,9962,9975,10038,10044,10093,10104,10120,10158,10213,10292,10618,10636,10757,10783,10815,10839,10873,10956,11142,11179,11335,11476,11517,11549,11555,11613,11650,11692,11734,11785,11789,11844,11874,11931,12009,12009,12031,12044,12198,12198,12252,12313,12434,12472,12514,12568,12570,12582,12628,12661,12675,12705,12763,12766,12783,12786,12836,12913,12953,12979,13022,13100,13100,13131,13180,13202,13264,13279,13323,13449,13461,13560,13616,13684,13700,13747,13753,13757,13759,13853,13887,13909,13931,14103,14119,14146,14254,14332,14413,14461,14507,14550,14577,14696,14696,14862,14915,14938,15238,15294,15386,15407,15518,15526,15531,15540,15559,15676,15858,16094,16137,16169,16196,16240,16326,16506,16512,16513,16552,16641,16648,16653,16703,16707,16762,16823,16888,17012,17015,17114,17207,17209,17219,17227,17239,17257,17350,17461,17632,17689,17706,17780,17838,17908,17939,17962,17963,17983,18373,18516,18531,18610,18613,18797,18832,18852,18897,18961,19001,19029,19098,19131,19239,19526,19575,19598,19602,19682,19717,19764,19942,19969,19975,20003,20004,20004,20008,20057,20060,20102,20113,20141,20182,20211,20255,20283,20359,20461,20514,20518,20657,20673,20742,20796,20833,20865,20891,20898,20949,21008,21039,21104,21313,21345,21387,21462,21471,21564,21765,21766,21812,21835,21860,21885,21903,21906,21916,22003,22025,22149,22178,22201,22378,22380,22384,22388,22424,22577,22599,22630,22635,22639,22685,22721,22748,22787,22847,22854,22910,22958,23005,23227,23250,23315,23317,23326,23437,23454,23671,23674,23810,23851,23912,23949,24006,24089,24107,24210,24253,24319,24364,24411,24457,24462,24561,24665,24699,24766,24881,24894,24998,25015,25059,25189,25200,25225,25283,25342,25420,25506,25735,25768,25814,25858,26057,26082,26100,26123,26126,26337,26415,26478,26500,26634,26693,26776,26784,26836,26880,26939,26987,27243,27605,27638,27655,27690,27709,27776,27863,28043,28137,28196,28233,28288,28307,28314,28367,28367,28413,28450,28463,28522,28602,28652,28656,28693,28723,28736,28858,28916,28982,29095,29153,29298,29345,29351,29434,29526,29532,29674,29689,29841,29882,29933,29933,29973,29973,30100,30103,30153,30170,30256,30381,30395,30440,30495,30561,30614,30660,30661,30663,30681,30766,30860,30875,30986,31024,31104,31108,31179,31186,31224,31250,31310,31386,31566,31602,31660,31701,31712,31721,31762,31807,31842,31931,31966,31991,32002,32160,32175,32194,32282,32386,32478,32502,32516};
//        int[] nums1 = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
//        int[] nums2 = new int[]{0,6};
        System.out.println(app.findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int startIndex = 0;
        int endIndex = 0;
        if (nums1.length == 0 && nums2.length == 0) {
            return 0;
        }
        int total = nums1.length + nums2.length;
        if (total % 2 == 0) {
            startIndex = total / 2 - 1;
            endIndex = startIndex + 1;
        } else {
            startIndex = total / 2;
            endIndex = startIndex;
        }

//        int[] targets = search(nums1, nums2, startIndex, endIndex);
        int[] targets = search(new IntArray(nums1, 0), new IntArray(nums2, 0), startIndex, endIndex);
        return (targets[0] + targets[1]) * 1.0 / 2;
    }


    class IntArray {
        private int[] nums = null;
        private int startIndex = 0;
        public int length = 0;
        public IntArray(int[] nums, int startIndex) {
            this.nums = nums;
            this.startIndex = startIndex;
            length = this.nums.length - this.startIndex;
        }
        public int get(int index) {
            return nums[startIndex + index];
        }
        public int binarySearch(int target) {
            int index =  Arrays.binarySearch(nums, startIndex, nums.length, target);
            index = index > 0 ? index - startIndex : index + startIndex;
            return index;
        }
        public IntArray setStartIndex(int startIndex) {
            this.startIndex += startIndex;
            length = this.nums.length - this.startIndex;
            System.out.println("setStartIndex : " + startIndex + ", " + this.startIndex + ", " + this.length);
            return this;
        }
    }

    private int[] search(IntArray nums1, IntArray nums2, int startIndex, int endIndex) {
        System.out.println(nums1.length + ", " + nums2.length + ", " + startIndex + ", " + endIndex);
        int startNum = 0;
        int endNum = 0;
        if (nums1.length == 0 || nums2.length == 0 || nums1.get(nums1.length - 1) <= nums2.get(0) || nums2.get(nums2.length - 1) <= nums1.get(0)) {
            IntArray smallNums = nums1.length == 0 ? nums2 : nums2.length == 0 || nums1.get(nums1.length - 1) <= nums2.get(0) ? nums1 : nums2;
            IntArray bigNums = nums1.length == 0 ? nums1 : nums2.length == 0 || nums1.get(nums1.length - 1) <= nums2.get(0) ? nums2 : nums1;
            if (startIndex <= smallNums.length -1) {
                startNum = smallNums.get(startIndex);
            } else {
                startNum = bigNums.get(startIndex - smallNums.length);
            }
            if (startIndex == endIndex) {
                endNum = startNum;
            } else {
                if (endIndex <= smallNums.length - 1) {
                    endNum = smallNums.get(endIndex);
                } else {
                    endNum = bigNums.get(endIndex - smallNums.length);
                }
            }
            return new int[]{startNum, endNum};
        } else if (nums1.length == 1 || nums2.length == 1) {
            IntArray nums = nums1.length == 1 ? nums2 : nums1;
            int num = nums1.length == 1 ? nums1.get(0) : nums2.get(0);
            int index = nums.binarySearch(num);
            index = index >= 0 ? index : Math.abs(index + 1);
            if (startIndex < index) {
                startNum = nums.get(startIndex);
            } else if (startIndex == index) {
                startNum = num;
            } else {
                startNum = nums.get(startIndex - 1);
            }
            if (endIndex == startIndex) {
                endNum = startNum;
            } else {
                if (endIndex < index) {
                    endNum = nums.get(endIndex);
                } else if (endIndex == index) {
                    endNum = num;
                } else {
                    endNum = nums.get(endIndex - 1);
                }
            }
            return new int[]{startNum, endNum};
        } else if (startIndex < 10) {
            int i = 0;
            int j = 0;
            int current = 0;
            while (true) {
                int num1 = i < nums1.length ? nums1.get(i) : 10000000;
                int num2 = j < nums2.length ? nums2.get(j) : 10000000;
                int numMin = Math.min(num1, num2);
                if (current == startIndex) {
                    startNum = numMin;
                }
                if (current == endIndex) {
                    endNum = numMin;
                    break;
                }
                if (num1 <= num2) {
                    i++;
                } else {
                    j++;
                }
                current++;
            }
            return new int[]{startNum, endNum};
        } else {
            int medianIndex1 = (int)(nums1.length * (startIndex + 1.0) / (nums1.length + nums2.length)) - 1;
            int medianIndex2 = (int)(nums2.length * (startIndex + 1.0) / (nums1.length + nums2.length)) - 1;
            int median1 = nums1.get(medianIndex1);
            int median2 = nums2.get(medianIndex2);

            if (median1 <= nums2.get(0)) {
                return search(nums1.setStartIndex(medianIndex1 + 1), nums2, startIndex - medianIndex1 - 1, endIndex - medianIndex1 - 1);
            } else if (median2 <= nums1.get(0)) {
                return search(nums1, nums2.setStartIndex(medianIndex2 + 1), startIndex - medianIndex2 - 1, endIndex - medianIndex2 - 1);
            } else if (median1 <= median2) {
                int skipIndex = nums2.binarySearch(median1);
                skipIndex = skipIndex >= 0 ? skipIndex : Math.abs(skipIndex + 1);
                return search(nums1.setStartIndex(medianIndex1 + 1), nums2.setStartIndex(skipIndex), startIndex - medianIndex1 - skipIndex - 1, endIndex - medianIndex1 - skipIndex - 1);
            } else {
                int skipIndex = nums1.binarySearch(median2);
                skipIndex = skipIndex >= 0 ? skipIndex : Math.abs(skipIndex + 1);
                return search(nums1.setStartIndex(skipIndex), nums2.setStartIndex(medianIndex2 + 1), startIndex - medianIndex2 - skipIndex - 1, endIndex - medianIndex2 - skipIndex - 1);
            }
        }
    }


    private int[] search(int[] nums1, int[] nums2, int startIndex, int endIndex) {
        System.out.println(nums1.length + ", " + nums2.length + ", " + startIndex + ", " + endIndex);
        int startNum = 0;
        int endNum = 0;
        if (nums1.length == 0 || nums2.length == 0 || nums1[nums1.length - 1] <= nums2[0] || nums2[nums2.length - 1] <= nums1[0]) {
            int[] smallNums = nums1.length == 0 ? nums2 : nums2.length == 0 || nums1[nums1.length - 1] <= nums2[0] ? nums1 : nums2;
            int[] bigNums = nums1.length == 0 ? nums1 : nums2.length == 0 || nums1[nums1.length - 1] <= nums2[0] ? nums2 : nums1;
            if (startIndex <= smallNums.length -1) {
                startNum = smallNums[startIndex];
            } else {
                startNum = bigNums[startIndex - smallNums.length];
            }
            if (startIndex == endIndex) {
                endNum = startNum;
            } else {
                if (endIndex <= smallNums.length - 1) {
                    endNum = smallNums[endIndex];
                } else {
                    endNum = bigNums[endIndex - smallNums.length];
                }
            }
            return new int[]{startNum, endNum};
        } else if (nums1.length == 1 || nums2.length == 1) {
            int[] nums = nums1.length == 1 ? nums2 : nums1;
            int num = nums1.length == 1 ? nums1[0] : nums2[0];
            int index = Arrays.binarySearch(nums, num);
            index = index >= 0 ? index : Math.abs(index + 1);
            if (startIndex < index) {
                startNum = nums[startIndex];
            } else if (startIndex == index) {
                startNum = num;
            } else {
                startNum = nums[startIndex - 1];
            }
            if (endIndex == startIndex) {
                endNum = startNum;
            } else {
                if (endIndex < index) {
                    endNum = nums[endIndex];
                } else if (endIndex == index) {
                    endNum = num;
                } else {
                    endNum = nums[endIndex - 1];
                }
            }
            return new int[]{startNum, endNum};
        } else {
            if (startIndex < 10) {
                int i = 0;
                int j = 0;
                int current = 0;
                while (true) {
                    int num1 = i < nums1.length ? nums1[i] : 10000000;
                    int num2 = j < nums2.length ? nums2[j] : 10000000;
                    int numMin = Math.min(num1, num2);
                    if (current == startIndex) {
                        startNum = numMin;
                    }
                    if (current == endIndex) {
                        endNum = numMin;
                        break;
                    }
                    if (num1 <= num2) {
                        i++;
                    } else {
                        j++;
                    }
                    current++;
                }
                return new int[]{startNum, endNum};
            } else {
                int medianIndex1 = (int)(nums1.length * (startIndex + 1.0) / (nums1.length + nums2.length)) - 1;
                int medianIndex2 = (int)(nums2.length * (startIndex + 1.0) / (nums1.length + nums2.length)) - 1;
                int median1 = nums1[medianIndex1];
                int median2 = nums2[medianIndex2];

                if (median1 <= nums2[0]) {
                    return search(Arrays.copyOfRange(nums1, medianIndex1 + 1, nums1.length), nums2, startIndex - medianIndex1 - 1, endIndex - medianIndex1 - 1);
                } else if (median2 <= nums1[0]) {
                    return search(nums1, Arrays.copyOfRange(nums2, medianIndex2 + 1, nums2.length), startIndex - medianIndex2 - 1, endIndex - medianIndex2 - 1);
                } else if (median1 <= median2) {
                    int skipIndex = Arrays.binarySearch(nums2, median1);
                    skipIndex = skipIndex >= 0 ? skipIndex : Math.abs(skipIndex + 1);
                    return search(Arrays.copyOfRange(nums1, medianIndex1 + 1, nums1.length), Arrays.copyOfRange(nums2, skipIndex, nums2.length), startIndex - medianIndex1 - skipIndex - 1, endIndex - medianIndex1 - skipIndex - 1);
                } else {
                    int skipIndex = Arrays.binarySearch(nums1, median2);
                    skipIndex = skipIndex >= 0 ? skipIndex : Math.abs(skipIndex + 1);
                    return search(Arrays.copyOfRange(nums1, skipIndex, nums1.length), Arrays.copyOfRange(nums2, medianIndex2 + 1, nums2.length), startIndex - medianIndex2 - skipIndex - 1, endIndex - medianIndex2 - skipIndex - 1);
                }
            }
        }
    }
}
