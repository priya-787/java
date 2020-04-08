// copy constructor
class army
{
    int id;
     String s;
     army(int r,String nm)
     {
       id=r;
        s=nm;
      }
        army(army x)
     {
       id=x.id;
        s=x.s;
      }
      void display()
     {
      System.out.println("id="+id);
      System.out.println("nm="+s);
      }
}
class copyconstructor
{
   public static void main(String args[])
    {
     army a=new army(1,"pooja");
      a.display();
      army x=new army(a);
      x.display();
    
    }
}
