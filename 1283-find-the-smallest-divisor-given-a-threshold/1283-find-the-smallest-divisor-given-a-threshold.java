class Solution {
    public int smallestDivisor(int[] nums, int threshold) {  
   
    int result =1 ;
     int min = 1;
     int max = nums[0];
    for (int num : nums) {
    if (num > max) {
        max = num;
    }
}


while(min<=max){
     int sum = 0;
int mid = min + (max - min) / 2;
    for(int num : nums){
      result =  (num + mid - 1) / mid;
        sum = sum + result;
    }

    if (sum > threshold) {
    min = mid + 1;
    } else {
    max = mid - 1;
}

}
return min;


    }
}