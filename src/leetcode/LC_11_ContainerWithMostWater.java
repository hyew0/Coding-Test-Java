package leetcode;

public class LC_11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int mostWater = 0;
        int left = 0;
        int right = height.length -1;

        //시간초과 -> 아래 코드로 전환. 투 포인터 활용.
        /*for (int x = 0; x < height.length; x++) {
            for (int x2 = x + 1; x2 < height.length; x2++) {
                int xLength = x2 - x;
                int yLength = (height[x] < height[x2] ? height[x] : height[x2]);

                if (xLength*yLength > mostWater){
                    mostWater = xLength*yLength;
                }
            }
        }*/

        while (left < right) {
            int currentWidth = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int currentArea = currentWidth * currentHeight;

            mostWater = Math.max(mostWater, currentArea);

            //높이가 더 낮은 쪽의 포인터를 이동 -> 높이가 더 낮은 쪽을 움직여야 더 넓은 면적을 찾을 가능성이 생기기 때문.
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

        }

        return mostWater;
    }
}
