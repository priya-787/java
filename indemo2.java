//method inner class
class outer
{
   void disp()
    {
       System.out.println("outer class method disp");
       class inner
       {
        void show()
          {
           System.out.println("inner class method show");
          }
        }
        inner r=new inner();
        r.show();
          
    }
   
}
class indemo2
{
   public static void main(String ags[])
    {
        outer r=new outer();
         r.disp();
         
    }
} 
