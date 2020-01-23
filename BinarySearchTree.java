package coding_club;

class TNode {
	public int data;
	public TNode right;
	public TNode left;
	public void displayNodeData() {
	}
}
public class BinarySearchTree{
	TNode head=null;
	public boolean search(TNode nodeToBeSearched)
	{
		TNode temp=head;
		while(temp!=null)
		{
			if(temp.data==nodeToBeSearched.data)
				return true;
			if(temp.data>nodeToBeSearched.data)
				temp=temp.left;
			else
				temp=temp.right;
		}
		return false;
	} 

	public TNode insert(TNode root,TNode nodeToBeInserted) {
		if(root==null)
			return nodeToBeInserted;
		if(root.data<nodeToBeInserted.data)
			root.right=insert(root.right, nodeToBeInserted);
		else if(root.data>nodeToBeInserted.data)
			root.left=insert(root.left, nodeToBeInserted);
		return root;
	}


	public TNode TreeNodeRemove(TNode root, TNode nodeToBeRemoved){
		while(true)
		{
			if(root==null)
			{
				System.out.println(nodeToBeRemoved.data+" is not found\n");
				return null;
			}
			if(root.data>nodeToBeRemoved.data)
				root=root.left;
			else if(root.data<nodeToBeRemoved.data)
				root=root.right;
			else
				break;
		}
		if(root.right==null)
			return root.left;
		if(root.left==null)
			return root.right;
		TNode temp=root.right;
		while(temp.left!=null)
			temp=temp.left;
		temp.left=root.left;
		System.out.println(nodeToBeRemoved.data+" is deleted\n");
		return nodeToBeRemoved;
	}

	public TNode deleteNode(TNode root, TNode nodeToBeRemoved){
		if(root==null)
		{
			System.out.println(nodeToBeRemoved.data+" is not found\n");
			return root;
		}
		if(root.data>nodeToBeRemoved.data)
			root.left=deleteNode(root.left,nodeToBeRemoved);
		else if(root.data<nodeToBeRemoved.data)
			root.right=deleteNode(root.right,nodeToBeRemoved);
		else
		{
			if(root.right==null)
				return root.left;
			if(root.left==null)
				return root.right;
			TNode temp=root.right;
			while(temp.left!=null)
				temp=temp.left;
			temp.left=root.left;
			System.out.println(nodeToBeRemoved.data+" is deleted\n");
			return root.right;
		}
		return root;
	}
	public void inorder(TNode root)
	{
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public void preorder(TNode root)
	{
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public void postorder(TNode root)
	{
		if(root==null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
}

