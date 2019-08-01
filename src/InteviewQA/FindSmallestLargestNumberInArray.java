package InteviewQA;

import java.util.Arrays;

public class FindSmallestLargestNumberInArray {

	public static void main(String[] args) {
	
		int a[] = {-1000,2,3,4,500,6,7,8,9,10};
		int smallest = a[0];
		 int largest =a [0];
		 
		 //time complexity 0(n)
		 for(int i=1; i<a.length; i++) {
			 if(a[i]>largest) {
				 largest = a[i];
			 }
			 else if(a[i]<smallest) {
				 smallest = a[i];			 
			 }
			
		 }
		 System.out.println(Arrays.toString(a));
		 System.out.println("Largest- "+largest);
		 System.out.println("Smallest- "+ smallest);
		 
	}

}
