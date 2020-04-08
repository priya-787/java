import java.util.*;
// scanner
class scdemo
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);

     System.out.println("Enter no:");
       int n=sc.nextInt();
       System.out.println("n="+n);

     System.out.println("Enter name:");
       String s=sc.next();
       System.out.println("name="+s);

     System.out.println("Enter character:");
         char ch=sc.next().charAt(0);
         System.out.println("ch="+ch);   

     System.out.println("Enter float no:");
        float b=sc.nextFloat();
        System.out.println("b="+b);
      
     System.out.println("Enter long no:");
        long l=sc.nextLong();
        System.out.println("l="+l);

    }
}
