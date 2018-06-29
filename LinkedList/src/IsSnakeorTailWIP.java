public class IsSnakeorTailWIP {

	public static void main(String[] args) {

		Node n = new Node("hi");

		Node n1 = new Node("Hello");

		Node n2 = new Node("ram");

		Node n3 = new Node("vishal");

		n.setNext(n1);

		n1.setNext(n2);

		n2.setNext(n3);

		n3.setNext(n2);

		Node res = isSnakeorTail(n);

		System.out.println(res);

	}

	private static Node isSnakeorTail(Node n) {

		Node sptr = n;

		Node fptr = n;

		boolean loop = false;

		while (fptr != null && fptr.getNext() != null) {

			fptr = fptr.getNext().getNext();

			sptr = sptr.getNext();

			if (sptr == fptr) {
  
				loop = true;

				break;
				
			}

		}
		if (loop) {
			
			sptr = n;
			
			while (sptr != fptr) {
				
				sptr = sptr.getNext();
				
				fptr = fptr.getNext();
			
			}
			
			//System.out.println(fptr);
			return fptr;
		}

		return null;

	}
}
