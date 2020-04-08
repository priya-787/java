class method1
{
       int a=Integer.parseInt(args[0]);
       int b=Integer.parseInt(args[1]);
       int c;
       void disp()
         {
             c=a+b;
             System.out.println("c="+c);
           System.out.println("outer class is called..");
          }
}
   
   class in1
       {
            int a=45,b=53,c;
              void show()
              {
                        c=a+b;
                         System.out.println("addition ="+c);
                          System.out.println("inner class method is called...");
               }
      class  center  
              {          
                     public static void main(String args[])
                   {
                       member1 m=new member1();
                       m.disp();
                       member1.in1 x=m.new in1();
                       x.show();
                     }
              }
       } 
           