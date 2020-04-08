class ex
{
 int a,b;
 void set(int a,int b)
  {
     this.a=a;
     this.b=b;
   }
   void disp()
   {
      System.out.println("a="+a);
       System.out.println("b="+b);
  }
}
class thisdemo
{
   public static void main(String args[])
   {
      ex x=new ex();
      x.set(12,34);
	x.disp();
   }

}