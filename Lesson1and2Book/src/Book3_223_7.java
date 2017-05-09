import java.util.Scanner;

public class Book3_223_7 {

	public static void main(String[] args) {
		// to binary with no loop
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a ^ b;
		
		int digit = 0;
		int mnojitel = 1;
		int number = 0;
		
		digit = c%2;                 //1
		c /= 2;
		number += digit*mnojitel;  
		digit = c%2;                 //2
		c /= 2;
		number += digit*mnojitel*10;
		digit = c%2;                 //3
		c /= 2;
		number += digit*mnojitel*100;
		digit = c%2;                 //4
		c /= 2;
		number += digit*mnojitel*1000;
		digit = c%2;                 //5
		c /= 2;
		number += digit*mnojitel*10000;
		digit = c%2;                 //6
		c /= 2;
		number += digit*mnojitel*100000;
		digit = c%2;                 //7
		c /= 2;
		number += digit*mnojitel*1000000;
		digit = c%2;                 //8
		c /= 2;
		number += digit*mnojitel*10000000;
		
		System.out.println(number);



sc.close();

	}

}
