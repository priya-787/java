// default constructor= creating the constructor of the same class name
class std
{
     int prn,mark,age;
     char gen;
     String s;
     std()// class constructor called default constructor
     {
       prn=12;
       mark=100;
       age=16;
       gen='f';
        s="priya";
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
class default3
{
   public static void main(String args[])
    {
     std s=new std();
      s.display();
    }
}
