// interface concept
interface ab
 {
  void sub();
  void add();
 }
class der implements ab
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
class interface1
{
  public static void main(String args[])
   {
     der d= new der();
     d.sub();
     d.add();
    }
}

   