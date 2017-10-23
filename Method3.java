




/*  PLEASE SATART UNDERSATNDING FROM MAIN METHOD DON'T LOOK ANY THING THAN THIS */




class X{}          // classes for creating objects
class EMP{}
class Student{}

class Method3 
{
	void m1( X x, EMP e) // excepting objects (x,e) for X and EMP class 
	{
	   System.out.println("INSTANCE METHOD");	
	}
	static void m2(Student s , int b)
	{
	   System.out.println("STATIC METHOD");	
	}

	public static void main(String[] args) 
	{

        X a=new X();
		EMP E = new EMP();
		Student s=new Student();
		Method3 m= new Method3();
		m.m1(a,E);
		Method3.m2(s,52);

	}
}
