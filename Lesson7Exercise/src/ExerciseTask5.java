

public class ExerciseTask5 {

	public static void main(String[] args) {
		
		
         int[][] arr = {
	                    {2, 5, 6, 8, 14},
                        {5, 7, 8, 2, 4},
	                    {6, 7, 1, 9, 3}
                       };
	     int sum = 0;
         int sumFinal = 0;
		 int counter = 0;
		 int rowMaxSum = 0;
         for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < 5; j++){
		      sum+=arr[i][j];
            }
			counter++;
           	if(sum > sumFinal){
               sumFinal = sum;
			   rowMaxSum = counter;
	        }
           	sum = 0;
         }
	  	System.out.println("Red "+rowMaxSum+" ima nai-goliama suma ot sbora na stoinostite.");
	
	

	}


 }

