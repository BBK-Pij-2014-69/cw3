package cw3;

/**
 * @see ImprovedStack
 * @author Kieren Millar
 */
public class ImprovedStackImpl implements ImprovedStack {

	private StackImpl internalStack;
	
	/**
	 * A constructor.
	 */
	public ImprovedStackImpl(List list){
		internalStack = new StackImpl(list);
	}
	
	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public boolean isEmpty() {
		return internalStack.isEmpty();
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public int size() {
		return internalStack.size();
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public void push(Object item) {
		internalStack.push(item);
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public ReturnObject top() {
		return internalStack.top();
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public ReturnObject pop() {
		return internalStack.pop();
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public ImprovedStack reverse() {
		LinkedList result = new LinkedList();
		for (int i = internalStack.size() - 1; i >= 0; i--){
			result.add(internalStack.internalList.get(i).getReturnValue());
		}
		return new ImprovedStackImpl(result);
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public void remove(Object object) {
		for (int i = 0; i < size(); i++){
			if (internalStack.internalList.get(i).getReturnValue() == object){
				internalStack.internalList.remove(i);
			}
		}
	}

}
