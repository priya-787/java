
//this keyword
class rm
{
 
 rm(int x)
  { 
    this();
    int sq;
    sq=x*x;
    System.out.println("square="+sq);
   }
 rm()
  { 
      double area,r=10;
      area=3.14*r*r;
      //this(12);
     System.out.println("area="+area);
   }
  
}
class this1
{
   public static void main(String args[])
   {
      rm m=new rm(12);
    
   }

}