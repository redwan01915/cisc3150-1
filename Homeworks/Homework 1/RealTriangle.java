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
		
		//Adding up the angles
		if ((a+b>c) && (a+c>b) && (b+c>a))
		System.out.println("It is a real triangle");
		else 
			System.out.println("It is a fake triangle");
	}
}

/* Test Cases
 * (0,3) (4,5) (6,7)
 * (4.5,2.4) (5.5,7.1) (7.5,2.2)
 * It's impossible to get a fake triangle since we're not inputting the
 * sides of the triangle but the coordinates.
 */