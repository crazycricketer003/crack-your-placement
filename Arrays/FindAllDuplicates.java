import java.util.ArrayList;
import java.util.HashMap;

public class FindAllDuplicates {
     HashMap<Integer,Integer> hm=new HashMap<>();

        ArrayList<Integer> l =new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }
            else{
                l.add(nums[i]);
            }
        }
        return l;
}
