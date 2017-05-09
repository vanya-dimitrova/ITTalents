
public class KrasiArrays2d {

	public static void main(String[] args) {
		
		int x = 6;//creates 1 variable of type int
		//{0,7,0,0}
		int[] arr = new int[4];//creates 4 variables of type int
		arr[1] = 7;
		//{  0 1 2 3 
		//0	{1,0,0,0},
		//1	{0,0,3,0},
		//2	{0,0,0,1},
		//3	{0,8,0,0},
		//4	{0,0,0,0} 
		//}
		int[][] arr2d = new int[5][4];//creates 5 variables of type array, each with 4 variables of type int
		
		arr2d[1][2] = 3;
		arr2d[3][1] = 8;
		arr2d[2][3] = arr2d[3][1] - arr[1];
		arr2d[0][0] = arr[1] - x;
	}
}
