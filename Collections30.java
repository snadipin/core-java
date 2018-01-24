
import java.util.*;

class Collections30 
{
	public static void main(String[] args) 
	{
		HashMap h = new HashMap();
		h.put(111,"harish");
		h.put(222,"rajesh");
		System.out.println(h);
		// to print only key values use keySet method

		Set s = h.keySet();
		System.out.println(s);
		// to print only values use vaules method
		Collection c = h.values();
		System.out.println(c);

		       /* vvvvvvvvvvvvvvvvvvvvvvvv impppppppppppp*/ 
			
		       // entrySet() is the methos used to get all enteries 
		       //  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();  -- set is interface
		    
			
			Set ss=h.entrySet();
			   /* cursurs are not applicable to MaP BECOZ CURSUR are applicable only for collection
		       now assigned all the entiries to Set interface .

		        As SET interfae is collection , we can use cursurs to set interface

		        the only cursor applicable to SET interface is ITERATOR as it is UNIVERSAL cursor

		       */
   
			Iterator I=ss.iterator();
			// calling iterator

			while(I.hasNext())
		   {
				//I.next(); type casting of key-value pair ie; Map.Entry
			  Map.Entry mp=(Map.Entry)I.next();
			  // calling the values and keys
			  System.out.println(mp.getKey()+"....."+mp.getValue());
		     }
  



	}
}
