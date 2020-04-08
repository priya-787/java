// interface
class stud
{
   int r;
   String s;
  void set()
  {
   r=12;
   s="pooja";
  }
}
class marks extends stud
{
   int m1=78,m2=78,m3=90,t;
  float per;
  void cal()
   {
      t=m1+m2+m3;
      per=t/3;
   }
   void disp()
   {
      System.out.println("Roll no="+r+"\nNmae="+s+"\ntotal="+t+"\nper="+per);        
  }
}
class fees extends stud
{
  int fs=5000;
  void disp()
{
    System.out.println("Roll no="+r+"\nNmae="+s+"\nfees"+fs);
}
}
class inrdemo4
{
    public static void main  (String args[])
    {
        marks m=new marks();
        fees f=new fees();
       m.set();
       m.cal();
        m.disp();
       f.set();
       f.disp();
    }
}
