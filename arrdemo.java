// command line argument with array
class arrdemo
{
   public static void main(String args[])
   {
       int a[]={34,5,6,7,8};
       //int b[]=new int[5];
        /*for(i=0;i<5;i++)
	{
	   System.out.println(a[i]);
       }*/
      for( int i:a)
        {
          System.out.println(i);
        }
  }

}
