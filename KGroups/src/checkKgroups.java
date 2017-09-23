import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class checkKgroups {
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
		KGroups kg = new KGroups();
		//fail("Not yet implemented"); // TODO
		int arr[] = { 5, 1, 5, 9, 10 };
		int n = arr.length;

		assertTrue (kg.seperate(arr, n));
	}

}
