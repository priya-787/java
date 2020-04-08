// using scanner implemented switch
import java.util.Scanner;
class swi
{
 public static void main(String args[])
  {
      Scanner sc= new Scanner(System.in);
      System.out.println("enter choice");
      int choice;
      choice=sc.nextInt();
      double pi =3.14;
      double area_tri,area_rect,area_cir;
      float l=Float.valueOf(args[0]);
      float b=Float.valueOf(args[1]);
      float r=Float.valueOf(args[2]);
      
    switch(choice)
       {

        case 1:

              area_tri=0.5*l*b;
              System.out.println("area of triangle="+area_tri);
              break;

        case 2:

              area_rect=l*b;
              System.out.println("area of rectangle="+area_rect);
              break; 
        

         case 3: 

              area_cir=pi*r*r;
              System.out.println("area of circle="+area_cir);
              break;

         default:

              System.out.println("wrong choice");
              break;
        }
   }
}

