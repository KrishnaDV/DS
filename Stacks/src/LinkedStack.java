import java.util.EmptyStackException;

public class LinkedStack {

	int length;

	Node top;

	public Node getTop() {
		return top;
	}

	public void setTop(Node top) {
		this.top = top;
	}

	public LinkedStack() {
		

		length = 0;

		top = null;

	}

	public void push(int data) {

		Node temp = new Node(data);

		temp.setNext(top);

		top = temp;

		length++;

	}

	public int pop() {

		if (isEmpty()) {

			throw new EmptyStackException();
		}

		int res = top.getData();

		top = top.getNext();

		return res;

	}

	public boolean isEmpty() {

		if (length == 0) {

			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		return "LinkedStack [top=" + top + "]";
	}

	public int peek() {

		int res = top.getData();

		return res;

	}

	public int size() {

		return length;
	}

}
