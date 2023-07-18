public class MoveZeros {
    int j=0; //0 1 0 3 12 

    for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            int a=nums[j];
            nums[j]=nums[i];
            nums[i]=a;
            j++;

        }
    }
}
