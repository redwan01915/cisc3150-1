public class Nqueens {

	public static boolean checkConsistency(int[] q, int n) {
		for (int i = 0; i < n; i++) {
			if (q[i] == q[n] || (q[i] - q[n]) == (n - i) || (q[n] - q[i]) == (n - i))
				return false;
		}
		return true;
	}

	public static void printQueens(int[] q) {
		for (int i = 0; i < q.length; i++) {
			for (int j = 0; j < q.length; j++) {
				if (q[i] == j) 
					System.out.print("Q ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}  
		System.out.println();
	}


	public static void nQueens(int n) {
		nQueensArray(new int[n], 0);
	}

	public static void nQueensArray(int[] q, int k) {

		if (k == q.length) printQueens(q);
		else {
			for (int i = 0; i < q.length; i++) {
				q[k] = i;
				if (checkConsistency(q, k)) nQueensArray(q, k+1);
			}
		}
	}  


	public static void main(String[] args) {
		nQueens(10);
		// Using Ecliple it might not print the first loop properly if nQueens is 10 or above
		// Using the Terminal (on a Mac OS) prints it perfectly
	}

}
