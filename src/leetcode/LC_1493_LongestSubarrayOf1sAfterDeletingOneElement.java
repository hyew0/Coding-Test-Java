package leetcode;

public class LC_1493_LongestSubarrayOf1sAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int left = 0, maxLength = 0, currentZero = 0;

        for (int right = 0; right < nums.length; right++) {
            //현재의 자리가 0이면 currentZero++
            if (nums[right] == 0) {
                currentZero++;
            }

            while (currentZero > 1) {
                if (nums[left] == 0) {
                    currentZero--;
                }
                left++;
            }

            //이전에 계산한 최대길이보다 현재의 길이가 더 길면 최대길이 교체
            int now = right - left + 1; //현재 길이(0포함)
            maxLength = Math.max(maxLength, now);
        }

        //최종은 0을 제거한 길이이므로 하나 빼줌
        maxLength--;

        return maxLength;
    }

    /*
    // 최적화 방법
    public int longestSubarray(int[] nums) {
        int left = 0;
        int maxLength = 0;
        int lastZero = -1; // 가장 최근에 발견한 0의 인덱스

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                // 이전 0의 바로 다음 위치로 left를 한번에 이동
                left = lastZero + 1;
                lastZero = right;
            }

            maxLength = Math.max(maxLength, right - left);
        }

        return maxLength;
    }
    */
}
