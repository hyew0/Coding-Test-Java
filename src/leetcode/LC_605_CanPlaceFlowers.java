package leetcode;

public class LC_605_CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        /*
        배열의 크기를 기반으로 비어있는(=0) 개수를 세서 n개의 꽃을 심고도 룰을 위반하지 않는지 확인.
          -> 이건 만약에 [0,1,0,0,1], n=1이면 룰이 위반되서 false 니까 단순히 개수 세는 건 안됨.
        양 옆이 0인지 확인?
        */
        int arrayLength = flowerbed.length, emptyNum=0;

        for(int i=0; i<arrayLength; i++){
            if (n <= emptyNum){
                return true;
            }

            //현재 위치가 0일 때(비어있을 때)
            if (flowerbed[i] == 0){
                //맨 왼쪽이거나 왼쪽이 비어있는지 조건 확인
                boolean leftEmpty = (i == 0) || (flowerbed[i-1] == 0);

                //맨 오른쪽이거나 오른쪽이 비어있는지 조건 확인
                boolean rightEmpty = (i==arrayLength-1) || (flowerbed[i + 1] == 0);

                //양 옆이 모두 비어있다면 현재 위치 꽃 심기
                if (leftEmpty && rightEmpty){
                    flowerbed[i] = 1;
                    emptyNum++;
                }
            }

        }

        return emptyNum >= n;
    }
}
