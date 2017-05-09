import java.util.Scanner;

public class Book8_235_4 {

	public static void main(String[] args) {
		// days in a month method
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter month(january):");
		String month = sc.nextLine();
		System.out.println("Enter year{2017):");
		int year = sc.nextInt();
		
		System.out.println(month+"/"+year+" is "+showDaysInMonth(month, year)+" days.");
		sc.close();
	}
	static int showDaysInMonth(String month, int year){
		boolean leapYear = false;
		if((year%4 == 0 && year%100 != 0) ||year% 400 == 0){
			leapYear = true;
		}
		int days = 0;
		switch (month){
		case "January":
		case "March":
		case "May":
		case "July":
		case "August":
		case "October":
		case "December":
			days = 31;
			break;
		case "February":
			if(leapYear){
			days = 29;
			}
			else{
				days = 28;
			}
			break;
		case "April":
		case "June":
		case "September":
		case "November":
			days = 30;
			break;
		}
			
			return days;
		
		}

}
