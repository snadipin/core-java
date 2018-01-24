

import java.util.*;

class Collections21 
{
	public static void main(String[] args) 
	{

		TreeSet t = new TreeSet();
		t.add("harish");
		t.add("rajesh");
		t.add("sindhu");
		t.add("bujja");
		//t.add(10); //error as below will occur during runtime
		//t.add(null);//error as NPE
		System.out.println(t);
	}
}


/*
E:\core java by ratan\java applications>javac Collections21.java
Note: Collections21.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

E:\core java by ratan\java applications>java Collections21
Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
        at java.lang.Integer.compareTo(Unknown Source)
        at java.util.TreeMap.put(Unknown Source)
        at java.util.TreeSet.add(Unknown Source)
        at Collections21.main(Collections21.java:15)

E:\core java by ratan\java applications>
*/
/*
E:\core java by ratan\java applications>javac Collections21.java
Note: Collections21.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

E:\core java by ratan\java applications>java Collections21
Exception in thread "main" java.lang.NullPointerException
        at java.util.TreeMap.put(Unknown Source)
        at java.util.TreeSet.add(Unknown Source)
        at Collections21.main(Collections21.java:16)

*/