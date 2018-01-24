
import java.util.*;

class MyComp implements Comparator<StringBuffer>
{
	public int compare(StringBuffer sb1 , StringBuffer sb2)
	{
		String s1=sb1.toString();
		String s2=sb2.toString();

		return s1.compareTo(s2);
	}
}

class Collections26 
{
	public static void main(String[] args) 
	{
		//TreeSet t = new TreeSet();
		  TreeSet t = new TreeSet(new MyComp());
        t.add(new StringBuffer("gopi"));
		t.add(new StringBuffer("akhil"));
		t.add(new StringBuffer("subbu"));
		t.add(new StringBuffer("harish"));
		t.add(new StringBuffer("rajesh"));
		
		System.out.println(t);
		   /*E:\core java by ratan\java applications>javac Collections26.java
             Note: Collections26.java uses unchecked or unsafe operations.
             Note: Recompile with -Xlint:unchecked for details.

             E:\core java by ratan\java applications>java Collections26
             Exception in thread "main" java.lang.ClassCastException: java.lang.StringBuffer cannot be cast to java.lang.Comparable
             at java.util.TreeMap.compare(Unknown Source)
             at java.util.TreeMap.put(Unknown Source)
             at java.util.TreeSet.add(Unknown Source)
             at Collections26.main(Collections26.java:10)

             E:\core java by ratan\java applications> */

            // to overcome this we use comparator (writing at line3) 

	}
}
