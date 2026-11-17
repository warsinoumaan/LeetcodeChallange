class Solution {
    public String removeKdigits(String num, int k) {
    Stack<Character> s =  new Stack<>();
    StringBuilder sb = new StringBuilder();
    for(char ch : num.toCharArray()){
      while(!s.isEmpty() &&  k>0 && s.peek()> ch){
        s.pop();
        k--;

             }
     s.push(ch);
  }

  while(k>0 && !s.isEmpty()){
    s.pop();
    k--;
  }

for(char c : s ){
    sb.append(c);
}



    int  index = 0;
while(index<sb.length()&& sb.charAt(index)=='0'){
    index++;
}
String result = sb.substring(index);

if(result.length()==0){
    return "0";
}else{
    return result;
}

    }
}