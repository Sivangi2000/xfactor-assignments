import java.util.*;
 class ClockAngle {
     double h,m;
     ClockAngle(double h1,double m1)
     {
        h=h1;
        m=m1;
     }
     public double findAngle()
     {
        double a=0.0;
        a=(30*h)-((11*m)/2);
         /*else
         {
             a=((11*m)/2)-(30*h);
         }*/
         return a;
     }
    }
    class ClockMain{
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         double h=sc.nextDouble();
         double min=sc.nextDouble();
         ClockAngle obj=new ClockAngle(h,min);
         System.out.println("The angle is "+obj.findAngle()+" degree");
     }
}
