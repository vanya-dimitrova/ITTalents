
public class KrasiMasivi {

	public static void main(String[] args) {
		
		int grade1 = 2;
		int grade2 = 2;
		int grade3 = 2;
		int grade4 = 5;
		int grade5 = 6;
		
		//{6,0,0,8,14}
		int[] grades = new int[5];//creates 5 variables of type int and value 0
		
		int[] grades2 = { 67,8,45,2,6,6,35,8,4,6,5,8,586,678,3 };
		
		System.out.println(grades2[6]);
		
		grades[0] = 6;
		grades[0]++;
		grades[3] = 8;
		grades[4] = grades[0] + grades[3];
		
		for(int i = 0; i < grades.length; i++){
			System.out.println(grades[i]);
		}
		
	}
	
}
