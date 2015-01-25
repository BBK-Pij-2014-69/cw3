package cw3;

public class ArrayList implements List {

	private Object[] array;
	
	public ArrayList(){
		array = new Object[1];
		array[0] = ErrorMessage.EMPTY_STRUCTURE;
	}
	
	@Override
	public boolean isEmpty() {
		return (array[0] == ErrorMessage.EMPTY_STRUCTURE)? true : false;
	}

	@Override
	public int size() {
		return this.array.length;
	}

	@Override
	public ReturnObject get(int index) {
		if (index < 0 | index >= size()){
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}else if (isEmpty() == true){
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}else{
			return new ReturnObjectImpl(array[index]);
		}
	}

	@Override
	public ReturnObject remove(int index) {
		if (index < 0 | index >= size()){
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}else if (isEmpty() == true){
			return get(0);
		}else{
			ReturnObject result = new ReturnObjectImpl(array[index]);
			if (size() == 1){
				array[0] = ErrorMessage.EMPTY_STRUCTURE;
			}else{
				for (int i = index; i < size() - 1; i++){
					array[i] = array[i+1];
				}
				Object[] smallerArray = new Object[size()-1];
				for (int i = 0; i < smallerArray.length; i++){
					smallerArray[i] = array[i];
				}
				array = smallerArray;
			}
			return result;
		}
	}

	@Override
	public ReturnObject add(int index, Object item) {
		if (index < 0 | index >= size()){
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}else if(item == null){
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}else if (isEmpty() == true){
			array[index] =  new ReturnObjectImpl(item);
		}else{
			increaseArray();
			for (int i = size() - 1; i > index; i--){
				array[i] = array[i-1];
			}
			array[index] = item;
		}
		return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
	}

	@Override
	public ReturnObject add(Object item) {
		if (item == null){
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}else if(isEmpty() == true){
			array[0] = item;
		}else{
			increaseArray();
			array[size()-1] = item;
		}
		return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
	}
	
	public Object[] increaseArray(){
		Object[] biggerArray = new Object[size()+1];
		for (int i = 0; i < size(); i++){
			biggerArray[i] = array[i];
		}
		return array = biggerArray;
	}

}
