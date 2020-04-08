// static varible,
class exam
{
   static int roll_no;
   String nm;
   exam(String s)
   {
     roll_no++;
      nm=s;
     
   }
 void disp()
   {
      System.out.println("\nRoll No="+roll_no+"\nName="+nm);
    }

}
class static1
{
    
   /*static
   {
      int a=23,b=45;
     System.out.println("add="+(a+b));
   }*/
   public static void main(String args[])
   {
        exam x=new exam("komal");
         x.disp();
  	exam s=new exam("pooja");
          s.disp();
	exam z=new exam("neha");
          z.disp();
     }
}
    