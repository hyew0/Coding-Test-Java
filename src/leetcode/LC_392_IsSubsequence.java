package leetcode;

public class LC_392_IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;

        int  sLoc=0;
        char sPointer = s.charAt(sLoc);

        for (int tLoc = 0; tLoc < t.length(); tLoc++){
            if (sPointer == t.charAt(tLoc)){
                sLoc++;

                if (sLoc == s.length()){
                    return true;
                }

                sPointer = s.charAt(sLoc);
            }
        }

        return false; //끝까지 못찾았으면 false
    }
}
