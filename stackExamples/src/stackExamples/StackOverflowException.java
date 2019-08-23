package stackExamples;

public class StackOverflowException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	StackOverflowException(){
		super();
	}
	StackOverflowException(String message) {
		super(message);
	}
}
