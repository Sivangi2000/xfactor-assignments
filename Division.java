import java.util.*;
class Division{
    private static int divide(int num,int den)
    {int c=0;
        while(num>0)
        {
            num=num-den;
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);int a;
        int num=sc.nextInt();
        int den=sc.nextInt();
        a=divide(num,den);
        System.out.println("Quotient is "+a);
    }
}
