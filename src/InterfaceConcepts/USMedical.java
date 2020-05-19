package InterfaceConcepts;

public interface USMedical extends WHO{
    //implements keyword is used for interface to class child parent relationship
    // extend keyword is used for class to class and interface to interface child parent relationship
    //can not create obj of interface
    // only method declaration method prototype no method body also call abstruct
    //can not create static prototype method in interface  but interface vars are static and final by default
    // static in nature by default can not be called using obj name but can be call on class/interface name see below
    int min_fee = 20;
    public void physioServices();
    public void oncologyServices();
    public void orthopedicServices();
    public void radiologyServices();
    // static method is allowed to have method body
    // added on JDK 1.8
    public static void Service_911(){
        System.out.println("US--911 Services");
    }
    default void Internship(){
        System.out.println("US internship Services");
    }

}
