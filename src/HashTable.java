import java.util.ArrayList;
import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
      // ArrayList ------------
		ArrayList a = new ArrayList(); // undefined variable type
		a.add(300);
		a.add(200);
		a.add(400);
		System.out.println("Array Size "+a.size());

		a.add("toma");
		a.add("almir");
		System.out.println("Array Size "+a.size());

		a.add("12.2");
		for(int i=0; i<a.size(); i++){
			System.out.println("index "+ i+ " value "+a.get(i));
		}
		ArrayList<String> a1 = new ArrayList<String>(); // array list goes on index
		a1.add("800");
		//a1.add(800);
		a1.add("TOMA");

		ArrayList<Integer> a2 = new ArrayList<Integer>();
		//a2.add("800");
		a2.add(800);
		//a2.add("TOMA");

		System.out.println(a2.size());

		//Hashtable -------------
		Hashtable h = new Hashtable(); // hashtable goes on key
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
