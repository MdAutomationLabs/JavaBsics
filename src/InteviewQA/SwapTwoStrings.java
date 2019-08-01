package InteviewQA;

public class SwapTwoStrings {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		
		System.out.println("Before swap");
		System.out.println(a);
		System.out.println(b);
		// append a and b
         a = a+b;
         //store initial string a in string b
         b = a.substring(0, a.length()-b.length());
         // store initial string b in string a
         a = a.substring(b.length()); // taking substring of a after b's length
         System.out.println("After swap");
 		System.out.println(a);
 		System.out.println(b);

	}

}
