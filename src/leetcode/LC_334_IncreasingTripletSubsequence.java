package leetcode;

public class LC_334_IncreasingTripletSubsequence {
    /*
    - for each 문을 돌기 때문에 배열의 실제 값(n)들을 순서대로 꺼내서 돔.
    - n이 제일 작으면 first를 갱신하고, first보다는 크지만 second보다 작으면 두 번째 수인 second를 갱신함.
    - 이렇게 갱신하다가, n이 first와 second보다도 큰 경우(else)가 오면 문제 조건이 만족되므로 true 반환.
        (조건: i < j < k 이고 nums[i] < nums[j] < nums[k])

    [핵심 포인트]
    - second가 갱신된 적이 있다는 것 자체가 "이미 내 앞에 더 작은 숫자가 있었다"는 증명임.
    - 따라서 나중에 first가 뒤늦게 더 작은 값으로 갱신되더라도, second와 n의 인덱스 순서(i < j < k)는 무조건 보장됨.
    */
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= first) {
                first = n; // 가장 작은 값 갱신
            } else if (n <= second) {
                second = n; // 두 번째로 작은 값 갱신 (first < n <= second)
            } else {
                // n이 first와 second보다 크면 조건(i < j < k 이고 nums[i] < nums[j] < nums[k]) 만족
                return true;
            }
        }

        return false;
    }
}
