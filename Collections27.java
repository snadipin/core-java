
import java.util.*;

class MyComp implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		 String s1=o1.toString();
		 String s2=o2.toString();
		return s1.compareTo(s2);
	}
}

class  Collections27
{
	public static void main(String[] args) 
	{
		TreeSet s = new TreeSet(new MyComp());
		s.add(new StringBuffer("losangles"));
		s.add("amsterdam");
		s.add(new StringBuffer("addanki"));
		System.out.println(s);
	}
}
