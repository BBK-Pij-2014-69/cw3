package cw3;

public class FunctionalLinkedListTest {

	public static void main(String[] args) {
		FunctionalList one = new FunctionalLinkedList();
		//System.out.println(one.size());
		int a = one.size();
		String b = (one.isEmpty() == true)? "empty" : "not empty";
		one.add("cat");
		//System.out.println(one.get(0).getReturnValue());
		Object c = (one.get(0).getReturnValue());
		int d = one.size();
		one.add("dog");
		int e = (one.size());
		Object f = (one.get(0).getReturnValue());
		Object g = (one.get(1).getReturnValue());
		one.remove(0);
		int h = (one.size());
		Object i = (one.get(0).getReturnValue());
		one.add(0,"mouse");
		int j = (one.size());
		Object k = (one.get(0).getReturnValue());
		Object l = (one.get(1).getReturnValue());
		one.add(1);
		one.add(2);
		one.add(3);
		one.add(4);
		one.add(5);
		one.add(6);
		one.add(7);
		one.add(8);
		one.add(9);
		one.add("cheese");
		Object m = (one.get(11).getReturnValue());
		System.out.println((a == 0)? "1 pass" : "1 fail");
		System.out.println((b == "empty")? "2 pass" : "2 fail");
		System.out.println((c == "cat")? "3 pass" : "3 fail");
		System.out.println((d == 1)? "4 pass" : "4 fail");
		System.out.println((e == 2)? "5 pass" : "5 fail");
		System.out.println((f == "cat")? "6 pass" : "6 fail");
		System.out.println((g == "dog")? "7 pass" : "7 fail");
		System.out.println((h == 1)? "8 pass" : "8 fail");
		System.out.println((i == "dog")? "9 pass" : "9 fail");
		System.out.println((j == 2)? "10 pass" : "10 fail");
		System.out.println((k == "mouse")? "11 pass" : "11 fail");
		System.out.println((l == "dog")? "12 pass" : "12 fail");
		System.out.println((m == "cheese")? "13 pass" : "13 fail");
		System.out.println(one.add(24,"horse").getError());
		System.out.println(one.head().getReturnValue());
		System.out.println(one.size());
		for(int z = 0; z < one.size(); z++){
			System.out.println(one.rest().get(z).getReturnValue());
		}
	}
	
}
