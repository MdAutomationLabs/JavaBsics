package InteviewQA;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12345;
		int reverse = 0 ;
//       while(num>0) {
//    	   reverse = reverse *10 + num%10;
//    	   num = num/10;   
//    	   
//       }
//       System.out.println(reverse);
        
		//Using String Buffer class----
		
	      StringBuffer sb = new StringBuffer(String.valueOf(num)).reverse();
	      
	     System.out.println("Using String Buffer class- "+sb);
			
			
	}

}
