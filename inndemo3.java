class out
{
   void disp()
   {
      System.out.println("outer class methos is called..");
   }
   static class in
    {
         void show()
        {
           System.out.println("inner class method");
         }
     }
   
}
class inndemo3
{
   public static void main(String args[])
    {
       out t=new out();
       t.disp();
        out.in x=new out.in();
        x.show();
    }
} 