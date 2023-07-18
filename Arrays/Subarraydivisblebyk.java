public class Subarraydivisblebyk {
    //  int count = 0;
//         for(int i = 0;i<nums.length;i++){
//             int t = nums[i];
//             if(t%k==0) count++;
//             for(int j = i+1;j<nums.length;j++){
//                 t+=nums[j];
//                 if(t%k==0) count++;
//             }
//         }
//         return count;
    // int sum = 0, count = 0;
    //     int[] rem = new int[K];
    //     for (int i = 0; i < A.length; ++ i) {
    //         sum += A[i];
    //         if (sum % K == 0)
    //             ++ count;
    //         count += rem[(sum % K + K) % K] ++;
    //     }

    //     System.out.println(Arrays.toString(rem));
    //     return count;
     

    int result = 0;
    for (int i =0; i < A.length;i++){
        int j = i;
        int sum = 0;
        while (j < A.length){
            sum += A[j];
            j++;
            if (sum % K == 0){
                result++;
                sum = 0;
            }
        }
        
    }
    return result;
  
}
