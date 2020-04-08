//super key concept
class base
{
  base()
   {
      System.out.println("base class default constructor");
   }
   base(int a)
   {
      System.out.println("a="+a);
    }
}
class der extends base
{
     der()
      {
          super(3);
         System.out.println("derived class default constructor");        
     }
}
class superdemo3
{
   public static void main(String args[])
      {
         der d=new der();
     }
}