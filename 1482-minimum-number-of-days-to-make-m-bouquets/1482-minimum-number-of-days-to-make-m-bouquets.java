class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
         if ((long) m * k > bloomDay.length)
            return -1;


        int min = bloomDay[0];
        int max = bloomDay[0];
           
int bouquets = 0;
int adj = 0;
for (int i = 1; i < bloomDay.length; i++) {
    if( bloomDay[i] > max) {
        max = bloomDay[i];
    }

    if ( bloomDay[i] < min) {
        min = bloomDay[i];
    }
}

while(min<max){
   int mid = min + (max - min) / 2; 
     bouquets = 0;  
     adj = 0; 
   for(int day : bloomDay){
    if(day<=mid){
        adj++;
        if(adj==k){
            bouquets++;
            adj=0;
        }
    }else{
        adj=0;
    }
   }
    if(bouquets>=m){
        max = mid;
    }else{
       min = mid+1;
    }
   
}


   return min;



    }
}