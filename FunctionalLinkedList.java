package cw3;

public class FunctionalLinkedList extends LinkedList implements FunctionalList {

	@Override
	public ReturnObject head() {
		if (isEmpty() == true){
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}else{
			return get(0);
		}
	}

	@Override
	public FunctionalList rest() {
		FunctionalList result = new FunctionalLinkedList();
		for (int i = 0; i < size(); i++) {
			result.add(get(i).getReturnValue());
		}
		return result;
	}

}
