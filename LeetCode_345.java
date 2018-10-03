class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int r = chars.length - 1;
        for (int i = 0; i <= r - 1; i++) {
            int l = i;
            char ch = chars[i];
            if (isVowels(ch)) {
                while (!isVowels(chars[r])) 
                    r--;
                char temp = chars[r];
                chars[r] = chars[l];
                chars[l] = temp;
                r --;
            }
        }
        return new String(chars);
    }

    private boolean isVowels(char ch) {
        return ch == 'a' || ch == 'A'
                || ch == 'e' || ch == 'E'
                || ch == 'i' || ch == 'I'
                || ch == 'o' || ch == 'O'
                || ch == 'u' || ch == 'U';
    }
}
