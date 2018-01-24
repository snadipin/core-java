import java.util.*;

class Collection13  
{
	public static void main(String[] args) 
	{
		String[] s ={"harish","rajesh","sindhu"};

		ArrayList<String> a1 = new ArrayList<String>(Arrays.asList(s)); // asList is the method present in Arrays used to covert the arrays into collections

		a1.add("gopi");
		a1.add("akhil");

		for(String ss :a1)
		{
		System.out.println(ss);

		}

		// to call array

		for (String y :s )
		{
			
			System.out.println(y);
		}


	}
}


/*

E:\core java by ratan\java applications>javac Collection13.java

E:\core java by ratan\java applications>java Collection13
harish
rajesh
sindhu
gopi
akhil

*/