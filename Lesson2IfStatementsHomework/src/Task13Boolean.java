import java.util.Scanner;

public class Task13Boolean {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Are you curious how it looks like outside?");
		System.out.println("");
		System.out.println("Please enter temperature value:");
		int temp = sc.nextInt();
		if (temp < -100 || temp > 100){
			System.out.println("Get out of here :) Please enter the real temperature value!");
			temp = sc.nextInt();
		} 
		if (temp <= -20){
			System.out.println("No way! It is so deeply freezing! Men should not go out!");
		} else if (temp > -20 && temp < 0){
			System.out.println("Brrr...It is freezing! Get your scarf and hat!");
		} else if (temp > 0 && temp < 15){
			System.out.println("Well, it is chilly! Don't forget your coat!");
		} else if (temp > 15 && temp <25){
			System.out.println("Nice! It is warm enough! Go out and enjoy!");
		} else if (temp > 25){
			System.out.println("Wow! It is melting hot! Are you sure you want to go out?");
		}
		sc.close();
		

	}

}
