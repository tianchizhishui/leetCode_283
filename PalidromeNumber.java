class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        if (x <= 9) {
            return true;
        }
        
        int rev = 0; 
        while (x > rev) {
            rev = 10 * rev + x % 10;
            x /= 10;
        }
        if (x == rev || x == rev / 10) {
            return true;
        }
        return false;
    }
}