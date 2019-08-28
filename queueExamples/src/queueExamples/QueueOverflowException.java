package queueExamples;

public class QueueOverflowException extends Exception {
	private static final long serialVersionUID = 1L;

	QueueOverflowException(){
		super();
	}
	
	QueueOverflowException(String input){
		super(input);
	}
}
