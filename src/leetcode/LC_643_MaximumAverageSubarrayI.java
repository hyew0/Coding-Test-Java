package leetcode;

public class LC_643_MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        //슬라이딩윈도우 적용 - 오른쪽 요소 더하고 왼쪽 요소 뺌
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}
