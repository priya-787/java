// static varible,
class exam
{
   static int roll_no;//static varible
   //String nm;
   exam(int d)
   {
     d++;
      //nm=s;
     
   }
  static void disp(int r)
   {
     int sq,r;
     sq=r*r;
      System.out.println("\nRoll No="+roll_no+"\nName="+nm+"\nsquare="+sq);
    }

}
class static2
{
    
   /*static
   {
      int a=23,b=45;
     System.out.println("add="+(a+b));
   }*/
   public static void main(String args[])
   {
        exam x=new exam();
         
  	exam s=new exam();
         
	exam z=new exam();
          exam.disp();
     }
}
    