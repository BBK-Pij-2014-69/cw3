package cw3;

public class SampleableListImpl implements SampleableList {

	private List aList;
	
	public SampleableListImpl(List list){
		 aList = list;
	}
	
	@Override
	public boolean isEmpty() {
		return aList.isEmpty();
	}

	@Override
	public int size() {
		return aList.size();
	}

	@Override
	public ReturnObject get(int index) {
		return aList.get(index);
	}

	@Override
	public ReturnObject remove(int index) {
		return aList.remove(index);
	}

	@Override
	public ReturnObject add(int index, Object item) {
		return aList.add(index, item);
	}

	@Override
	public ReturnObject add(Object item) {
		return aList.add(item);
	}

	@Override
	public SampleableList sample() {
		SampleableList newList = new SampleableListImpl(aList);
		for (int i = 0; i < newList.size(); i++){
			if (i % 2 == 0){
				newList.remove(i);
			}
		}
		return newList;
	}

}
