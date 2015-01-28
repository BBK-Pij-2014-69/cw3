package cw3;

public class ArrayList implements List {

	private Object[] array;
	private int listSize;
	
	public ArrayList(){
		array = new Object[10];
		listSize = 0;
	}
	
	@Override
	public boolean isEmpty() {
		return (listSize == 0)? true : false;
	}

	@Override
	public int size() {
		return listSize;
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
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}else{
			ReturnObject result = new ReturnObjectImpl(array[index]);
			for (int i = index; i < size() - 1; i++){
				array[i] = array[i+1];
			}
			listSize--;	
			return result;
		}
	}

	@Override
	public ReturnObject add(int index, Object item){
		if(listSize == 10){
			array = increaseArray(array);
		}
		if (index < 0 | index >= size()){
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}else if(item == null){
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}else{
			listSize++;
			for (int i = size() - 1; i > index; i--){
				array[i] = array[i-1];
			}
			array[index] = item;
		}
		return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
	}

	@Override
	public ReturnObject add(Object item) {
		if(listSize == 10){
			array = increaseArray(array);
		}
		if (item == null){
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}else{
			listSize++;
			array[size()-1] = item;
		}
		return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
	}
	
	public Object[] increaseArray(Object[] list){
		Object[] biggerArray = new Object[list.length * 2];
		for (int i = 0; i < size(); i++){
			biggerArray[i] = list [i];
		}
		return biggerArray;
	}

}
