class Solution {
    public int mySqrt(int x) {
        int ans=0;
        int low=1;
        int high=x;
        while(high>=low){
            while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid <= x / mid) {
                ans = mid;       
                low = mid + 1;    
            } 
            else {
                high = mid - 1;  
            }
        }
        }
        return ans;
    }

    public void missingNumber(int[] is) {
        throw new UnsupportedOperationException("Unimplemented method 'missingNumber'");
    }
}
