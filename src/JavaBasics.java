
public class JavaBasics {

	public static void main(String[] args) {
		
		// Data types in java are int, char, string, double boolean
		
		float v = (float) 12.33;
		System.out.println(v);
		//2. double (8 bytes), float(4 bytes)
				double d1 = 12.33;
				double d2 = -12.33;
				double d3 = 100; //100.00
				System.out.println(d1);
				
			// Arrays are in general static but object array allow us to store any data type  
				//One dimensional array
				//1. size is fixed: static array -- to overcome this issue: we use dynamic array -- ArrayList
				//2. stores only similar data types values -- to overcome this issue: we use object array
				
				//6. Object array:
				Object ob[] = new Object[4];
				ob[0]="Tom";
				ob[1]=25;
				ob[2]='M';
				ob[3]=12.33;
				System.out.println(ob.length);
				
				
				// while loop
				int i=0;
				while (i<ob.length) {
					System.out.println(ob[i]);
					i++;
				}
				//for loop
				for(int p=0; p<ob.length; p++){
					System.out.println(ob[p]);
					}
				//Two dimensional array
				String x[][] = new String [3][5];	
				System.out.println(x.length); // total row 3
				System.out.println(x[0].length);// total cols 5
				//row 1
				x[0][0]="A";
				x[0][1]="B";
				x[0][2]="C";
				x[0][3]="D";
				x[0][4]="E";
				//row 2
				x[1][0]="A1";
				x[1][1]="B1";
				x[1][2]="C1";
				x[1][3]="D1";
				x[1][4]="E1";
				//row 3
				x[2][0]="A2";
				x[2][1]="B2";
				x[2][2]="C2";
				x[2][3]="D2";
				x[2][4]="E2";
				
				System.out.println(x[2][4]); // print the 3rd row/5th column place
			     
				//print all the values in the array
				for(int row=0; row<x.length; row++){
					for(int col=0; col<x[0].length; col++) {
						System.out.println(x[row][col]);
					}
				}
					
	}
	
	
	
}
