
public class Task5 {

	public static void main(String[] args) {
		
		
int[][] arr = {
	
	       {2, 5, 6, 8, 4},
				
               {5, 7, 8, 2, 4},
	
	       {6, 7, 1, 9, 3}
		       
              };

	      int sum = 0;
	
        	int sumFinal = 0;

		int counter = 0;
	
        	for(int i = 0; i < arr.length; i++){

		   for(int j = 0; j < arr.length; j++){

		      sum+=arr[i][j];
			
                   }
			
		
                	if(sum > sumFinal){

			sumFinal = sum;
	
			counter++;
	
			sum = 0;
	
		        }
		
                }
	
        	System.out.println("Red "+counter+" ima nai-goliama suma ot sbora na stoinostite.");
	
	

	}


 }
