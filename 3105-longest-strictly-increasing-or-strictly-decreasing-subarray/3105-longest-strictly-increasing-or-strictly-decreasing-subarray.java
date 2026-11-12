class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        if(nums.length==0){
            return -1;
        }
        int curr = 1;
        int max = 1;
        int max2 = 1;
        int curr2 = 1;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                curr++;
            }else{
                curr = 1;
            }
            max = Math.max(curr , max);
        }

        for(int j = 0; j<nums.length-1;j++){
               if(nums[j]>nums[j+1]){
                curr2++;
            }else{
                curr2 = 1;
            }
            max2 = Math.max(curr2 , max2);
        }

        return Math.max(max , max2);

    }
}