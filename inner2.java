//non-static = member inner class
// application on hostel room booking with avaliable room and occuiped room
class outer
{
   int total_rm=48,addmission=100,capacity_1rm=4;

   void disp()
    {
       System.out.println("total_room="+total_rm+"\n total-addmission="+addmission+"\n capacity_of _1_room="+capacity_1rm);
    }

    class inner
    {
      int total_occupied,total_aval;
      void show()
       {
           total_occupied=addmission/capacity_1rm;
           total_aval=total_rm-total_occupied;
           System.out.println("total occupied room="+total_occupied+"\n total_avaliable_room="+total_aval);
       }
    }
}
class inner2
{
   public static void main(String ags[])
    {
        outer r=new outer();
         r.disp();
         outer.inner n=r.new inner();
         n.show();
    }
} 
