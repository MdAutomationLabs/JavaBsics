package InteviewQA;

public class FindMissedNumberArray {

	public static void main(String[] args) {
	  
	 int num[] = {1,2,4,5};
	 int sum = 0;
	 
	 for(int i=0; i<num.length; i++) {
	    sum = sum + num[i];
	 }
	 System.out.println(sum);
	
	int total = 0;
	
	for(int j=1; j<=5; j++) {
		total = total + j;
	}
	System.out.println(total);
	
	System.out.println("Missing num "+(total-sum));
	}
}
