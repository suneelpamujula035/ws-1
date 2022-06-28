package puzzles;

public class Puzzle_02 {

	public int findIntersectionPoint(Node node1, Node node2)
	{
		if(node1 == null || node2 == null)
		{
			return -1;
		}
		Node head1 = node1;
		Node head2 = node2;
		int count1 = 0;
		int count2 = 0;
		
		while(node1 !=null)
		{
			count1++;
			node1 = node1.next;
		}
		while(node2 !=null)
		{
			count2++;
			node2 = node2.next;
		}
		int difference = count1 - count2;
		while(difference > 0)
		{
			head1 = head1.next;
			difference--;
		}
		while(difference < 0)
		{
			head2 = head2.next;
			difference++;
		}
		while(head1 !=null && head2 !=null)
		{
			if(head1.data==head2.data)
			{
				return head1.data;
			}
			head1 = head1.next;
			head2 = head2.next;
		}
		return -1;
	}
	public Node getNewNode(int key)
	{
		Node a = new Node();
		a.next = null;
		a.data = key;
		return a;
	}
	public Node insert(int key, Node node)
	{
		if(node == null)
		{
			return getNewNode(key);
		}
		else
		{
			node.next = insert(key, node.next);
		}
		return node;
	}
	public void printList(Node node)
	{
		if(node == null)
		{
			return ;
		}
		System.out.print(node.data+" ");
		printList(node.next);
	}
	public static void main(String[] args) {

		Node head1 = null;
		Node head2 = null;
		Puzzle_02 a = new Puzzle_02();
		head1 = a.insert(3, head1);
		head1 = a.insert(7, head1);
		head1 = a.insert(8, head1);
		head1 = a.insert(10, head1);
		a.printList(head1);
		System.out.println();
	
		head2 = a.insert(99, head2);
		head2 = a.insert(1, head2);
		head2 = a.insert(8, head2);
		head2 = a.insert(10, head2);
		a.printList(head2);
		System.out.println();
		
		int intersectionPoint = a.findIntersectionPoint(head1, head2);
		System.out.println("The intersection point of two linked lists is : "+intersectionPoint);
		
		
	}

}
