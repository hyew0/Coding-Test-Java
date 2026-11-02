package leetcode;

import java.util.Arrays;

public class LC_1679_MaxNumberOfKsumPairs {
    public int maxOperations(int[] nums, int k) {
        //숫자 비교 위해 순서대로 정렬
        Arrays.sort(nums);

        //변수 초기화
        int left = 0, right = nums.length - 1, result = 0;

        //투 포인터 이용 숫자 비교
        while (left < right) {
            int sum = nums[left] + nums[right];

            if ( sum == k) {
                result++;
                left++;
                right--;
            } else if (sum < k) {
                left ++;
            } else {
                right--;
            }
        }

        return result;
    }
}
