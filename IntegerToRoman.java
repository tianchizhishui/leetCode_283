class Solution {
    public String intToRoman(int num) {
        int thousand = num / 1000;
        num = num % 1000;
        int hundred = num / 100;
        num = num % 100;
        int ten = num / 10;
        num = num % 10;
        int digit = num % 10;
        String res = "";
        
        if (thousand > 0) {
            for (int i = 0; i < (thousand); i++) {
                res = res + ('M'); 
            }
        }
        
        if (hundred > 0) {
            if (hundred < 4) {
                for (int i = 0; i < hundred; i++) {
                    res = res + ('C');
                }
            } else if (hundred == 4) {
                res = res + ("CD");
            } else if (hundred > 4 && hundred < 9) {
                res = res + ("D");
                for (int i = 0; i < (hundred - 5); i++) {
                    res = res + ('C');
                }
            } else {
                res = res + ("CM");
            }
        }
        
        if (ten > 0) {
            if (ten < 4) {
                for (int i = 0; i < ten; i++) {
                    res = res + ('X');
                }
            } else if (ten == 4) {
                res = res + ("XL");
            } else if (ten > 4 && ten < 9) {
                res = res + ("L");
                for (int i = 0; i < (ten - 5); i++) {
                    res = res + ('X');
                }
            } else {
                res = res + ("XC");
            }
        }
        
        if (digit > 0) {
            if (digit < 4) {
                for (int i = 0; i < digit; i++) {
                    res = res + ('I');
                }
            } else if (digit == 4) {
                res = res + ("IV");
            } else if (digit > 4 && digit < 9) {
                res = res + ("V");
                for (int i = 0; i < (digit - 5); i++) {
                    res = res + ('I');
                }
            } else {
                res = res + ("IX");
            }
        }
        return res;
    }
}