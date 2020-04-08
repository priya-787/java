class hello
{
   int i;
    void disp()
    {
     for(i=1;i<=5;i++)
      {
        System.out.println("hello");
      }

    }
}
class hi
{
   int i;
    void disp()
    {
     for(i=1;i<=5;i++)
      {
        System.out.println("hi");
      }

    }
}
class threaddemo
{
   public static void main(String args[])  
    {
       hello h=new hello();
        hi h1=new hi();
        h.disp();
         h1.disp();
    }
}