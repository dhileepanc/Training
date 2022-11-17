//Method overloading for eCommerce payment 
package polyorphism;
class EcommercePayment
{

	//Method overloading by changing arguments and data types
	
	void paymentGateway(String cardNum,int expYr,String cardHolderName,int CVV)
	{
		System.out.println("Credit Card :");
		System.out.println("Card Number : "+cardNum+"\n"+"Valid Thru :"+expYr+"\n"+"CVV :"+CVV);
	}
	
	void paymentGateway(String cardNum,int expMon,int expYr,String cardHolderName,int CVV)
	{
		System.out.println("Debit Card Payment :");
		System.out.println("Card Number : "+cardNum+"\n"+"Valid Thru :"+expMon+"/"+expYr+"\n"+"CVV :"+CVV);
	}
	
	void paymentGateway(String UPI)
	{
		System.out.println("UPI Payment :");
		System.out.println("UPI Id :"+UPI);
	}
	
	void paymentGateway(long mobileNumber )
	{
		System.out.println("Paytm pannu :");
		System.out.println("Mobile number :"+mobileNumber);
	}
}

public class polymorphismOverload {
	public static void main(String[] args) {
	
		EcommercePayment p=new EcommercePayment(); //Object Create
		p.paymentGateway("1234567891234567", 2026, "Raja", 123); // values initialization
		System.out.println("\n");
		
		p.paymentGateway("8456123456781245", 03, 2025, "Dhileepan", 555); // values initialization
		System.out.println("\n");
		
		p.paymentGateway("raj12345@upi"); // values initialization
		System.out.println("\n");
		
		p.paymentGateway(1234567891); // values initialization
		
	}

}
