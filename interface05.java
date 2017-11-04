
 // interface variables

    interface It2
	{
		int a=25; // by default public static final
		void m1(); // by default abstract and public
	}
class Child implements It2
{

	public void m1()
	{
	  a=a+25; // trying to re assign the a value
      System.out.println("a");
	}
	public static void main(String[] args) 
	{
		new Child().m1();
	}
}


/* 


E:\core java by ratan\java applications>javac interface05.java
interface05.java:14: error: cannot assign a value to final variable a
          a=a+25; // trying to re assign the a value
          ^
1 error
 
 */
