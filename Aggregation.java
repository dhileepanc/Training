package aGgregation;
class person
{
	String name;
	int day;
	int month;
	int year;
	
 public person(String name,int day,int month,int year) {
this.name=name;
this.day=day;
this.month=month;
this.year=year;
 }
 void displayData()
 {
	 System.out.println(name+day+"/"+month+"/"+year);
 }
}
class person1
{
	String company;
	person per;
	public person1(String company,person per) {
this.company=company;
this.per=per;
	}
	void display()
	{
		System.out.println(company);
		per.displayData();
	}
}

public class Aggregation {
	public static void main(String[] args) {
		person per=new person("Dhileepan", 25, 3, 1995);
person1 person1=new person1("Shadowws",per);
person1.display();

	}
	
	

}
