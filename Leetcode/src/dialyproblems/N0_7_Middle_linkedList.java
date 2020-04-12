package dialyproblems;

public class N0_7_Middle_linkedList {
	private Node head;

	public N0_7_Middle_linkedList() {

		this.head = head;
	}

	public Node insert(int data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node temp = new Node(data);
			temp.next = head;
			head = temp;
		}

		return head;

	}
	
	public void printMiddeleElement() {
		Node slow=head;
		Node Fast=head;
		
		while(Fast!=null && Fast.next!=null)
		{
			slow=slow.next;
			Fast=Fast.next.next;
		}
		System.out.println("the middle elements is :"+slow.data);
	}
	public void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		N0_7_Middle_linkedList no=new N0_7_Middle_linkedList();
		no.insert(6);
		no.insert(1);
		no.insert(2);
		no.insert(3);
		no.insert(4);
		no.insert(5);
		
		no.print();
		
		
		no.printMiddeleElement();
		

	}

}
