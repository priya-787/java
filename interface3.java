// interface concept with  two interface class ,and one of them class extends other interface class
interface ab
 {
  void sub();
  }
interface cd extends ab
  {
  void add();
 }
class der implements cd
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
class interface3
{
  public static void main(String args[])
   {
     der d= new der();
     d.sub();
     d.add();
    }
}

   