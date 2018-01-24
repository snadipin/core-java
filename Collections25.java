

        /* public java.util.TreeSet(java.util.SortedSet<E>);*/ 
      
import java.util.*;


class Collections25 
{
	public static void main(String[] args) 
	{
		TreeSet s =  new TreeSet();
		s.add(20);
		s.add(25);
		s.add(56);
		s.add(12);
		s.add(5);
		//System.out.println(s.tailSet(10)); // return type of head and trail set is Sortedset

		SortedSet P = s.tailSet(10);
		TreeSet y = new TreeSet(P); // construction 4
		System.out.println(y);
	}
}
