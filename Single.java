class Mobile //Base class
{
	String name; // Declared variable1 name
	String mobNum;  // Declared variable mobile number
	static String city="Madurai"; // initialize the city as static
	public void contacts(String name,String mobNum) // no return type with argument
	{
		this.mobNum=mobNum; //assign current variable
		this.name=name;     //assign current variable
	}
public	void display() // method for display 
	{
		System.out.println("Contact1 name :"+name+"\n"+" Mobile num :"+mobNum+"\n"+" City :"+city);
	}
	
}
class Call extends Mobile // derived class 
{
	 
	public void call(String name1,String mobNum1) 
	{
		
		System.out.println("Contact2 name :"+name1+"\n"+" Mobile num :"+mobNum1+"\n"+" City :"+city);
	}
	
	
}

public class Single {
	public static void main(String[] args) {
		Call m=new Call(); // object for derived class
		
		m.contacts("kathick","8248328486");
		m.display(); 
		System.out.println();
		m.call("Dhileepan","8682817160");
	}

}
