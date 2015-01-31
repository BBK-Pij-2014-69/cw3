package cw3;

public class SampleableListImplTest {

	public static void main(String[] args) {
		LinkedList listA = new LinkedList();
		ArrayList listB = new ArrayList();
		SampleableListImpl SampleableLinkedList = new SampleableListImpl(listA);
		SampleableListImpl SampleableArrayList = new SampleableListImpl(listB);
		System.out.println((SampleableLinkedList.sample().isEmpty() == true)? "true" : "false");
		SampleableArrayList.add("First");
		SampleableArrayList.add("Seconed");
		SampleableArrayList.add("Third");
		SampleableArrayList.add("Fourth");
		SampleableArrayList.add("Fifth");
		SampleableList result = new SampleableListImpl(SampleableArrayList.sample());
		for (int i = 0; i < result.size(); i++){
			System.out.println(result.get(i).getReturnValue());
		}
	}
}
