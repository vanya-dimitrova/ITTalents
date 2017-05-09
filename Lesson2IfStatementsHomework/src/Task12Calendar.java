import java.util.Scanner;

public class Task12Calendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("To check next date");
		System.out.print("Type date:");
		int date = sc.nextInt();
		System.out.print("Type month:");
		int month = sc.nextInt();
		System.out.print("Type year:");
		int year = sc.nextInt();
		System.out.println("");

		int leapYear;
		if (year % 4 == 0 || year % 400 == 0) {
			leapYear = year;
		} else {
			leapYear = 0;
		}

		if (date < 1 || date > 31) {
			System.out.println("This is not a valid date!");
		} else if (date > 28 && month == 02 && leapYear == 0) {
			System.out.println("This is not a valid date!");
		} else if (date > 30 && month == 2 || month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("This is not a valid date!");
		} else if (year < 0 || month < 1 || month > 12) {
			System.out.println("This is not a valid date!");
		} else {
			System.out.println("Next date is: ");
		}
		
		if (date == 28 && month == 2 && leapYear == year){
			System.out.println("29/02/"+year);
		} else if (date == 28 && month == 2 && leapYear == 0 && year >=0){
			System.out.println("01/03/"+year);
		} else if (date == 29 && month == 2 && year >=0){
			System.out.println("01/03/"+year);			
		} else if (date == 30 && (month == 4 || month == 6 || month == 9 || month == 11) && year >=0){
			System.out.println("1/"+(month+1)+"/"+year);
		} else if (date == 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && year >= 0){
			System.out.println("1/"+(month+1)+"/"+year);
		} else if (date == 31 && month == 12 && year >= 0){
			System.out.println("1/1/"+(year+1));
		} else{
			System.out.println((date+1)+"/"+month+"/"+year);
		}
		sc.close();

	}

}
