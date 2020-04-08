//StringTokenizer
import java.util.StringTokenizer;  
public class SimpleToken
 {  
 public static void main(String args[]) 
  {  
     StringTokenizer st = new StringTokenizer("my name is Priya Abasaheb Waghamode "," ");  
     while (st.hasMoreTokens())
      {  
         System.out.println(st.nextToken());  
      }

     StringTokenizer st1 = new StringTokenizer("My Life My Rules Don't ignore my attitude "," ");  
     while (st1.hasMoreTokens())
      {  
         System.out.println(st1.nextToken());  
      }  
   }  	
}  
