import java.util.Scanner;

public class TokenizeCSV {
	public static void main(String args[]){

		Scanner input = new Scanner(System.in).useDelimiter(",\\s");
		System.out.println("Please enter words separated by comma and ending with a comma");

		// Because the Scanner is not done reading System.in: the stream is not closed, 
		// and still waiting for end of token (next occurrence of ", "), or end of stream
		// So the user has to use a comma instead of a period to end their sentence
		
		
		while(input.hasNextLine()){
			System.out.println(input.next());

		}
		input.close();
	}
}
