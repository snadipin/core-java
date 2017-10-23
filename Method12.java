method vs object
class Emp {}
class Student {}

class Method12 
{
	Emp m1()
	{
		Emp e = new Emp();
		System.out.println(" Emp class");

		return e ;
	}

	Student m2()
	{
		System.out.println(" student menthod");
			return new Student();
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Method12 m=new Method12();
		Emp a=m.m1();
		System.out.println(a);
		Student s=m.m2();

		System.out.println(s);
	}
}
