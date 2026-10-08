package leetcode;

public class LC_283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int loc = 0;

        //0이 아닌 수 정리
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            } else {
                nums[loc++] = nums[i];
            }
        }

        //모든 수 정리 후 남은 0 채우기
        for (int i = loc; i < nums.length; i++) {
            nums[i] = 0;
        }

    }
}
