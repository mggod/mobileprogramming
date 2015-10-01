package kr.ac.kookmin.lab01;

public class MyStack {
	
	int stackSize = 5;
	int stack[] = new int[stackSize];
	int top;
	
	MyStack() {
		top = -1;
	}
	
	boolean isFull() {
		if(top == stackSize - 1)
			return true;
		else
			return false;
	}

	boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	
	void push(int num) {
		if(isFull() == true)
			System.out.println("Stack is full!");
		else {
			stack[++top] = num;
			System.out.println(stack[top] + " is pushed!");
		}
	}
	
	void pop() {
		if(isEmpty() == true)
			System.out.println("Stack is empty!");
		else {
			System.out.println(stack[top] + " is popped!");
			--top;
		}
	}
	
	void displayStack() {
		for(int i = 0; i <= top; i++) {
			System.out.print("[" + stack[i] + "] ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStack st = new MyStack();
		
		st.pop();
		st.push(1);
		st.displayStack();
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.displayStack();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.displayStack();
		
	}
}