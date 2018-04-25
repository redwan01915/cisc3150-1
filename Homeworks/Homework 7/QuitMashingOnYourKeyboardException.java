public class QuitMashingOnYourKeyboardException extends IllegalArgumentException {
	private String message;

	public QuitMashingOnYourKeyboardException() {
		System.out.println("An Illegal operation was performed.");
	}

	public QuitMashingOnYourKeyboardException(String message) {
		System.out.println("An Illegal operation was performed.");
		this.message = message;
	}

	public String toString() {
		String string = new String();
		string += message;
		return string;
	}
}