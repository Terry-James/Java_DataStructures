package stackExamples;

public class TestDriver {
	public static void main(String[] args) {
		//testStackArray();
		testStackArrayList();
	}
	
	//A method to test that the StackArray class is working properly.
	public static void testStackArray() {
		StackArray<String> stack = new StackArray<>();
		
		stack.push("Tom");
		stack.push("Chris");
		stack.push("Jerry");
		stack.push("Terry");
		stack.push("John");
		stack.push("Sarah");
		
		System.out.println(stack.top());// should remove Sarah and return
		stack.pop(); // should remove John but not return
		System.out.println(stack.top()); // should remove Terry and return
	}

	public static void testStackArrayList() {
		StackArrayList<String> stackList = new StackArrayList<>();
		
		stackList.push("Tom");
		stackList.push("Chris");
		stackList.push("Jerry");
		stackList.push("Terry");
		stackList.push("John");
		stackList.push("Sarah");
		
		System.out.println(stackList.top());// should remove Sarah and return
		stackList.pop(); // should remove John but not return
		System.out.println(stackList.top()); // should remove Terry and return
		
	}
}
