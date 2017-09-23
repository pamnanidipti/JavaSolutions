
public class ReverseList {
	public static Node head;


	public Node reverse(Node head) {
		Node previous = null;
		Node next = null;
		Node current = head;
		while(current != null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
		return head;
	}
	public void printList(Node current) {
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }

	public static void main(String[] args) {
		ReverseList list = new ReverseList();
		list.head = new Node(15);
		list.head.next = new Node(10);
		list.head.next.next = new Node(5);
		list.head.next.next.next = new Node(0);

		System.out.println("Given Linked list");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
	}
}
