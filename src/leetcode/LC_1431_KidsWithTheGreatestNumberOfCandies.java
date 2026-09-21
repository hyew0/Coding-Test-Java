package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC_1431_KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        /*
        현재 갖고 있는 캔디 중 가장 큰 수 vs i번째 아이가 갖고 있는 캔디의 수 + extracandies
        두 수를 비교해서 후자가 더 크면 true
        */

        // 배열에서 가장 큰 값 찾기
        int max = candies[0];

        for (int i=0; i < candies.length; i++){
            if (max < candies[i]){
                max = candies[i];
            }
        }

        // 각 자리 값 비교
        List<Boolean> result = new ArrayList<>();
        for (int i=0; i< candies.length;i++){
            result.add(max <= candies[i] + extraCandies);
        }

        return result;
    }
}
