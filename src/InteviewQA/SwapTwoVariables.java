package InteviewQA;

public class SwapTwoVariables {

	public static void main(String[] args) {
		// only for integer/numbers
		int x = 5;
		int y = 10;
//		int t ;
//		t = x;
//		x = y;
//		y = t;
//		System.out.println(x);
//		System.out.println(y);
		
		// without third variable 
//		x = x+y; //15
//		y = x-y;//5
//		x = x-y;//10
//		
//		System.out.println(x);
//		System.out.println(y);
		
		// using xor : ^
		x = x^y; // 15 -->1111
		y = x^y;// 10 -->1010
		x = x^y;// 5 -->0101
		System.out.println(x);
		System.out.println(y);
		
		
	}

}
