//Getter setter 	
import java.util.Scanner;
	
	class Private
	{
		//Declared private variables
		private int id;
		private String name;
		private  String collage;
		private  double mark;
		
		//create getter and setter method for all private variables
		public double getMark()
		{
			
			return mark;
		
		}
		
		public void setMark(double mark) {
		
			Scanner in=new Scanner(System.in);
			
			System.out.println("Enter your Mark :");
			
			this.mark =in.nextDouble() ;
		
		}
		
		public int getId() {
		
			return id;
		
		}
		
		public void setId(int id) {
		
			Scanner in=new Scanner(System.in);
			
			System.out.println("Enter your ID :");
			
			this.id =in.nextInt();
		
		}
		
		public String getName() {
		
			return name;
		
		}
		
		public void setName(String name) {
		
			Scanner in=new Scanner(System.in);
			
			System.out.println("Enter your Name :");
			
			this.name =in.nextLine();
		
		}
		
		public  String getCollage() {
		
			return collage;
		
		}
		
		public  void setCollage(String collage) {
		
			Scanner in=new Scanner(System.in);
			
			System.out.println("Enter your Collage Name :");
			
			this.collage =in.nextLine();
		
		}
		
	}
	public class encap {
		
		public static void main(String[] args) 
		
		{
			
			Private p1=new Private();
		
			p1.setId(0);
			p1.setName(null);
			p1.setMark(0);
			p1.setCollage(null);
		
			 System.out.println("ID : "+p1.getId()+",  NAME : "+p1.getName()+",  MARK : "+p1.getMark()+", 1 COLLAGE : "+p1.getCollage()); 
				
		}
	}
