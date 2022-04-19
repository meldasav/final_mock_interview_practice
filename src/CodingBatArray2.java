import java.util.Arrays;

public class CodingBatArray2 {
    /**
     * countEvens
     */
    public int countEvens(int[] numS) {
        int countEven = 0;
        for (int num : numS) {
            if (num % 2 == 0) countEven++;
        }
        return countEven;
    }

    /**
     * sum13
     */
    public int sum13(int[] numS) {
        if (numS.length == 0) return 0;
        else {
            int sum = 0;
            for (int i = 0; i < numS.length; i++) {
                if (numS[i] == 13) i++;
                else sum += numS[i];
            }
            return sum;
        }
    }

    /**
     * LUCKY13
     */
    public boolean lucky13(int[] numS) {
        boolean no13 = true;
        for (int num : numS) {
            if (num == 1 || num == 3) {
                no13 = false;
                break;
            }
        }
        return no13;
    }

    /**
     * fizzArray
     */
    public int[] fizzArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    /**
     * NO14
     */
    public boolean no14(int[] numS) {
        Arrays.sort(numS);
        return Arrays.binarySearch(numS, 1) < 0 || Arrays.binarySearch(numS, 4) < 0;
    }

    /**
     * MATCH_UP
     */
    public int matchUp(int[] numS1, int[] numS2) {
        int count = 0;

        for (int i = 0; i < numS1.length; i++) {
            if (Math.abs(numS1[i] - numS2[i]) <= 2 && Math.abs(numS1[i] - numS2[i]) != 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * BIG_DIFF
     */
    public int bigDiff(int[] numS) {
        Arrays.sort(numS);
        return numS[numS.length - 1] - numS[0];
    }

    /**
     * sum67
     */
    public int sum67(int[] numS) {
        int sum = 0;
        for (int i = 0; i < numS.length; i++) {
            if (numS[i] != 6) sum += numS[i];
            else while (numS[i] != 7) i++;
        }
        return sum;
    }

    /**
     * SUM28
     */
    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num == 2) sum += 2;
        }
        return sum == 8;
    }

    /**
     * only14
     */
    public boolean only14(int[] nums) {
        boolean check = true;
        for (int num : nums) {
            if (num != 1 && num != 4) {
                check = false;
                break;
            }
        }
        return check;
    }

    /**
     * HAS22
     */
    public boolean has22(int[] nums) {
        if (nums.length >= 2) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 2 && nums[i + 1] == 2) return true;
            }
        }
        return false;
    }

    /**
     * isEverywhere
     */

    public boolean isEverywhere(int[] nums, int val) {
        boolean result = true;
        for (int i = 0; i <= nums.length - 2; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * HAS77
     */

    public boolean has77(int[] nums) {
        boolean result = true;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 7 && nums[i + 1] == 7 && nums[i + 2] == 7) {
                result = false;
                break;
            }
            if (nums[nums.length - 1] == 7 && nums[nums.length - 2] == 7) {
                result = false;
            }
        }
        return result;
    }

    /**
     * haveThree
     */

    public boolean haveThree(int[] nums) {
        int three = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 & nums[i + 1] == 3) return false;
        }
        for (int num : nums) {
            if (num == 3) three++;
        }
        return three == 3;
    }

    /**
     * TRIPLEUP
     */
    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i] + 2) {
                return true;
            }
        }
        return false;
    }

    /**
     * TENRUN
     */
    public int[] tenRun(int[] nums) {
        int change = 0;
        boolean condition = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                condition = true;
                change = nums[i];
            }
            if (condition) {
                nums[i] = change;
            }

        }
        return nums;
    }

    public int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i - 1] != nums[i] && nums[i + 1] != nums[i]) {
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }
        return nums;
    }

    public int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                int max = 0;
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] % 2 != 0) {
                        max = Math.max(nums[j], max);
                    }
                }
                nums[i] = max;
            }
         }
        return nums;
    }
}

