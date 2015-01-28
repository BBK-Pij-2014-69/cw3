package cw3;

public class ReturnObjectImpl implements ReturnObject {
	private Object resultObject;
	private ErrorMessage errorValue;
	
	public ReturnObjectImpl(Object entryObject){
		this.resultObject = entryObject;
		this.errorValue = null;
	}
	
	public ReturnObjectImpl(ErrorMessage entryError){
		this.resultObject = null;
		this.errorValue = entryError;
	}
	
	public boolean hasError(){
		return (errorValue == null)? false : true;
	}

	public ErrorMessage getError(){
		return (hasError() == true)? errorValue : ErrorMessage.NO_ERROR;
	}

	public Object getReturnValue(){
		return (hasError() == true)? null : resultObject;
	}
	
}
