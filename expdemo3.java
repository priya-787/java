//// exception handling with ArrayIndexOutOfBoundsException
class expdemo3
{
  public static void main(String args[])  
   {
     int a[]={1,2,3,4,5};
     try
     {
       a[8]=76;
       System.out.println(a[8]);
     }
     catch(ArrayIndexOutOfBoundsException e)
     {

       System.out.println("size of array is 5");
     }
     int x=2,y=3;
      int z=x+y;
     System.out.println("Addition="+z);
  

    }
}