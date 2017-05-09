
public class Task8 {

	public static void main(String[] args) {
		
		boolean[][] arr = {
			        	{false, false, true},
				        {true, true, false},
				        {true, true, false}
		              };
		
		boolean gotTrue = false;
		for(int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr.length; j++) {
				if((i+j) <= (arr.length -2) && arr[i][j] == true){
					gotTrue = true;
					break;
			    }
			}
		}
	System.out.println(gotTrue ? "Ima stoinost true nad vtoria diagonal" : "Niama stoinost true nad vtoria diagonal.");


			
}
}

