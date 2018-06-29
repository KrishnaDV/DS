
public class Node1 {

	private int data;
	
	private Node1 next;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node1 getNext() {
		return next;
	}

	public void setNext(Node1 next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node1 [data=" + data + ", next=" + next + "]";
	}

	public Node1(int data) {
		super();
		this.data = data;
	}

	
}
