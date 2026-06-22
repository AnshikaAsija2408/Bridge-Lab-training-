package Review4;

class Solution2 {
    public int countSegments(String s) {
        int count = 0;
        if (s.isEmpty())
            return 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' '))
                count++;
        }
        return count;
    }
}