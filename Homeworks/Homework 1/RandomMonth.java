//Question 3
public class RandomMonth {
	public static void main(String[] args) {

		//This generates numbers from 0-11 and then adds 1 to make it values between 1 and 12
		int n = (int)(Math.random()*12)+1;

		/* Another random 
		Random rand = new Random();
		int  n = rand.nextInt(12) + 1;
		// "generates an integer between 1 & 12", I'm guessing 1 and 12 is inclusive
		 */
		
		System.out.print("Random number is: " + n + ", Month of ");
		switch (n){
		case 1: System.out.println("January"); break;
		case 2: System.out.println("February"); break;
		case 3: System.out.println("March"); break;
		case 4: System.out.println("April"); break;
		case 5: System.out.println("May"); break;
		case 6: System.out.println("June"); break;
		case 7: System.out.println("July"); break;
		case 8: System.out.println("August"); break;
		case 9: System.out.println("September"); break;
		case 10: System.out.println("October"); break;
		case 11: System.out.println("November"); break;
		case 12: System.out.println("December"); break;
		}		
	}
}