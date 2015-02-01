package cw3;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Kieren Millar
 *
 */
public class StackImplTest {

	ArrayList sampleList = new ArrayList();
	StackImpl one = new StackImpl(sampleList);
	
		
		@Test
		public final void test(){
			assertEquals(one.size(), 0);
			assertTrue(one.isEmpty());
			assertEquals(one.top().getError(), ErrorMessage.EMPTY_STRUCTURE);
			assertEquals(one.pop().getError(), ErrorMessage.EMPTY_STRUCTURE);
			one.push("cat");
			assertEquals(one.top().getReturnValue(), "cat");
			assertEquals(one.size(), 1);
			one.push("dog");
			assertEquals(one.size(), 2);
			assertEquals(one.pop().getReturnValue(), "dog");
			assertEquals(one.size(), 1);
			assertEquals(one.top().getReturnValue(), "cat");
			one.push("mouse");
			assertEquals(one.size(), 2);
			assertEquals(one.top().getReturnValue(), "mouse");
			one.push(1);
			one.push(2);
			one.push(3);
			one.push(4);
			one.push(5);
			one.push(6);
			one.push(7);
			one.push(8);
			one.push(9);
			one.push("cheese");
			assertEquals(one.top().getReturnValue(), "cheese");
			assertEquals(one.pop().getReturnValue(), "cheese");
		}

}
