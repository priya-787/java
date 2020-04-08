// exception habndling with try with in try
class expdemo7
{
   public static void main(String args[])
    {
        int a[]=new int[5];
        int x=2,y=2,b=0;
        try
         { 
          //ArithmeticException 
                  try
                     { 
                        int c=x/b;
                     }
                 catch(ArithmeticException e)
                    {
                      System.out.println(e);
                    }
        //ArrayIndexOutOfBoundsException
                try
                  {
                      a[7]=x/y;
                   }
               catch(ArrayIndexOutOfBoundsException e)
                  {
                       System.out.println(e);
                    }
       //NullPointerException
               try
                  {
                       String s=null;
                       System.out.println("Length="+s.length());
                   }
               catch(NullPointerException e)
                 {
                       System.out.println(e);
                 }
       //NumberFormatException 
            try
               {
                        int m=Integer.parseInt("abc");
                       System.out.println("m="+m);
               }
            catch(NumberFormatException e)
             {
                   System.out.println(e);
             }
      }
     catch(Exception e)
       {
             System.out.println(e);
       }
    System.out.println("hello");
    }
}