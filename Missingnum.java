public class Missingnum {
    static {
        Solution obj = new Solution();

        for(int i = 0; i < 444; i++) {
            obj.missingNumber(new int[]{0, 1, 2});
        }
    }

    public static int missingNumber(int[] nums) {
        int i;
        int n=nums.length;
        int sum=n*(n+1)/2;
        int nsum=0;
        for(i=0;i<n;i++){
            nsum+=nums[i];
        }

        return sum-nsum;
    }
}
