package queueExamples;

public class QueueUnderflowException extends Exception {
	private static final long serialVersionUID = 1L;

	QueueUnderflowException(){
		super();
	}
	
	QueueUnderflowException(String input){
		super(input);
	}
}
