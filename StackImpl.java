package cw3;

public class StackImpl extends AbstractStack {

	public StackImpl(List list) {
		super(list);
	}

	@Override
	public boolean isEmpty() {
		return internalList.isEmpty();
	}

	@Override
	public int size() {
		return internalList.size();
	}

	@Override
	public void push(Object item) {
		internalList.add(item);
	}

	@Override
	public ReturnObject top() {
		if (internalList.isEmpty() == true){
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}else{
			return new ReturnObjectImpl(internalList.get(internalList.size() - 1).getReturnValue());
		}
	}

	@Override
	public ReturnObject pop() {
		if (internalList.isEmpty() == true){
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}else{
			return internalList.remove(internalList.size() - 1);
		}
	}

}
