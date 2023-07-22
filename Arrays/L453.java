public class L453 {
        
    
    
    

   // 453. Minimum Moves to Equal Array Elements

        

    int min_value=nums[0];
    for(int i=1; i<nums.length; i++)
        min_value=Math.min(min_value, nums[i]);

    int result=0;
    for(int i=0; i<nums.length; i++)
        result+=nums[i]-min_value;

    return result;
}
