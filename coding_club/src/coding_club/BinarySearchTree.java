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
	public void print_leafs(TNode root)
	{
		if(root==null)
			return;
		if(root.left==null && root.right==null)
			System.out.println(root.data);
		print_leafs(root.left);
		print_leafs(root.right);
	}
	public int count_leafs(TNode root,int n)
	{
		if(root==null)
			return n;
		if(root.left==null && root.right==null)
			return n+1;
		n=count_leafs(root.left,n);
		n=count_leafs(root.right,n);
		return n;
	}
	public int maxElement(TNode root)
	{
		if(root	==	null)
			return -1;
		if(root.right == null)
			return root.data;
		return maxElement(root.right);
	}
	public int getLevelOfNode(TNode root,int n)
	{
		int level=0;
		while(root != null)
		{
			if(root.data == n)
				return level;
			if(root.data > n)
				root = root.left;
			else
				root = root.right;
			level = level+1;
		}
		return -1;
	}
	public boolean search( TNode root,int n)
	{
		if(root==null)
			return false;
		if(root.data<n)
			return search(root.right,n);
		else if(root.data>n)
			return search(root.left,n);
		return true;
	}
	public int lca( TNode root , int n1 , int n2)
	{
		if(root	==	null || search(root,n1)==false || search(root,n2)==false)
			return -1;
		if(search(root.left,n1)&&search(root.left,n2))
			return lca(root.left,n1,n2);
		else if(search(root.right,n1)&&search(root.right,n2))
			return lca(root.right,n1,n2);
		else 
			return root.data;
	}
}

