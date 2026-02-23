public class perfectsquare {
    public boolean isPerfectSquare(int num) {
        if(num==1||num==0)
            return true;
        int low=1;
        int high=num;
        while(low<=high)
        {
            int mid = low + (high - low) / 2;
            if (mid == num / mid && num % mid == 0)
                return true;
            if (mid < num / mid)
                low = mid + 1;  
            else
                high = mid - 1; 
        }  
        return false;
    }
}
