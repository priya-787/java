//method inner class
class outer
{
   void disp()
    {
       System.out.println("outer class method disp");
      
      
          
    }
      static class inner
       {
        void show()
          {
           System.out.println("inner class method show");
          }
        }
   
}
class indemo3
{
   public static void main(String ags[])
    {
        outer r=new outer();
         r.disp();
         outer.inner n=new outer.inner();
         n.show();
         
    }
} 
