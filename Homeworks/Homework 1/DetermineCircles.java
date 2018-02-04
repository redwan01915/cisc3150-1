//Question 6
import java.util.Scanner;

public class DetermineCircles {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// Prompt the user to enter coordinates of the center and radius of the circle
		System.out.print("Type center coordinates and then the radius of the first circle: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double r0 = input.nextDouble();
		System.out.print("Type center coordinates and then the radius of the second circle: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();

		double distance = Math.sqrt((x0 - x1) * (x0 - x1) + (y0 - y1) * (y0 - y1));
		if (r1 >= r0 && distance <= (r1 - r0)){
			System.out.println("Circle 1 is inside Circle 2.");
		}
		else if (r0 >= r1 && distance <= (r0 - r1) ) {
			System.out.println("Circle 2 is inside Circle 1.");
		}
		else if (distance > (r0 + r1)){
			System.out.println("Circles are separate.");
		}
		/* Find the distance between the centers.
		 * Add the radii. If the result is the same, then the circles touch externally 
		 */
		else if (distance == (r0 + r1)){
			System.out.println("Circles are touching externally.");
		}
		else {
			System.out.println("Circles overlap.");}
	}				
}
/*
Test cases:
Separate: (6,6) r 3; (0,10) r 3
Within: (2,0) r 4; (2,0) r 2; Reverse the input order to see which circle is inside which
Overlapping: (2,2) r 2; (6,0) r 3
Touching Externally: (1,0) r 2; (5,0) r 2
*/