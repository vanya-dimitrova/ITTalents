
public class MultiplyOddsRecursionMilen {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr={3,5,7,9,8,7,4,6,3,5,9,7,3,11,10,13};
        int x=3;
        System.out.println(powerOdds(arr,x,0,1));
 
    }
    static int powerOdds(int[] arr, int x, int i, int sum){
        if(i==arr.length){
            return sum;
        }
        if(arr[i]>x && arr[i]%2==1){
            sum*=arr[i];
        }
        return powerOdds(arr, x, i+1, sum);
    }
 
}