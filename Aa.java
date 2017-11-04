class  Aa
{
 static 
 {
  System.out.println("A class static block");
 }
  public static void main(String[] args) throws ClassNotFoundException
 {
  Class.forName( "C" );
  
 }
}