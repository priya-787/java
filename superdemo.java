class base
{
   int a=12;
}
class der extends base
{
    int a=24; 
    void disp()
    {
       System.out.println("a="+a);
        System.out.println("a="+super.a);
    }

}
class superdemo
{
   public static void main(String ags[])
    {
          der d=new der();
          d.disp(); 
     }
}