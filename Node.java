package cw3;

/**
 * A Node class with getters and setters,
 * to be used with LinkedList.
 * @author Kieren Millar
 */
public class Node {
	private int index; 
    private Node next;
    private Object value;
    
    public Node(int inputIndex, Object inputValue) {
	  this.index = inputIndex;
	  this.next = null;
	  this.value = inputValue;
    }

    public Object getValue() {
	  return value;
    }

    public Node getNext() {
	  return next;
    }
    
    public int getIndex(){
    	return index;
    }

    public void setNext(Node nextNode) {
	  next = nextNode;
    }
    
    public void setIndex(int input){
    	index = input;
    }
}
