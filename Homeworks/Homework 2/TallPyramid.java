import java.util.Scanner;
// https://www.geeksforgeeks.org/programs-printing-pyramid-patterns-java/

public class TallPyramid {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		//Ask the user for number of rows
		System.out.println("How many rows does the pyramid have?");
		int rows = sc.nextInt();

		// Start counting the rows
		int count = 1;

		// i is equal to number of rows the user wants
		// while the number of rows is not equal to 0, keep running the for-loop
		for (int i = rows; i > 0; i--)
		{
			// Printing number of rows times 2 spaces at the beginning of each row
			// Meaning: if the user wants 10 rows, print 20 spaces in the first line
			// Then number of rows will be i--, meaning 9, so print 18 spaces
			// could have used System.out.printf %20d / %-20d and removed one of the for loops probably
			// complexity goes up n^by the number of nested loops

			for (int j = 1; j <= i*2; j++)
			{
				System.out.print(" ");
			}

			// Printing the left side of the triangle
			// j is a number beginning from the left side, starting at 1
			// with each run of the loop it prints 1 and then keeps adding +1 (or j++) until it reaches j<=current row count
			// Printing j value where j value will be from 1 to rowCount

			for (int j = 1; j <= count; j++) 			
			{
				System.out.print(j+" ");
			}

			// Exactly the mirror image of the for-loop above
			// Starting from the right side to the left side

			for (int j = count-1; j >= 1; j--)
			{ 				
				System.out.print(j+" "); 			
			} 			 			

			// Print a line after printing both sides of the lines
			System.out.println();
			
			// count of the rows increases by 1 to keep printing each line until it reaches
			// the row number specified by the user input
			count++;
		}
	}
}