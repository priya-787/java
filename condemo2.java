// parmeter constructor
class stud
{
    int rno;
     String s;
     stud(int r,String nm)
     {
       rno=r;
        s=nm;
      }
      void disp()
     {
       System.out.println("rno="+rno);
      System.out.println("nm="+s);
      }
}
class condemo2
{
   public static void main(String args[])
    {
     stud s=new stud(1,"pooja");
      s.disp();
    
    }
}
