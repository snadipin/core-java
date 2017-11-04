
class A 
{
	int a =10;
	int b =10;

}

class Inheri02  extends A
{
	int a =100; // instance variables
	int b =100;

	void add(int a , int b) // local variables // instance method
	{
		System.out.println(a+b); // loacal variables
		System.out.println(this.a+this.b); // instance variables 
		System.out.println(super.a+super.b); // parent class variables

	}

	public static void main(String[] args) 
	{
		new Inheri02().add(1000,1000);
		
	}
}
