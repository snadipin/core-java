
/* interface is pure abstarct and it contains only the abstarct methods

 so, object creation not possible

 all interface methods are public and abstract ; so methods in implementation also must be public while overriding */


interface  It1 // abstract
{
	void m1();
	void m2();  // abstarct , public
	void m3();
}
class Child implements It1
{
  public void m1()    // if not public you will below error; while overriding we should not decrease the permissions
	{
        System.out.println("m1");
	}

    public void m2()
	{
        System.out.println("m2");
	}
	public  void m3()
	{
        System.out.println("m3");
	}
	public static void main(String[] args) 
	{
		Child c = new Child();
		c.m1();
		c.m2();
		c.m3();
       // It1 i = new Child();  //perfectly valid it acn able to hold implementation object
	}
}


/* if not declared public you will get below error

E:\core java by ratan\java applications>javac  interface00.java
interface00.java:18: error: m3() in Child cannot implement m3() in It1
         void m3()
              ^
  attempting to assign weaker access privileges; was public
interface00.java:14: error: m2() in Child cannot implement m2() in It1
     void m2()
          ^
  attempting to assign weaker access privileges; was public
interface00.java:9: error: m1() in Child cannot implement m1() in It1
   void m1()
        ^
  attempting to assign weaker access privileges; was public
3 errors

*/