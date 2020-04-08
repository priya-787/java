class hello extends Thread
{
   public void run()
    {
       for(int i=0;i<5;i++)
       {
            try
            {
               Thread.sleep(1000);
             }
             catch(Exception e){}
 
           System.out.println("hello");
        }
    }
}
class hi extends Thread
{
   public void run()
    {
       for(int i=0;i<5;i++)
       {
             try
            {
               Thread.sleep(1000);
             }
             catch(Exception e){}
           System.out.println("hi");
        }
    }
}
class thdemo1
{
   public static void main(String ags[])
     {
        hello h=new hello();
         hi h1=new hi();
         h.start();
          try
           {
             Thread.sleep(500);
            }
            catch(Exception e){} 
          h1.start();
     }
}