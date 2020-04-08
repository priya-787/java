class base
{
   
 base()
    {
       System.out.println("base class disp method");
       
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
         super(12);
       System.out.println("derived class disp method");
       
      }
     der(int x,int y)
      { super(12);
          System.out.println("add="+(x+y));
       
      }
}
class superdemo2
{
   public static void main(String ags[])
    {
          der d=new der(3,4);
       
     }
}