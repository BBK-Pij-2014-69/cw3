package cw3;

/**
 * @see List
 * @author Kieren Millar
 */
public class LinkedList implements List {
	private Node head;
	private int listLength;
	
	/**
	 * A constructor that sets the head of the list;
	 */
	public LinkedList(){
		this.head = new Node(-1, null);
		this.listLength = 0;
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public boolean isEmpty() {
		return (listLength == 0)? true : false;
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public int size() {
		return listLength;
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public ReturnObject get(int index) {
		if (index < 0 | index >= size()){
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}else{
			Node search = head;
			while (search.getIndex() != index){
				search = search.getNext();
			}
		return new ReturnObjectImpl(search.getValue());
		}
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public ReturnObject remove(int index) {
		Node search = head;
		Node result = null;
		if (index < 0 | index >= size()){
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}else{
			while (search.getIndex() != index - 1){
				search = search.getNext();
			}
			result = search.getNext();
			search.setNext(search.getNext().getNext());
		}
		listLength --;
		updateIndeces();
		return new ReturnObjectImpl(result.getValue());
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public ReturnObject add(int index, Object item) {
		Node newItem = new Node(index, item);
		Node search = head;
		if (index < 0 | index >= size()){
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}else if(item == null){
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}else{
			while (search.getIndex() != index - 1){
				search = search.getNext();
			}
			newItem.setNext(search.getNext());
			search.setNext(newItem);
			listLength++;
			updateIndeces();
		}
		return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
	}

	/** 
	 * {@inheritDoc} 
	 */
	@Override
	public ReturnObject add(Object item) {
		if (item == null){
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}
		Node newItem = new Node(listLength, item);
		Node search = head;
		while (search.getIndex() != listLength - 1){
			search = search.getNext();
		}
		search.setNext(newItem);
		listLength++;
		return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
	}
	
	/** 
	 * A method for updating the indeces when nodes are added or removed.
	 */
	public void updateIndeces(){
		Node search = head;
		for (int i = -1; i < listLength; i++){
			search.setIndex(i);
			search = search.getNext();
		}
	}
	
}
