class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = weights[0];
        int min = weights[0];
        int currload= 0;
        int currday = 1;
        for (int w : weights) {
            min = Math.max(min, w);
            max += w;
        }
     
      while(min<=max){
        int mid = min + (max-min)/2;
        for(int num : weights){
            if(currload+num<=mid){
                currload = num + currload;

            }else{
                      currday++;
                      currload =num;
            }
        }
            if(currday<=days){
                max = mid-1;
            }else{
                min = mid+1;
            }
        currday = 1;
        currload = 0;
      }
      return min;
        
    }
}