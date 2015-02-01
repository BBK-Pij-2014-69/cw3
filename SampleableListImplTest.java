package cw3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Kieren Millar
 *
 */
public class SampleableListImplTest {

	LinkedList listA = new LinkedList();
	ArrayList listB = new ArrayList();
	SampleableListImpl SampleableLinkedList = new SampleableListImpl(listA);
	SampleableListImpl SampleableArrayList = new SampleableListImpl(listB);
	
	@Before
	public void setup(){
		SampleableArrayList.add("First");
		SampleableArrayList.add("Seconed");
		SampleableArrayList.add("Third");
		SampleableArrayList.add("Fourth");
		SampleableArrayList.add("Fifth");
	}
	
	@After
	public void takeDown(){
		SampleableLinkedList = new SampleableListImpl(listA);
		SampleableArrayList = new SampleableListImpl(listB);
	}
	
	@Test
	public void testIsEmpty() {
		assertTrue(SampleableLinkedList.sample().isEmpty());
	}

	@Test
	public void testSize() {
		assertEquals(SampleableArrayList.size(), 5);
	}

	@Test
	public void testGet() {
		assertEquals(SampleableArrayList.get(2).getReturnValue(), "Third");
	}

	@Test
	public void testRemove() {
		assertEquals(SampleableArrayList.remove(2).getReturnValue(), "Third");
	}

	@Test
	public void testAddIntObject() {
		assertEquals(SampleableArrayList.add(2, "third").getError(), ErrorMessage.NO_ERROR);
	}

	@Test
	public void testAddObject() {
		assertEquals(SampleableArrayList.add("Sixth").getError(), ErrorMessage.NO_ERROR);
	}

	@Test
	public void testSample() {
		SampleableList one = SampleableArrayList.sample();
		assertEquals(one.size(), 3);
		assertEquals(one.get(0).getReturnValue(), "First");
		assertEquals(one.get(1).getReturnValue(), "Third");
		assertEquals(one.get(2).getReturnValue(), "Fifth");
	}

}
