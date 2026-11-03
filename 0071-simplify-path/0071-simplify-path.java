class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();

        String [] arr = path.split("/");
            for(String part : arr){

                if(part.isEmpty()){
                    continue;
                }
                else if(part.equals(".")){
                    continue;
                }

                else if(part.equals("..") && s.isEmpty()){
                    continue;
                }
                else if(part.equals("..") && !s.isEmpty()){
                    s.pop();
                }else{
                    s.push(part);
                }
            }


         if(s.isEmpty()){
            return "/";
         }

   StringBuilder sb = new StringBuilder();
       for(String x : s){
        sb.append("/");
        sb.append(x);
       }

       if(sb.length()==0){
        return "/";
       }else{
        return  sb.toString();
       }

            }
}