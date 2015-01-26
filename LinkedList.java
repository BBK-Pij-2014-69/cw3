package cw3;

public class LinkedList implements List {
	private Node head;
	private int listLength;
	
	public LinkedList(){
		this.head = new Node(0, ErrorMessage.EMPTY_STRUCTURE);
		this.listLength = 0;
	}

	@Override
	public boolean isEmpty() {
		return (head.getValue() == ErrorMessage.EMPTY_STRUCTURE)? true : false;
	}

	@Override
	public int size() {
		return listLength;
	}

	@Override
	public ReturnObject get(int index) {
		return (this.head.getIndex() == index)? new ReturnObjectImpl(this.head.getValue()) : get(this.head.getNext().getIndex());
	}

	@Override
	public ReturnObject remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReturnObject add(int index, Object item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReturnObject add(Object item) {
		// TODO Auto-generated method stub
		return null;
	}

}
