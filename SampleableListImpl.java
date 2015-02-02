package cw3;

/**
 * @see SampleableList
 * @author Kieren Millar
 */
public class SampleableListImpl implements SampleableList {

	private List anyList;
	
	/** 
	 * A constructor that accepts lists.
	 */
	public SampleableListImpl(List list){
		anyList = list;
	}
	
	/**
	 * A constructor if no list is provided.
	 */
	public SampleableListImpl() {
		anyList = new ArrayList();
	}
	
	/** 
	 * {@inheritDoc}
	 */
	@Override
	public boolean isEmpty() {
		return anyList.isEmpty();
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public int size() {
		return anyList.size();
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public ReturnObject get(int index) {
		return anyList.get(index);
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public ReturnObject remove(int index) {
		return anyList.remove(index);
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public ReturnObject add(int index, Object item) {
		return anyList.add(index, item);
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public ReturnObject add(Object item) {
		return anyList.add(item);
	}

	/** 
	 * {@inheritDoc} 
	 */
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
