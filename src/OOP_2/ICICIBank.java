package OOP_2;

public class ICICIBank implements USBank, UKBank{ // we are achieving multiple inheritance 
	// if a class is implemented any interface, then its mandatory to define/override all the methods of interface 
	// is-a relationship 
	//Overriding from USBank
	public void debit(){
		System.out.println("ICICI--debit");
	}
	
	public void credit(){
		System.out.println("ICICI--credit");
	}
	
	public void transferMoney(){
		System.out.println("ICICI -- tr money");
	}
	
	//UKBank
	public void atmCard(){
		System.out.println("ICICI--atm card");
	}
	
	public void trading(){
		System.out.println("ICICI--trading");
	}
	
	
	
	///
	public void educationLoan(){
		System.out.println("ICICI -- edu loan");
	}
	
	public void homeLoan(){
		System.out.println("ICICI--home loan");
	}
	
	
	
	

}
