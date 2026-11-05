package leetcode;

public class LC_1004_MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int left =0, maxLength =0, zeroNum = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroNum++;
            }

            //윈도우 안에 0 개수가 k를 초과하면 불가능한 구간이 됨.
            //따라서 0의 개수가 다시 k개 이하로 될때까지 left를 오른쪽으로 밀어서 윈도우 축소
            while (zeroNum > k) {
                //가장 왼쪽이 0이면 윈도우에서 0이 나가는거기 때문에 0개수 축소
                if (nums[left] == 0) {
                    zeroNum--;
                }
                left++; // 윈도우 시작점 축소
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
