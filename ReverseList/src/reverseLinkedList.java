import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class reverseLinkedList {
	private final static ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStreams() {
		System.setOut(null);
	}

	@Test
	public void test() {
		// fail("Not yet implemented"); // TODO
		ReverseList list = new ReverseList();
		list.head = new Node(15);
		list.head.next = new Node(10);
		list.head.next.next = new Node(5);
		list.head.next.next.next = new Node(0);
		list.head = list.reverse(list.head);
		list.printList(list.head);
		assertEquals("0 5 10 15 ", outContent.toString());
	}

}
