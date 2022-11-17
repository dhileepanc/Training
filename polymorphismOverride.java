//Method override for Men roles  
package polyorphism;

class Human
{
	//men() Override
	void men()
	{
		System.out.println("The men perform various role");
	}
}
class Home extends Human
{
	void men()
	{
		System.out.println("Father,Son,Husbund,Brother");
	}
}
class Work extends Human
{
	void men()
	{
		System.out.println("Employee");
	}
}
class Society extends Human
{
	void men()
	{
		System.out.println("Social responsible person");
	}
}
class Store extends Human
{
	void men()
	{
		System.out.println("Customer");
	}
}

public class polymorphismOverride {
	public static void main(String[] args) {
		Human h=new Home(); //object created Dynamic binding
		Human w=new Work();
		Human s=new Society();
		Human sT=new Store();
		
		System.out.println("In home");
		h.men();
		System.out.println("\n In work");
		w.men();
		System.out.println("\n In Society");
		s.men();
		System.out.println("\n In Store");
		sT.men();
	}

}
