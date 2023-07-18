package Strings;

import java.util.Stack;

public class L28 {
    if(haystack.equals(needle))
    return 0;
for(int i=0;i<=haystack.length()-needle.length();i++){
    if(haystack.substring(i,i+needle.length()).equals(needle))
        return i;
}
return -1;

}
