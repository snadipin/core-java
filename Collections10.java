import java.util.*;
class  Collection19
{
	public static void main(String[] args) 
	{
		ArrayList <String> al = new ArrayList <String>();
		al.add("	harish");
		al.add("	rajesh");
		al.add("	sindhu");
		al.add("	anjamma");
		al.add("	srinivasarao");


		/* GENERIC ITERATOR */

		 ListIterator<String> itr1 = al.listIterator();

		 while(itr1.hasNext())
		{   String str=itr1.next()
             System.out.println(str);
		}

		System.out.println(str);

	}

}
