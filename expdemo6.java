// exception handling with ArithmeticException
class expdemo6
{
   public static void main(String args[])
   {
      /*int a=12,b=0,c=0;
       //String s="priya";
       try
       {
         c=a/b;
       }
      catch(ArithmeticException  e)
       {
          System.out.println(e);   
       }*/
      try
       {  
         String s="assignment";
         System.out.println("length="+s.length());
       }
      catch(NullPointerException e)
       {
         System.out.println(e);
      }

      //System.out.println("c="+c);
      System.out.println("rest of code is executed..");
   }
}