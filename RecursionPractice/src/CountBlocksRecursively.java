
public class CountBlocksRecursively {

	public static void main(String[] args) {
		// Count Blocks Recursively
		
		int a = 8;
		System.out.println(countBlocks(a));

	}
	static int countBlocks(int a){
		if(a == 1){
			return 1;
		}
		return countBlocks(a - 1) + a; 
		
	}
	
	

}
