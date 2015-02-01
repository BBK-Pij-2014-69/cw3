package cw3;

import static org.junit.Assert.*;

import org.junit.Test;


public class LinkedListTest {

	LinkedList one = new LinkedList();
	
		
		@Test
		public final void test(){
			assertEquals(one.size(), 0);
			assertTrue(one.isEmpty());
			assertEquals(one.add(null).getError(),ErrorMessage.INVALID_ARGUMENT);
			assertEquals(one.add("cat").getError(), ErrorMessage.NO_ERROR);
			assertEquals(one.add(0, null).getError(), ErrorMessage.INVALID_ARGUMENT);
			assertEquals(one.get(0).getReturnValue(), "cat");
			assertEquals(one.size(), 1);
			one.add("dog");
			assertEquals(one.size(), 2);
			assertEquals(one.get(0).getReturnValue(), "cat");
			assertEquals(one.get(1).getReturnValue(), "dog");
			one.remove(0);
			assertEquals(one.size(), 1);
			assertEquals(one.get(0).getReturnValue(), "dog");
			assertEquals(one.add(0,"mouse").getError(), ErrorMessage.NO_ERROR);
			assertEquals(one.size(), 2);
			assertEquals(one.get(0).getReturnValue(), "mouse");
			assertEquals(one.get(1).getReturnValue(), "dog");
			one.add(1);
			one.add(2);
			one.add(3);
			one.add(4);
			one.add(5);
			one.add(6);
			one.add(7);
			one.add(8);
			one.add(9);
			one.add("cheese");
			assertEquals(one.get(11).getReturnValue(), "cheese");
			assertEquals(one.add(24,"horse").getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
			assertEquals(one.remove(27).getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS );
			assertEquals(one.remove(11).getReturnValue(), "cheese");
			assertEquals(one.get(27).getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}

}
