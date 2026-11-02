class Solution {
    public int longestValidParentheses(String s) {
       //left to right
       int open = 0;
       int close = 0;
       int valid = 0;
       int max1 = 0;
       for(int i =0;i<s.length();i++){
        if(s.charAt(i)=='('){
            open++;
            
        }else{
            close++;
        }

      if(open==close){
               valid = open*2;
               max1 = Math.max(max1,valid);
            }else if(open<close){
                open=0;
                close= 0;
            }

       }

       //right to left
       int max2 = 0;
       open = 0;
       close = 0;
       valid = 0;

       for(int i = s.length()-1;i>=0;i--){
          if(s.charAt(i)==')'){
            close++;
            
        }else{
           open++;
        }

        if(open==close){
               valid = close*2;
               max2 = Math.max(max2,valid);
            }else if(close<open){
                open=0;
                close= 0;
            }


       }

       int max = 0;
       max = Math.max(max1,max2);
       return max;
        
    }
}