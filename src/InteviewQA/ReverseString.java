package InteviewQA;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// string is immuteable object
		//there is no reverse method in java
		// Using for loop------
		String s = "Selenium";
		int length = s.length();//8
		String reverse = "";
		
		for(int i= length-1; i>=0;i--) { // because it start from 0
			reverse = reverse + s.charAt(i); //m-u-i
		}
		System.out.println("Using for loop- "+reverse);
		
		//Using String Buffer class----
		
      StringBuffer sb = new StringBuffer(s);
      
     System.out.println("Using String Buffer class- "+sb.reverse());
		
		
		
	}

}
