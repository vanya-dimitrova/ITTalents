
public class Task9MultificationLastNumber {

	public static void main(String[] args) {
		
		int a = 6;
		int b = 2;
		int c = 8;
		int d = 3;
		int lastDigit;
		System.out.println((a*10+b)+"*"+(c*10+d)+"="+(a*10+b)*(c*10+d));
		System.out.print("The last digit is ");
		if (b*d==1 || b*d==21 || b*d==81){
		    lastDigit = 1;
			System.out.print(lastDigit);
		} else if (b*d==2 || b*d==32 || b*d==42 || b*d==72){
			lastDigit = 2;
			System.out.print(lastDigit);	
		} else if (b*d==3 || b*d==63){
			lastDigit = 3;
			System.out.print(lastDigit);
		} else if (b*d==4 || b*d==24 || b*d==54 || b*d==64){
			lastDigit = 4;
			System.out.print(lastDigit);
		} else if (b*d==5 || b*d==15 || b*d==25 || b*d==35 || b*d==45){
			lastDigit = 5;
			System.out.print(lastDigit);
		} else if (b*d==6 || b*d==16 || b*d==36 || b*d==56){
			lastDigit = 6;
			System.out.print(lastDigit);
		} else if (b*d==7 || b*d==27){
			lastDigit = 7;
			System.out.print(lastDigit);
		} else if (b*d==8 || b*d==18 || b*d==28 || b*d==48){
			lastDigit = 8;
			System.out.print(lastDigit);
		} else if (b*d==9 || b*d==49){
			lastDigit = 9;
			System.out.print(lastDigit);
		} else { 
			lastDigit = 0;
			System.out.print(lastDigit);
		}
		if (lastDigit%2 == 0){
			System.out.print(" - chetno chislo");
		} else {
			System.out.print(" - nechetno chislo");
		}
		
			
		
		

	}

}
