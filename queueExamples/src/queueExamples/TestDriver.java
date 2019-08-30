package queueExamples;

public class TestDriver {
	public static void main(String[] args) throws QueueOverflowException {
		boolean result;
		try {
			result = testPalindromeWithQueue("anna");
			System.out.println(result);
		} catch (QueueUnderflowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static boolean testPalindromeWithQueue(String input) throws QueueUnderflowException, QueueOverflowException{
		char letter;
		char fromQueue;
		int size = input.length();
		ArrayBoundedQueue<Character> myQueue = new ArrayBoundedQueue<>(size);
		boolean stillPalindrome = true;
		
		for(int i = 0; i < size; i++) {
			letter = input.charAt(i);
			if(Character.isLetter(letter)) {
				myQueue.enqueue(letter);
			}
		}
		System.out.println(myQueue.toString());
		
		while(stillPalindrome) {
			stillPalindrome = false;
			for(int i = 0; i < size; i++) {
				letter = input.charAt(i);
				fromQueue = myQueue.dequeue();
				if(letter != fromQueue) {
					return false;
				}
			}
			
		}
		return true;
	}

}
