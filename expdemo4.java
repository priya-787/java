//exception handling with NullPointerException
class expdemo4
{
  public static void main(String args[])  
   {
     
     try
     {
       String s=null;
       System.out.println("Length="+s.length());
     }
     catch(NullPointerException e)
     {

       System.out.println(e);
     }
     int x=2,y=3;
      int z=x+y;
     System.out.println("Addition="+z);
  

    }
}