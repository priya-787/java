// command line agument
class cmddemo
{
   public static void main(String args[])
   {
      
      int n=Integer.parseInt(args[0]);
      float f=Float.valueOf(args[1]);
      long l=Long.parseLong(args[2]);
      char ch=args[3].charAt(0);
       String s=args[4];
       System.out.println("n="+n);
       System.out.println("f="+f);
       System.out.println("l="+l);
       System.out.println("ch="+ch);
       System.out.println("s="+s);       
    }
}