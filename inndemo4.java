interface ex
{
   
   void show();
}
class inndemo4
{
   public static void main(String args[])
    {
        ex x=new ex()
        {
           public void show()
           {
             System.out.println("hello");
            }
        };
        x.show();
    }
}
