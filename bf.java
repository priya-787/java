//buffereader
import java.io.*;
class bf
{
   public static void main(String args[])
   {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      try
      {   
          System.out.println("Enter no:");
          int n=Integer.parseInt(br.readLine());
          System.out.println("n="+n);
          
          System.out.println("Enter float no:");
          float a=Float.valueOf(br.readLine());
          System.out.println("a="+a);

          System.out.println("Enter  long no:");         
          long b=Long.parseLong(br.readLine());
          System.out.println("b="+b);

         System.out.println("Enter string:");
         String c=(br.readLine());
         System.out.println("c="+c);
         
         
         System.out.println("Enter charter:");
         char ch=(char)br.read();
         System.out.println("ch="+ch);
       }
       catch(Exception e){}
   
  }
} 




     
      