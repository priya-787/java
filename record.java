// command line argument
class record
{
   public static void main(String args[])
   {
      
      int a=Integer.parseInt(args[0]);
      float age=Float.valueOf(args[1]);
      long prn=Long.parseLong(args[2]);
      char gen=args[3].charAt(0);
       String name=args[4];
       System.out.println("a="+a);
       System.out.println("age="+age);
       System.out.println("prn="+prn);
       System.out.println("gen="+gen);
       System.out.println("name="+name);       
    }
}