
 
public class BunnyEarsCountingRecursively {
 
    public static void main(String[] args) {
        // bunny ears counting recursively
    	
    	int n = 5;
    	System.out.println(countEars(n));
         
         
    }
    static int countEars(int n){
    	int sum = 0;
    	if(n == 1){
    		return 2;
    	}

    	sum+=countEars(n - 1);
    	if(n%2 == 0){
    		return sum + 3;
    	}
    	else{
    		return sum + 2;
    	}

    	
    }
    
 
}