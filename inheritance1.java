//single inheritance
class defence
{
   int d_id=123;
   int d_rank=21;
  char gen='f';
   String s="maratha";
   void display()
   { 
      System.out.println("DEFENCE");
      System.out.println("defence id="+d_id);
      System.out.println("defence rank="+d_rank);
       System.out.println("gender="+gen);
       System.out.println("Batalian="+s);
    }
}
class army extends defence
{
   int a_id=1;
   int a_rank=12;
   char gen='m';
   String s="Chhava";
    void show()
     {
        System.out.println("\nARMY");
        System.out.println("Army id="+a_id);
       System.out.println("Army rank="+a_rank);
       System.out.println("Gender="+gen);
       System.out.println("Batalian="+s);
       }
}
class inheritance1
{
   public static void main(String args[])
    {
       army a=new army();
       a.display();
        a.show();

   }
}