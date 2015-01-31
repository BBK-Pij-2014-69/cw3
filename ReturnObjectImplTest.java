package cw3;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Kieren Millar
 *
 */
public class ReturnObjectImplTest {

	ReturnObject inputObject  = new ReturnObjectImpl("cat");
	ReturnObject errorObject = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);

	@Test
	public void test() {
		assertFalse(inputObject.hasError());
		assertTrue(errorObject.hasError());
		assertEquals(ErrorMessage.NO_ERROR, inputObject.getError());
		assertEquals(ErrorMessage.INVALID_ARGUMENT, errorObject.getError());
		assertEquals("cat", inputObject.getReturnValue());
		assertEquals(null, errorObject.getReturnValue());
		}

}
