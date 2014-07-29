import java.util.Scanner;
 
class BinarySearchTree{
 
	private String data;
	private BinarySearchTree left;
	private BinarySearchTree right;
 
	public BinarySearchTree(String word)
	{
		left = null;
		right = null;
		data = word;
	}
 
 
	public void insert(String word)
	{	
	
		if (left==null && word.compareTo(data)>0)
			left = new BinarySearchTree(word);
		if (right==null && word.compareTo(data)<0)
			right = new BinarySearchTree(word);
 
		else if (word.compareTo(data)>0 && this!=null) left.insert(word);
		else if (word.compareTo(data)<0 && this!= null) right.insert(word);
		if(this == null) this.data = word;
	}

	public void printSortedList()
	{
		if (left==null && right==null) System.out.printf("%s",data);
		else
		{
			if(left!=null)
			left.printSortedList();
			System.out.printf("%s",data);
			if(right!=null)
			right.printSortedList();
		}
	}
 
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		BinarySearchTree x = new BinarySearchTree("m");
		x.insert("a");x.insert("y"); x.insert("A"); x.insert("z");x.insert("H");x.insert("b");
		x.printSortedList();
	}
}