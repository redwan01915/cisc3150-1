//Question 5 (Chapter 4 has a similar problem in the book)
import java.util.Scanner;

public class RealTriangle{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Prompt the user to enter three points
		System.out.print("Enter three points: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		//Compute three sides
		double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		
		//Check to see if the points are collinear (on the same line)
		double line = (y3 - y2) * x1 + (x2 - x3) * y1 + (x3 * y2 - x2 * y3);
		
		if (line == 0)
			System.out.println("It is a fake triangle");
		else {
			
		//Adding up the angles
		if ((a+b>c) && (a+c>b) && (b+c>a))
		System.out.println("It is a real triangle");
		else // It will never come to this since we're inputting coordinates and not the sides
			System.out.println("It is a fake triangle");
		}
	}
}

/* Test Cases
 * (0,3) (4,5) (6,7)
 * (4.5,2.4) (5.5,7.1) (7.5,2.2)
 * For vertical line: (1,2) (1,3) (1,4)
 * For horizontal line: (1, 1) (2, 1) (3, 1)
 * For a diagonal line: (0,0) (2,2) (4,4)
 * It's impossible to get a fake triangle unless the points are on the same line
 * since we're not inputting the sides of the triangle but the coordinates.
 */