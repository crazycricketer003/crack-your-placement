package Math;

public class Missingnumber {
    Arrays.sort(nums);
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(k==nums[i]){
                k++;
            }
            else{
                return k; 
            }
            
        }
        return k;
}
