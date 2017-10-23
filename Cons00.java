/* basic rules to declare constuctor :

constuctor name and class name must be same
constuctors won't return any return type
parameters can passed to a constuctor


important !!! if no constructor is declared int the class then,
 compiler will generate default (0-argument) constructor and
jVM will ecxcute the default constructor
there are two types of constructors 1) default constructor(0-argument)    2) USER DEFINED CONSTRUCTOR(0-ARGUMENT OR PARAMETER CONSTUCTOR) */
class   TEST
{
	void m1()
	{
		int a = 20;
        System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		TEST t= new TEST();  // new TEST() is constructor 
		t.m1();
	}
}
