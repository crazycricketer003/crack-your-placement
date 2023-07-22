package Geeks;

import java.util.HashSet;
import java.util.Set;

public class SubArraysumequals0 {
    Set<Integer> list = new HashSet<Integer>();
        
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            
            if(arr[i] == 0 || sum==0 || list.contains(sum)){
                return true;
            }
            
            list.add(sum);
        }
        
        return false;
}
