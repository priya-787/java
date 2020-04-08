class throw
{  
   void validate(int age)
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
      throw t=new throw();
      t.validate(12);  
      System.out.println("rest of the code...");  
    }  
}  
