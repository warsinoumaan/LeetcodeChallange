class Solution {
    public int myAtoi(String s) {
int sign = 1;
int result = 0;
boolean numberstt = false;

        for(int i = 0;i<s.length();i++){
           char ch = s.charAt(i);

            if(!numberstt && ch==' '){
                continue;
            }if(!numberstt && (ch=='-'|| ch =='+' )){
                if(ch == '-'){
                    sign = -1;
                }else{
                    sign = 1;
                }
                numberstt = true;
                continue;
            }
            if(!Character.isDigit(ch)){
                break;
            }
            numberstt = true;
            int digit = ch - '0';

            if(result>Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && digit>7)){
               if(sign ==1){
                return Integer.MAX_VALUE;
               }else{
                return Integer.MIN_VALUE;
               }
            }

            result = result *10 + digit;


        }
        return sign * result;
    }
}