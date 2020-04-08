// exception handling with multiple catch
class expdemo8
{
   public static void main(String args[])
    {
        int a[]=new int[5];
        int x=2,y=0;
        try
       {
           a[7]=x/y;
          int m=Integer.parseInt("abc");
          System.out.println("m="+m);
       }
        catch(ArithmeticException e)
          {
                System.out.println(e);
            }
        catch(ArrayIndexOutOfBoundsException e)
             {
                  System.out.println(e);
             }
       catch(NumberFormatException e)
             {
                   System.out.println(e);
             }
	 
        System.out.println("hello");
    }
}