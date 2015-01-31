package cw3;

public class SampleableListImpl implements SampleableList {

	private List anyList;
	
	public SampleableListImpl(List list){
		anyList = list;
	}
		
	@Override
	public boolean isEmpty() {
		return anyList.isEmpty();
	}

	@Override
	public int size() {
		return anyList.size();
	}

	@Override
	public ReturnObject get(int index) {
		return anyList.get(index);
	}

	@Override
	public ReturnObject remove(int index) {
		return anyList.remove(index);
	}

	@Override
	public ReturnObject add(int index, Object item) {
		return anyList.add(index, item);
	}

	@Override
	public ReturnObject add(Object item) {
		return anyList.add(item);
	}

	@Override
	public SampleableList sample() {
		List newList = new LinkedList();
		for (int i = 0; i < anyList.size(); i++){
			if (i % 2 == 0){
				newList.add(anyList.get(i).getReturnValue());
			}
		}
		return new SampleableListImpl(newList);
	}

}
