
class expdemo5
{
  public static void main(String args[])  
   {
     
     try
     {
      int a=Integer.parseInt("abc");
      System.out.println("a="+a);
     }
     catch(NumberFormatException e)
     {

       System.out.println(e);
     }
     int x=2,y=3;
      int z=x+y;
     System.out.println("Addition="+z);
  

    }
}