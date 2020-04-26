package oopconcept;
class Enc1
{
	int a,b,c;
	
	public void Balance()
	{
		a=10111;
		b=201111;
		c=a+b;
			System.out.println("Your Balance="+c);
	}
}

class Enc2
{
	int a,b,c;
	
	public void Withdraw()
	{
		a=1044;
		b=20;
		c=a+b;
			System.out.println("You have successfully withdrawn  ="+c);
	}
}

public class Encapsulation {

	public static void main(String[] args)
	{
		//Enc1 e1 = new Enc1();
		//e1.Balance();
		Enc2 e2 = new Enc2();
		e2.Withdraw();
		

	}

}
