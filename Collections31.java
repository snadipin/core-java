

// forth constructor
import java.util.*;

class Collections31
{
	public static void main(String[] args) 
	{
		HashMap h1 = new HashMap();
		h1.put("fruit","orange");
		h1.put("vegtable","carrot");
		//System.out.println(h1);
		HashMap h2 = new HashMap();
		h2.put("softDeinks","pepsi");
		h2.put("hotDrinks","beer");
		h2.putAll(h1); // addind all h1 hashmap objects to h2 hashmap
		System.out.println(h2);
	}
}

/*
E:\core java by ratan\java applications>javac Collections31.java
Note: Collections31.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

E:\core java by ratan\java applications>java   Collections31
{vegtable=carrot, softDeinks=pepsi, fruit=orange, hotDrinks=beer}

E:\core java by ratan\java applications>
*/
