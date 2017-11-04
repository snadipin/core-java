
/* rule -5 ~ static variables are unable to override becoz there are specfic to class not object 

 this method is called method hiding */ 




class Parent 
{
	static void m1()
	{
		System.out.println("a");
	}
}
class Child extends Parent
{
	static void m1()
	{
		System.out.println("b");
	}


	public static void main(String[] args) 
	{

   Parent p = new Child();
   p.m1();

	}
}

/* E:\core java by ratan\java applications>javac Poly10.java

E:\core java by ratan\java applications>java Child
a */