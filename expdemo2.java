//// exception handling with ArithmeticException
class expdemo2
{
   public static void main(String args[])
   {
      int a=0,b=12,c=0;
      try
      {
      c=a/b;
       }
       catch(ArithmeticException e)
       {
          System.out.println(e);
         }
      System.out.println("c="+c);
      System.out.println("rest of code is executed..");
   }
}