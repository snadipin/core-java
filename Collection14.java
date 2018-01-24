import java.util.*;

class Collection14
{
	public static void main(String[] args) 
	{
		// generic version converion into array
		ArrayList<String> a1 = new ArrayList<String>(); 
		a1.add("gopi");
		a1.add("akhil");
        
		// conversion of ArrayList into Array
		String [] a=new String[a1.size()];

		a1.toArray(a); // toArray([T])  where T is a array

     
	   // reading from array a
		for(String ss :a)
		{
		System.out.println(ss);

		}

	// NORMAL VERSION

	ArrayList g= new ArrayList();
	g.add("harishhhh");
	g.add(10);
	g.add(10.9);
	g.add("rajeshhhh");

	Object [] F = g.toArray();

	for(Object o :F)
		{
		System.out.println(o);
		}



	}
}