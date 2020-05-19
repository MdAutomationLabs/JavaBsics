package InteviewQA;

public class NullConcept {
    // object variables
    static Object obj;
    static String str;
    static NullConcept nc;

    public static void main(String[] args) {
        // default ref value are null
//        System.out.println(obj);
//        System.out.println(str);
//        System.out.println(nc);


//        Integer i = null; // class
//        int j = i; // primitive data type

        //instanceof
        Integer i = null;
        Integer j = 20;
        System.out.println(i instanceof Integer);
        System.out.println(j instanceof Integer);

        //static vs non static
// does static methods be accessed by null object reference = yes
       NullConcept obj = null;
        // obj.send();  //
           obj.sum();

           // == and !=
        System.out.println(null == null); // true
        System.out.println(null != null); // false

        String str = null;
        Integer k = null;
        Double d = null;

        // any manipulation can not be done after type casting
        String s1 = (String) null;
        System.out.println();

    }
        public static void sum(){
            System.out.println("sum----");
        }

        public void send(){
            System.out.println("send----");
        }


}
