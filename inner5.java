// non static
//anonymous inner class
// using anonums concept finding square and cube

interface ex
{  
  void disp();
}
class inner5
{
    public static void main(String args[])
    {
        ex x=new ex()
        {
          int n=5,sq,cube;
          public void disp()
           {
            sq=n*n;
            cube=n*n*n;
            System.out.println("\n square="+sq);
            System.out.println("\n cube="+cube);            
           }
        };
        x.disp();
    }
}   