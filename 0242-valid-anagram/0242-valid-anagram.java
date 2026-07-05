class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[256];
        int [] arr2 = new int[256];
       if(s.length()!=t.length()){
        return false;
       }
       for(int i = 0;i<s.length();i++){
            arr[s.charAt(i)]++;
       }
       for(int j = 0;j<t.length();j++){
        arr2[t.charAt(j)]++;
       }
       for (int k = 0; k < 256; k++) {
    if (arr[k] != arr2[k]) {
        return false;
    }
}

return true;
       }
    }
