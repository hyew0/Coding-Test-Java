package leetcode;

import java.util.Scanner;

/*
만약에 break 부분에서 return i하면 맨 밑에를 return -1; 해서 조건 만족이 없을 때의 if 문을 생략 가능.
* */
public class LC_724_FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int leftSum = 0, rightSum = 0, resultIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            rightSum +=nums[i];
        }

        int i = 0;
        for (; i < nums.length; i++) {
            rightSum -= nums[i];

            if (leftSum == rightSum){
                resultIndex = i;
                break;
            }

            leftSum += nums[i];

        }

        if (i == nums.length) { //조건 만족이 없을 경우
            resultIndex = -1;
        }


        return resultIndex;
    }
}
