package cw3;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList one = new ArrayList();
		//System.out.println(one.size());
		int a = one.size();
		String b = (one.isEmpty() == true)? "empty" : "not empty";
		one.add("cat");
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
		System.out.println((a == 1)? "1 pass" : "1 fail");
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
	}

}
