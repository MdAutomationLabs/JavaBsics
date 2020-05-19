package Inheritance;

public class BMW extends Car {
    @Override
    public void start(){
        System.out.println("Start BMW---");
    }

    public void autoParking(){ System.out.println("Parking BMW---"); }
}
