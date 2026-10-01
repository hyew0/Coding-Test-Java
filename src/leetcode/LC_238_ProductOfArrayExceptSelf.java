package leetcode;

public class LC_238_ProductOfArrayExceptSelf {
    /*
    - 본인 기준(nums[i]) 왼쪽 곱을 먼저 계산 -> 이후 오른쪽 곱을 왼쪽 곱과 곱하여 결과값 도출
     */
    public int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length;
        int[] answer = new int[numsLength];

        int leftProduct = 1;
        for (int i = 0; i < numsLength; i++) {
            answer[i] = leftProduct;

            leftProduct *= nums[i];
        }

        int rightLength = 1;
        for (int i = numsLength - 1; i >= 0; i--) {
            answer[i] *= rightLength;

            rightLength *= nums[i];
        }

        return answer;
    }
}
