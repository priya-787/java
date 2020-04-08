//method inner class=local inner class
// diplaying the mess bill accounding to their filling days 
class outer
{ 
   static int total_day=20,bill_1day=60,total_bill=1800;
   void disp()
    {
       System.out.println("\n total_day_of_mess="+total_day);
       System.out.println("\n bill_of_1day="+bill_1day );
       System.out.println("\n total_bill="+total_bill );    
    }
    static class inner
    {
       int full_day_bill,rem_bill;
     void show()
      {
        full_day_bill=total_day*bill_1day;
        rem_bill=total_bill-full_day_bill;
        
        System.out.println("\n bill_of_total-days="+full_day_bill);
        System.out.println("\n remaining_bill="+rem_bill);
      }
   }
   
}
class inner33
{
   public static void main(String ags[])
    {
        outer r=new outer();
         r.disp();
         outer.inner n=new outer.inner();
         n.show();
         
    }
} 
