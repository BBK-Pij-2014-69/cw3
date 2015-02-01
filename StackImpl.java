package cw3;

/**
 * @see AbstractStack
 * @author Kieren Millar
 */
public class StackImpl extends AbstractStack {

	/** 
	 * A constructor that calls super (from AbrstractStack).
	 */
	public StackImpl(List list) {
		super(list);
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public boolean isEmpty() {
		return internalList.isEmpty();
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public int size() {
		return internalList.size();
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public void push(Object item) {
		internalList.add(item);
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public ReturnObject top() {
		if (internalList.isEmpty() == true){
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}else{
			return new ReturnObjectImpl(internalList.get(internalList.size() - 1).getReturnValue());
		}
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public ReturnObject pop() {
		if (internalList.isEmpty() == true){
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}else{
			return internalList.remove(internalList.size() - 1);
		}
	}

}
