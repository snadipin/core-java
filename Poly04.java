

// rule 02

// rule -- overriden method return type  and  overriding method return type must be same at PRIMTIVE level
class Parent 
{

	void marriage() // overriden method
	{
      System.out.println("black girl");
	}

}
class Child extends Parent
{

	int  marriage() // overriding method
	{
      System.out.println("white girl");

	  return 10;
	}



	public static void main(String[] args) 
	{
		new Child().marriage();
		
	}
}

/*E:\core java by ratan\java applications>javac Poly04.java
Poly04.java:18: error: marriage() in Child cannot override marriage() in Parent
        int  marriage() // overriding method
             ^
  return type int is not compatible with void
1 error */
