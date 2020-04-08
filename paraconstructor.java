// parameter constructor=passing parameter in default constructor of class
class std
{
     int prn,mark,age;
     char gen;
     String s;
     std(int p,int m,int a, char g,String nm)// passing parameter in default constructor
     {
       prn=p;
       mark=m;
       age=a;
       gen=g;
        s=nm;
      }
      void display()
     {
       System.out.println("roll_no="+prn);
       System.out.println("mark="+mark);
       System.out.println("age="+age);
       System.out.println("gender="+gen);
      System.out.println("name="+s);
      }
}
class paraconstructor
{
   public static void main(String args[])
    {
     std s=new std(1,100,16,'f',"priya");
      s.display();
    }
}
