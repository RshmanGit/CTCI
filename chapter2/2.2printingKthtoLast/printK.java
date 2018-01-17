import java.util.*;

class Node{

	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
		this.next = null;
	}
	
	void printList(){
		Node n = this;
		while(n != null){
			System.out.print(n.data+"->");
			n = n.next;
		}
		System.out.println();
	}
	
	void printKth(Node head,int i,int k){
		Node temp = head;
		if(i < k){
			printKth(temp.next,++i,k);
		}
		else{
			if(temp == null){
				System.out.println();
			}
			else{
				System.out.print(temp.data+"->");
				printKth(temp.next,i++,k);
			}
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

public class printK{
	
	public static void main(String []args){
	
		Node head = Node.createList();
		head.printList();
		head.printKth(head,0,5);
		
	}	
	
}
