import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		
		// work like key value pair
		
		h.put("A", "Test");
		h.put("B", "World");
		h.put("C", "Hello");
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		h.put(3, 300);
		System.out.println(h.get(2));
		
		
		Hashtable <Integer,String> h1 = new Hashtable<Integer,String>();
		
		h1.put(1, "Test");
		h1.put(2, "World");
		h1.put(3, "Hello");
		
		System.out.println(h1.get(3));
		
		for (int i=1; i<=h1.size(); i++) {
			System.out.println(h1.get(i));
		}

	}

}
