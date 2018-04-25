public class AlgebraFailException extends IllegalArgumentException {
	private String message;

	public AlgebraFailException() {
		System.out.println("AlgebraFailException was thrown.");
	}

	public AlgebraFailException(String message) {
		System.out.println("AlgebraFailException was thrown.");
		this.message = message;
	}

	public String toString() {
		String temp = new String();
		temp += message;
		return temp;
	}
}