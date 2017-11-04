

/* FINAL modifier 
  1) if a class declared as final inhertiance is not possible
  2) if a method declared as final overriding is not possible
  3) if a variable is declared as final reassinment is not possible

  */


class Parent 
{
	
	public static void main(String[] args) 
	{
		final int a =10;
		a=a+10 ; // reassignment is not possible 
		System.out.println(a);
	}
}



/* 
E:\core java by ratan\java applications>javac Poly07.java
Poly07.java:9: error: cannot assign a value to final variable a
                a=a+10 ;
                ^
1 error */ 
