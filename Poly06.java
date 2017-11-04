
// rule -4: final method overiding is not possible





 class Parent  
{
	final void marry()  // overriden method
	{
		System.out.println("Hello");
	}

}

class Child extends Parent
{
 void marry()
	{
	 System.out.println("bye");  // overiding method
	}

	public static void main(String[] args) 
	{
		new Child().marry();
	}
}


/* E:\core java by ratan\java applications>javac Poly06.java
Poly06.java:19: error: marry() in Child cannot override marry() in Parent
 void marry()
      ^
  overridden method is final
1 error
*/
