import java.util.*;

class Node{

	public Node next;
	public int data;
	
	public Node(int data){
		this.data = data;
		this.next = null;
	}	
	
	void appendToTail(int d){
		Node end = new Node(d);
		Node n = this;
		while(n.next != null){
			n = n.next;
		}	
		n.next = end;		
	}
	
	void printList(){
		Node n = this;
		while(n != null){
			System.out.print(n.data+"->");
			n = n.next;
		}
		System.out.println();
	}
	
	static void deleteDup(Node head){
		Node n = head;
		int temp = n.data;
		try{
			while(n.next != null){
				if(n.next.data == temp){
					if(n.next.next != null){
						n.next = n.next.next;
					}
					else{
						n.next = null;
					}
				}
				n = n.next;
			}
		}
		catch(Exception e){
			continue;
		}
	}
	
	
	static Node createList(){
		Node N	= new Node(0);
		Node m = N;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter number of elements");
		int n = sc.nextInt();	
		
		for(int i = 0; i < n; i++){
			if(i==0){
				System.out.println("Enter value");
				int temp = sc.nextInt();
				N.data = temp;
				N.next = null;
			}
			else{
				System.out.println("Enter value");
				int in = sc.nextInt();
				Node temp = new Node(in);
				
				N.next = temp;
				N = N.next;
			}
		}
		return m;
	}
}
		


public class dup{

	public static void main(String []args){
		Node head = Node.createList();
		head.printList();
		Node temp = head;
		while(temp != null){
			Node.deleteDup(temp);
			temp = temp.next;
		}
		head.printList();
	}	
	
}
