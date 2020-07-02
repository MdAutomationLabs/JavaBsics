package Inheritance;

public class TestCar {
    public static void main(String[] args) {
        // java allow multi-level inheritance not multiple inheritance
        Car c = new Car();
        c.start();
        c.stop();
        c.engine();

        BMW bb = new BMW();
        bb.start();
        bb.stop();
        bb.engine();

        //top casting
        //dynamic polymorphism
        Car b = new BMW(); // child class obj can be referred by parent class ref variable
        b.start();
        b.engine();
        Vehicle v = new BMW();
        v.engine();
        Vehicle v1 = new Car();
        v1.engine();
        //down casting== moving big thing to small
        // parent can not inherit from child
        BMW b1 = (BMW) new Car(); // classCastException
        b1.start();

    }
}
