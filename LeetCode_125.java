class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0)
            return true;
        s = s.toLowerCase();
        s = s.replace(" ","").replaceAll("[\\pP\\p{Punct}]","");
        int l = 0;
        int r = s.length() - 1;
        while(l <= r){
            char a = s.charAt(l);
            char b = s.charAt(r);
            if(a != b)
                return false;
            l ++;
            r --;
        }
        return true;
    }
}
