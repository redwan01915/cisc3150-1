import java.util.Scanner;

public class Calendar {
	private static final String WEEKDAYS = "Su Mo Tu We Th Fr Sa";
	
	public static void main(final String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What year is it?");
		int year = sc.nextInt();

		System.out.println("Which day of the week is January 1st?\nEnter:\n0 for Sunday\n1 for Monday\n2 for Tuesday\n3 for Wednesday\n4 for Thursday\n5 for Friday\n6 for Saturday");
		int startDay = sc.nextInt();
		int spaces = startDay;

		// name of each month for printing
		// making months[1] = January
		String[] months = {
				"","January", "February", "March",
				"April", "May", "June",
				"July", "August", "September",
				"October", "November", "December"
		};

		// days[i] = number of days in a month found here:
		// https://www.timeanddate.com/calendar/months/
		// by default, February is not a leap year
		
		int[] days = {
				0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
		};

		for (int currentMonth = 1; currentMonth <= 12; currentMonth++) {

			// Leap Year Algorithm
			// https://en.wikipedia.org/wiki/Leap_year#Algorithm
			// If this year is indeed a leap year, then change the days of February days[2] to equal 29 days
			
			if  ((((year % 4 == 0) && (year % 100 != 0)) ||  (year % 400 == 0)) && currentMonth == 2)
				days[currentMonth] = 29;

			// Display the month and year according to the homework format
			System.out.println("   "+ months[currentMonth] + " " + year + "\n" + WEEKDAYS);

			// Take the previous month and add the beginning of the week from user input (startDay)
			// Then find the remainder of that number when dividing by 7
			// Make that number the spacing 
			spaces = (days[currentMonth-1] + spaces)%7;

			// Printing the actual calendar
			
			// Find the amount of spaces needed to print the first line
			for (int i = 0; i < spaces; i++)
				System.out.print("   ");
			
			// Print out the actual days with the proper spacing
			for (int i = 1; i <= days[currentMonth]; i++) {
				System.out.printf("%2d ", i);
				if (((i + spaces) % 7 == 0) || (i == days[currentMonth])) System.out.println();
			}

			System.out.println();
		}
	}
}