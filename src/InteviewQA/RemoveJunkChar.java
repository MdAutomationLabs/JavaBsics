package InteviewQA;

public class RemoveJunkChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// by default premitive datatype final
      String s = "Ahm/ed";
      // using rapper class
      s =  s.replaceAll("[^a-zA-Z0-9]", ""); // using regular expression
    		System.out.println(s);  
    		
    		
	}

}

