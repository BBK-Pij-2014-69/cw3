package cw3;

/**
 * @see FunctionalList
 * @author Kieren Millar
 */
public class FunctionalLinkedList extends LinkedList implements FunctionalList {

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public ReturnObject head() {
		if (isEmpty() == true){
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}else{
			return get(0);
		}
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public FunctionalList rest() {
		FunctionalList result = new FunctionalLinkedList();
		for (int i = 1; i < size(); i++) {
			result.add(get(i).getReturnValue());
		}
		return result;
	}

}
