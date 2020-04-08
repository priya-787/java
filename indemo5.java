//anonoumas inner class
interface ex
{
   void disp();
}
class indemo5
{
    public static void main(String args[])
    {
        ex x=new ex()
        {
          public void disp()
           {
              System.out.println("hello");
            }
         };
         x.disp();
    }
}   