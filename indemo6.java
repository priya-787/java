class values
{
int a,b;
   void get()
  {
    a=23;
    b=34;
   }
}
class mult extends values
{
   int ans;
   void multi() 
   {
     ans=a*b;
      System.out.println("multi="+ans);
    }
}
class divi extends values
{
  int ans;
   void div()
     {
       ans=a/b;
       System.out.println("divi="+ans);
      }
}
class indemo6
{
   public static void main(String args[])
 
   { 
        mult m=new mult();
        m.get();
        m.multi();
        divi d=new divi();
        d.get();
        d.divi();

   } 
}  

     
         