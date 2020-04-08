// interface concept with two base class
interface ab
 {
  void sub();
  }
interface cd
  {
  void add();
 }
class der implements ab,cd
 { 
    int a=18,b=10;
    public void sub()
      {
         System.out.println("sub="+(a-b));
      }
    public void add()
     {
       System.out.println("add="+(a+b));
     }
 }
class interface2
{
  public static void main(String args[])
   {
     der d= new der();
     d.sub();
     d.add();
    }
}

   