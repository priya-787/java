class hello implements Runnable
{
   int i;
    public void run()
    {
     for(i=1;i<=5;i++)
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
class hi implements Runnable
{
   int i;
    public void run()
    {
     for(i=1;i<=5;i++)
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
class threaddemo2
{
   public static void main(String args[])  
    {
       hello h=new hello();
        hi h1=new hi();
          Thread t=new Thread(h);
	 Thread t1=new Thread(h1);

        t.start();
          try
           {
     		Thread.sleep(500);
            }
            catch(Exception e){}
          try
	    {
		t.join();
	     }
             catch(Exception e){}


         t1.start();
        System.out.println("Name of thraed hello="+t.getName());
          t1.setName("mythread");
           System.out.println("Name of thraed hi="+t1.getName());
            System.out.println("Id of thraed hello="+t.getId());
           System.out.println("Id of thraed hi="+t1.getId());
    }
}