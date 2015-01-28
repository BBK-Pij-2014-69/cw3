package cw3;

public class SampleableListImplTest {

	public static void main(String[] args) {
		LinkedList listA = new LinkedList();
		SampleableListImpl SampleableLinkedList = new SampleableListImpl(listA);
		SampleableLinkedList.sample();
	}

}
