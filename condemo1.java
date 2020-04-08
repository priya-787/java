// default constructor
class stud
{
    int rno;
     String s;
     stud()
     {
       rno=1;
        s="pooja";
      }
      void disp()
     {
       System.out.println("rno="+rno);
      System.out.println("nm="+s);
      }
}
class condemo1
{
   public static void main(String args[])
    {
     stud s=new stud();
      s.disp();
    
    }
}
