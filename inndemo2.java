class out
{
  char ch='a',roll no,m1=53,m2=45,m3=45,total,avg;
   void disp()
   {  total=m1+m2+m3;
      System.out.println("total="+total);
      System.out.println("character is "+ch);
      System.out.println("outer class methos is called..");
       class in
       {
         void show()
        {
           System.out.println("inner class method");
         }
       }
       in x= new in();
       x.show();
   }
   
}
class inndemo2
{
   public static void main(String args[])
    {
       out t=new out();
       t.disp();
      
    }
} 