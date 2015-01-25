package cw3;

public class ArrayList implements List {

	private Object[] array;
	
	public ArrayList(){
		array[0] = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
	}
	
	@Override
	public boolean isEmpty() {
		return (get(0).getError() == ErrorMessage.EMPTY_STRUCTURE)? true : false;
	}

	@Override
	public int size() {
		return this.array.length;
	}

	@Override
	public ReturnObject get(int index) {
		if (index < 0 | index >= size()){
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
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
			for (int i = index; i < size(); i++){
				array[i] = array[i+1];
			}
			return result;
		}
	}

	@Override
	public ReturnObject add(int index, Object item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReturnObject add(Object item) {
		// TODO Auto-generated method stub
		return null;
	}

}
