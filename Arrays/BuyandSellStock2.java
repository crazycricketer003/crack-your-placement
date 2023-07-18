public class BuyandSellStock2 {
    int sum=0;
    int a=0;
    for(int i=1;i<arr.length;i++){
        if(arr[i-1]<arr[i]){
            a=arr[i]-arr[i-1];
            sum+=a;
        }
    }
    return sum;
}
