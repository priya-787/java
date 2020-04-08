// interface concept with one simple class and other interface class 
//using extends and implement at a time 
class ab
{
   int a=18,b=10;
   void sub()
      {
         System.out.println("sub="+(a-b));
      }
 }
interface cd 
  {
     void add();
  }
class der extends ab implements cd
 { 
    int a=18,b=10;
     public void add()
     {
       System.out.println("add="+(a+b));
     }
 }
class interface5
{
  public static void main(String args[])
   {
     der d= new der();
     d.sub();
     d.add();
    }
}

   