// interface
class emp
{
   int emp_id;
   String s;
  void set()
  {
   emp_id=12;
   s="priya";
  }
}
class info extends emp
{
   int age=21;
   char gen='f';
   void disp()
   {
      System.out.println("emp id="+emp_id+"\nName="+s+"\nage="+age+"\ngender="+gen);        
  }
}
class work extends emp
{
  int t_time, d_time=5,n_time=5;
  void cal()
  {
      t_time=d_time+n_time;
   }
  void disp()
   {
    System.out.println("emp id="+emp_id+"\nName="+s+"\ntotal time="+t_time);
   }
}
class interface4
{
    public static void main  (String args[])
    {
        info i=new info();
        work w=new work();
       i.set();
       i.disp();
       w.set();
       w.cal();
       w.disp();
    }
}
