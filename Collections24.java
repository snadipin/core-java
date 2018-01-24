

//  public java.util.TreeSet(java.util.Collection<? extends E>);

import java.util.*;

class  Collections24
{
	public static void main(String[] args) 
	{

		TreeSet t1 = new TreeSet();
		t1.add("hari");
		t1.add("raji");
		TreeSet t2 = new TreeSet(t1);
		t2.add("bujja");
		t2.add("manam");
		t2.add("room");
		System.out.println(t2);
	}
}
