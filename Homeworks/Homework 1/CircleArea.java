//Question 2
import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {

		final double PI = 3.14159;
		double radius;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius, separated by space: ");

		while(input.hasNextDouble()){
			radius = input.nextDouble();
			System.out.println("Area of the circle is with the radius of " + radius + " is: " + PI*Math.pow(radius, 2));
		}

		//formula PI*r^2
		//Ctrl-D ends the program on a Mac using Terminal
	}
}