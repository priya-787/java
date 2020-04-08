//interface within interface

interface ex
{
int a=44,b=654,;
   void show();
     interface ex1
      {
          void disp();
       }
}
class der implements ex,ex.ex1
{
     public void disp()
     {
          System.out.println("hi");
	}
     public void show()
     {      int c;
            c=a+b;
          System.out.println("c="+c);
	}
}
class inndemo55
{
    public static void main(String args[])
    {
       der d=new der();
       d.show();
       d.disp();
      }
}

