// inner class concept
class outer
{
  String s="priya";
  char gen='f';
  void display()
   {
     System.out.println("name="+s+"\n gender="+gen);
   }
  inner r=new inner();
  r.show();
  class inner
   {
    int prn=10,per=98;
     void show()
     {
     System.out.println("prn.no="+prn+"\n percentage="+per);
     }
   }
}
class inner1
{
 public static void main(String arg[])
  {
   outer o=new outer();
   o.display();
  }
} 


 