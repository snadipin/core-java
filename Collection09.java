
import java.util.*;
class  Collection09
{
	public static void main(String[] args) 
	{
		ArrayList <String> al = new ArrayList <String>();
		al.add("harish");
		al.add("rajesh");


		/* NORMAL ITERATOR -- by using iterator we can able to retrive any type of object , no type safety  and also typecasting is also required*/

	   Iterator itr = al.iterator();

	   while(itr.hasNext())
		{
           String str = (String) itr.next();
		  System.out.println(str); 
        }


		/* GENERIC ITERATOR */

		 Iterator<String> itr1 = al.iterator();

		 while(itr1.hasNext())
		{
			 String st=itr1.next();  // no type-casting and also due to generic only String object is able yoretrive
             System.out.println(st);
		}






        

		
	}
}
