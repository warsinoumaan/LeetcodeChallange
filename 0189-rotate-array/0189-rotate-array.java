class Solution {
    public static void rev(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    public  void rotate(int[] nums, int k) {
      int n  = nums.length;
      k = k%n;
       rev(nums,0, nums.length-1);
       rev(nums,k,nums.length-1);
       rev(nums,0,k-1);
       
    }
}