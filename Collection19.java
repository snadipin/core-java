import java.util.*;
class Collection19 
{
	public static void main(String[] args) 
	{

		HashSet<String> h = new HashSet<String>();
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("A");
		h.add("A234");
		Iterator <String> itr =h.iterator();
		while (itr.hasNext())
		{
			String i = itr.next();
		    System.out.println(i);
		   // System.out.println(itr.size()); ----- do it


		}
	
	}
}