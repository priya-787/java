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
      System.out.println("satatic method is called");
    }

}
class staticdemo
{
   static
   {
      int a=23,b=45;
     System.out.println("add="+(a+b));
   }
   public static void main(String args[])
   {
      ex x=new ex();
  	ex s=new ex();
	ex z=new ex();
	ex.disp();
    }
}
    