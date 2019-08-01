package InteviewQA;

public class StringManipulation {

	public static void main(String[] args) {
		// if index not available it will return -1 
		//.size for array object list 
		String str = "The cat is dancing dat";
		String str1 = "The cat is dancing date";
		System.out.println(str.length());
		System.out.println(str.charAt(12));
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('a', str.indexOf('a')+1)); //looking for s after 8th location 
		System.out.println(str.indexOf("cat"));
		System.out.println(str.indexOf("Have")); //-1
		
		//string comparison 
		System.out.println(str.equals(str1));
		
		// substring 
		System.out.println(str.substring(0, 10));
		//trim method is used for before and after space
		System.out.println(str.trim());
		// to trim/replace the space between words
		System.out.println(str.replace(" ", ""));
		
		//split 
		String test = "Hello_world_selenium";
		String testVal[] = test.split("-");
		for(int i = 0; i<testVal.length; i++)
		System.out.println(testVal[i]);
		
		// string concatenation (+) is concatenate operator 
		        String s = "Home";
				System.out.println(s.concat("s"));
				 
				String x = "Home";
				String y = "House";
				int a = 100;
				int b = 200;
				System.out.println(a+b+x+y);
				System.out.println(x+y+a+b);
	}

}
