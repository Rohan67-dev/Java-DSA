public class neithermaxnormin {
    public int findNonMinOrMax(int[] nums) {
        int n=nums.length;
        int i,max=0,min=0,a=-1;
        if(n<3){
            return -1;
        }
        else {

            for(i=0; i<n; i++){

                if(nums[i] > max){
                    max = nums[i];
                }
            }
            min=nums[1];
            for(i=0; i<n; i++){
                if(nums[i] <min){
                    min = nums[i];
                }
            }


            for(i=0; i<n; i++){

                if(nums[i] < max && nums[i] > min){
                    a = nums[i];
                    break;
                }
            }
        }

        return a;
    }
    
}
