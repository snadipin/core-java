import java.util.*;

class Collection05
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		// adding data
		a.add(10);
		a.add("harish");
		a.add(10.9);
		a.add("rajesh");

		System.out.println(a);

		/*

		
E:\core java by ratan\java applications>javac Collection05.java
Note: Collection05.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

E:\core java by ratan\java applications>java Collection05
[10, harish, 10.9, rajesh]

*/
     // to remove 10 object

	/******************** a.remove(10);//it will take as index and the o/p is   ********************/
     System.out.println(a);

	 /*

	 E:\core java by ratan\java applications>java Collection05
[10, harish, 10.9, rajesh]
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 10, Size: 4
        at java.util.ArrayList.rangeCheck(Unknown Source)
        at java.util.ArrayList.remove(Unknown Source)
        at Collection05.main(Collection05.java:29)
		*/

	//	to overcome there are two options  

	/* #01

	 know the index value and remove 

	a.remove(0);// as 10 is first object with zero index
	System.out.println(a); */

	// #02

	Integer i = new Integer(10);
	a.remove(i);
	System.out.println(a);






	

	}
}