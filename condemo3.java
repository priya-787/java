// copy constructor
class stud
{
    int rno;
     String s;
     stud(int r,String nm)
     {
       rno=r;
        s=nm;
      }
        stud(stud x)
     {
       rno=x.rno;
        s=x.s;
      }
      void disp()
     {
       System.out.println("rno="+rno);
      System.out.println("nm="+s);
      }
}
class condemo3
{
   public static void main(String args[])
    {
     stud s=new stud(1,"pooja");
      s.disp();
      stud x=new stud(s);
      x.disp();
    
    }
}
