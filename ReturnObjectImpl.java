package cw3;

/**
 * @see ReturnObject
 * @author Kieren Millar
 *
 */
public class ReturnObjectImpl implements ReturnObject {
	private Object resultObject;
	private ErrorMessage errorValue;
	
	/** 
	 * A constructor for when an object is passed in.
	 */
	public ReturnObjectImpl(Object entryObject){
		this.resultObject = entryObject;
		this.errorValue = null;
	}
	
	/** 
	 * A constructor for when an error value is passed in.
	 */
	public ReturnObjectImpl(ErrorMessage entryError){
		this.resultObject = null;
		this.errorValue = entryError;
	}
	
	/** 
	 * {@inheritDoc} 
	 */
	public boolean hasError(){
		return (errorValue == null)? false : true;
	}

	/** 
	 * {@inheritDoc} 
	 */
	public ErrorMessage getError(){
		return (hasError() == true)? errorValue : ErrorMessage.NO_ERROR;
	}

	/** 
	 * {@inheritDoc} 
	 */
	public Object getReturnValue(){
		return (hasError() == true)? null : resultObject;
	}
	
}
