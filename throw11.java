// exception handling with throw
class thr
{  
   void show(int age)
     {  
      if(age<18)  
           throw new ArithmeticException("not valid");  
       else  
           System.out.println("welcome to vote");  
     }  
}
class throw11
{ 
    public static void main(String args[])
     {  
      thr t=new thr();
      t.show(12);  
      System.out.println("rest of the code...");  
    }  
}  
