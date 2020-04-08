class out
{
   void disp()
   {
      System.out.println("outer class methos is called..");
   }
   class in
    {
        void show()
        {
           system.out.println("hi");
         }
    }
}
class inndemo1
{
   public static void main(String args[])
    {
       out t=new out();
       t.disp();
       out.in x= t.new in();
       x.show();
    }
} 