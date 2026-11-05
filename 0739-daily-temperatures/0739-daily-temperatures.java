class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

int [] ans = new int[temperatures.length];        
        
Stack<Integer> s = new Stack<>();

for(int i = 0; i< temperatures.length ;i++ ){


 while(!s.isEmpty()&&temperatures[i]>temperatures[s.peek()]){
    int prevday = s.pop();
    ans[prevday] = i - prevday;
 }
 s.push(i);

}

return ans;

    }
}