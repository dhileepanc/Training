class Company
{
	float salary;
	int leave;
	int bonus;
	String empName;
	
	void Salary(String empName,float salary,int leave,int bonus)
	{
	this.empName=empName;
	this.bonus=bonus;
	this.leave=leave;
	this.salary=salary;
	}
}

class Employee extends Company //extends for company class
{
	void Salary(String empName,float salary,int leave)
	{
		System.out.println("Employee name :"+empName+" "+"Salary :"+salary+" "+"Leave :"+leave);
	}
}

class Manager extends Company  //extends for company class
{
	void Salary(String empName,float salary,int leave,int bonus)
	{
		System.out.println("Manager name :"+empName+" "+"Salary :"+salary+" "+"Leave :"+leave+" "+"Bonus :"+bonus);
	}
}

public class Hierarchical {
	public static void main(String[] args) {
		
		Manager m=new Manager(); //derived1 object
		Employee e=new Employee(); //derived2 object
		e.Salary("Emplyees",12000,8); //method overloading
		m.Salary("Manager",35000,12, 20000); //method overloading differentiate in parameters
	}

}
