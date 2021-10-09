import java.util.Scanner;

public class CheckId {

	public static void main(String[] args) {
		int date;
	    int month;
	    int year;
	    System.out.println(" Please enter the birth date month and year below");
	    Scanner input = new Scanner(System.in);
	    date=input.nextInt();
	    month=input.nextInt();
	    year=input.nextInt();
	    System.out.println(" Please enter the birth date month and year below");
	    System.out.println("\n Please enter the date"+date);
	    System.out.println("\n Please enter the month in numbers"+month);
	    System.out.println("\n Please enter the year"+year);
	    
	    if(date<=26 && month<=9 && year<=2002) {
System.out.println("The ID is OK,Pearson is allowed to buy smoke");

	}
	    else {
	    	System.out.println("The person is not allowed to buy smoke");
	    }
	}
	}
