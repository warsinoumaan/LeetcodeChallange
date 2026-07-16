class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length-1;
        int min = 1;
        int width = 0;
while(i<j){
    min = Math.min(height[i], height[j]);
    width = j-i;
    int area = width*min;
     maxArea = Math.max(area,maxArea);
    if(height[i]<=height[j]){
        i++;
    }else{
        j--;
    }
}    

return maxArea;

    }
}