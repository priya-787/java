//super key concept
class base
{
  base()
   {
      
         System.out.println("base class default constructor=");
    }
    
   base(int r)
   {
      double a;
      a=3.14 * r;
      System.out.println("area of circle="+a);
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
class super1
{
   public static void main(String args[])
      {
         der d=new der();
         
     }
}