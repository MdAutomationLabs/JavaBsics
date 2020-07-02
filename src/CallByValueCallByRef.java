
public class CallByValueCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
       int c=40;
       int d= 10;
       CallByValueCallByRef obj = new CallByValueCallByRef();
       
       obj.p=40;
        obj.q= 10;
       System.out.println(obj.testSum(c, d)); // call by value
       obj.swap(obj);
       System.out.println(obj.p);
       System.out.println(obj.q);
	}
	
	public int testSum(int a, int b) {
		 a = 10;
	     b= 12;
		int c = a+b;
		return c;
	}
	// cal by reference by using object reference
	// passing by value of obj reference,
	public void swap(CallByValueCallByRef h) {
		int temp;
		temp = h.p; // temp=40
		h.p = h.q ;// i=10
	     h.q = temp; //40
		
		
	}

}
