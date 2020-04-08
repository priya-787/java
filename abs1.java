//abstract class concept
abstract class ab
 {
  int a,b;
  void add()
   { 
    a=8;
    b=10;
    int c=a+b;
   System.out.println("add="+c);
  }
abstract void sub();
}
class xy extends ab
 {
  void sub()
     {
      a=10;
      b=5;
      int c=a-b;
     System.out.println("sub="+c);
    }
  }
class abs1
{
  public static void main(String args[])
  {
    xy x=new xy();
   x.add();
   x.sub();
  }
}