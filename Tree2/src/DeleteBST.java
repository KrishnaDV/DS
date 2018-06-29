// Leetcode solution Working correct

public class DeleteBST {
	public Tree deleteNode(Tree root, int key) {

		if (root == null) {
			return null;
		}
		
		// key is in left sub-tree
		
		if (key < root.getData()) {

			root.setLeft(deleteNode(root.getLeft(), key));
			
		} 
		
		// key is in right sub-tree
		else if (key > root.getData()) {
			
			root.setRight(deleteNode(root.getRight(), key));
		} 
		
		// key is found.
		else {
		
			// key has one or no children. 
			if (root.getLeft() == null) {
			
				return root.getRight();
			} 
			
			else if (root.getRight() == null) {
			
				return root.getLeft();
			}

			// Tree has 2 children. So find inorder successor and replace it with root.
			Tree minNode = findMin(root.getRight());
			
			root.setData(minNode.getData());
			
			// Delete the successor element
			root.setRight(deleteNode(root.getRight(), root.getData()));
		}
		return root;
	}

	private Tree findMin(Tree node) {
		
		while (node.getLeft()!= null) {
		
			node = node.getLeft();
		
		}
		
		return node;
	}

}