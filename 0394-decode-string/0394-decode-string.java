class Solution {
    public String decodeString(String s) {

        int num = 0;
        StringBuilder curr = new StringBuilder();

        Stack<Integer> cs = new Stack<>();
        Stack<StringBuilder> ss = new Stack<>();

        for(char ch : s.toCharArray()){
             if(Character.isDigit(ch)){
                num = num*10 + (ch-'0');
             }else if(ch == '['){
                cs.push(num);
                ss.push(curr);
                num = 0;
                curr = new StringBuilder();
             }else if(ch ==']'){
                int repeatcount = cs.pop();
                StringBuilder prev = ss.pop();
               for(int i = 1; i<= repeatcount;i++){
                prev.append(curr);
               }
              curr = prev;


             }else{
                curr.append(ch);
             }
        }
        
        return curr.toString();
    }
}