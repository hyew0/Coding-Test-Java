package leetcode;

public class LC_1732_FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int highAltitude = 0, before = 0;

        for (int i = 0; i < gain.length; i++) {
            int now = gain[i];
            before += now;

            if (highAltitude < before) {
                highAltitude = before;
            }
        }

        return highAltitude;
    }
}
