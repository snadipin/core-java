
import java.util.*;

class  Collection15
{
	public static void main(String[] args) 
	{

		ArrayList a = new ArrayList();
		a.add("cat");
		a.add("apple");
		a.add("ball");
       
		for(Object o :a)         // before sorting
		{
		System.out.println("before sorting -"+o);
		}

		// (or)

		System.out.println("before sorting -"+a);
         
		  // sorting

			Collections.sort(a) ;   // GETTING ERROR in sys but working tutorails point ide

		System.out.println("after sorting -"+a);
	}
}
