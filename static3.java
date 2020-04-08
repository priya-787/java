class ex
{
   static int r;
   ex()
   {
     r++;
     System.out.println(r);
   }
    static void disp()
    {
      int d=2,sq;
      double ar;
      sq=d*d;
      ar=3.14*d*d;
      System.out.println("square="+sq+"\n area of circle="+ar);
    }

}
class static3
{
   static
   {
     int a=20,b=40;
     System.out.println("add="+(a+b));
     System.out.println("sub="+(b-a));
     System.out.println("div="+(b/a));
     System.out.println("mul="+(a*b));

   }
   public static void main(String args[])
   {
        ex x=new ex();
  	ex s=new ex();
	ex z=new ex();
	ex.disp();
    }
}
    