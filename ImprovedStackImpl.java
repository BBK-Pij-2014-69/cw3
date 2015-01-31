package cw3;

public class ImprovedStackImpl implements ImprovedStack {

	private StackImpl internalStack;
	
	public ImprovedStackImpl(List list){
		internalStack = new StackImpl(list);
	}
	
	@Override
	public boolean isEmpty() {
		return internalStack.isEmpty();
	}

	@Override
	public int size() {
		return internalStack.size();
	}

	@Override
	public void push(Object item) {
		internalStack.push(item);
	}

	@Override
	public ReturnObject top() {
		return internalStack.top();
	}

	@Override
	public ReturnObject pop() {
		return internalStack.pop();
	}

	@Override
	public ImprovedStack reverse() {
		LinkedList result = new LinkedList();
		for (int i = internalStack.size() - 1; i >= 0; i--){
			result.add(internalStack.internalList.get(i).getReturnValue());
		}
		return new ImprovedStackImpl(result);
	}

	@Override
	public void remove(Object object) {
		for (int i = 0; i < size(); i++){
			if (internalStack.internalList.get(i).getReturnValue() == object){
				internalStack.internalList.remove(i);
			}
		}
	}

}
