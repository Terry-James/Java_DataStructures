package stackExamples;

public class StackUnderflowException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	StackUnderflowException(){
		super();
	}
	
	StackUnderflowException(String message){
		super(message);
	}
}
