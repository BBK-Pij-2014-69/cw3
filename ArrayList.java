package cw3;

/**
 * @see List
 * @author Kieren Millar
 */
public class ArrayList implements List {

	private Object[] array;
	private int listSize;
	
	/**
	 * A constructor which sets initial size of the array to 10.
	 */
	public ArrayList(){
		array = new Object[10];
		listSize = 0;
	}
	
	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public boolean isEmpty() {
		return (listSize == 0)? true : false;
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public int size() {
		return listSize;
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public ReturnObject get(int index) {
		if (checkErrors(index, ErrorMessage.NO_ERROR) != null){
			return checkErrors(index, ErrorMessage.NO_ERROR);
		}else{
			return new ReturnObjectImpl(array[index]);
		}
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public ReturnObject remove(int index) {
		if (checkErrors(index, ErrorMessage.NO_ERROR) != null){
			return checkErrors(index, ErrorMessage.NO_ERROR);
		}else{
			ReturnObject result = new ReturnObjectImpl(array[index]);
			for (int i = index; i < size() - 1; i++){
				array[i] = array[i+1];
			}
			listSize--;	
			return result;
		}
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public ReturnObject add(int index, Object item){
		if (checkErrors(index, item) != null){
			return checkErrors(index, item);
		}else{
			if(listSize > 9){
				array = increaseArray(array);
			}
			listSize++;
			for (int i = size() - 1; i > index; i--){
				array[i] = array[i-1];
			}
			array[index] = item;
		}
		return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public ReturnObject add(Object item) {
		if(item == null){
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}else{
			listSize++;
			if(listSize > 9){
				array = increaseArray(array);
			}
			array[size()-1] = item;
		}
		return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
	}

	/**
	 * Method for increasing the size of the array.
	 * @return larger array with values cloned.
	 */
	public Object[] increaseArray(Object[] list){
		Object[] biggerArray = new Object[list.length * 2];
		for (int i = 0; i < size(); i++){
			biggerArray[i] = list [i];
		}
		return biggerArray;
	}
	
	/**
	 * Method for error checking.
	 * @return a ReturnObject, null if the operation is successful
	 *         or containing an appropriate error message.
	 */
	public ReturnObject checkErrors(int index, Object item){
		if (index < 0 | index >= size()){
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}else if(item == null){
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}
		return null;
	}

}
