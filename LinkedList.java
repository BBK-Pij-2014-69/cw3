package cw3;

public class LinkedList implements List {
	private Node head;
	private int listLength;
	
	public LinkedList(){
		this.head = new Node(-1, null);
		this.listLength = 0;
	}

	@Override
	public boolean isEmpty() {
		return (listLength == 0)? true : false;
	}

	@Override
	public int size() {
		return listLength;
	}

	@Override
	public ReturnObject get(int index) {
		if (index < 0 | index >= size()){
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}else if (isEmpty() == true){
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}else{
			Node search = head;
			while (search.getIndex() != index){
				search = search.getNext();
			}
		return new ReturnObjectImpl(search.getValue());
		}
	}

	@Override
	public ReturnObject remove(int index) {
		Node search = head;
		if (head.getNext() == null){
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}else if (index < 0 | index >= size()){
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}else{
			while (search.getIndex() != index - 1){
				search = search.getNext();
			}
			search.setNext(search.getNext().getNext());
			search = search.getNext();
		}
		listLength --;
		updateIndeces();
		return new ReturnObjectImpl(search.getValue());
	}

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
	
	public void updateIndeces(){
		Node search = head;
		for (int i = -1; i < listLength; i++){
			search.setIndex(i);
			search = search.getNext();
		}
	}
	
}
