class Player
{
	void sports()
	{
		System.out.println("Sports name : Cricket");
	}
}

class Team extends Player
{
	void nationality()
	{
		System.out.println("Nationality : Indian");
	}
}

class Board extends Team
{
	void teamName()
	{
		System.out.println("Board Of Control for Cricket in India");
	}
}

class Captain extends Board
{
	Captain() //default Constructor 
	{
		System.out.println("Captain : Rishab pant");
	}
}

public class Multilevel {
	public static void main(String[] args) {
		Captain p=new Captain();
		
		p.sports();
		p.nationality();
		p.teamName();
			
	}

}
