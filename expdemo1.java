// exception handling with ArithmeticException
class expdemo1
{
   public static void main(String args[])
   {
      int a=12,b=0,c=0;
       try
      {
      c=a/b;
      }
      catch(ArithmeticException  e)
     {
          System.out.println(e);   
      }

      System.out.println("c="+c);
      System.out.println("rest of code is executed..");
   }
}