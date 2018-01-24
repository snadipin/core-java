import java.util.*;
class Collection18 
{
	public static void main(String[] args) 
	{

		HashSet<Integer> h = new HashSet<Integer>();
		h.add(10);
		h.add(12);
		h.add(13);
		h.add(10);
		h.add(11);
		Iterator <Integer> itr =h.iterator();
		while (itr.hasNext())
		{
			Integer i = itr.next();
		    System.out.println(i);
		   // System.out.println(itr.size()); ----- do it


		}
	
	}
}

/*
E:\core java by ratan\java applications>java Collection18
10
11
12
13

E:\core java by ratan\java applications>

> duplication is not allowd
> inseration order is not preseved

*/