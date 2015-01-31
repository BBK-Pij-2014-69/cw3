package cw3;

import static org.junit.Assert.*;

import org.junit.Test;


public class ArrayListTest {

	ArrayList one = new ArrayList();
	
		
		@Test
		public final void test(){
			assertEquals(one.size(), 0);
			assertTrue(one.isEmpty());;
			one.add("cat");
			assertEquals(one.get(0).getReturnValue(), "cat");
			assertEquals(one.size(), 1);
			one.add("dog");
			assertEquals(one.size(), 2);
			assertEquals(one.get(0).getReturnValue(), "cat");
			assertEquals(one.get(1).getReturnValue(), "dog");
			one.remove(0);
			assertEquals(one.size(), 1);
			assertEquals(one.get(0).getReturnValue(), "dog");
			one.add(0,"mouse");
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
			ReturnObject checkError = one.add(24,"horse");
			assertEquals(checkError.getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}

}
