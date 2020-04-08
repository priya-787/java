class base
{
   
  void disp()
    {
       System.out.println("base class disp method");
       
    }
}
class der extends base
{
    void disp()
    {
         System.out.println("derived class disp method");
    }
     void show()
   {
     disp();
      super.disp();
   }

}
class superdemo1
{
   public static void main(String ags[])
    {
          der d=new der();
          d.show(); 
     }
}