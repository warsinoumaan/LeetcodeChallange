class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else{
            if(ch==stack.peek()){
                stack.pop();
            }else{
                stack.push(ch);
            }
            }
        }

        String str = "";
        while(!stack.isEmpty()){

            str = stack.pop() +str;
        }
        
        return str;
    }
}