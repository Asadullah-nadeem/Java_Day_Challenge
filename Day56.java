import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        next filea = new next();
        filea.nextl();
        double a;
        double b;
        double c;
        Scanner sc = new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("What is Distance : ");
        b = sc.nextDouble();
        System.out.println("*****************************");
        System.out.println("What is Time :" );
        c = sc.nextDouble();

        System.out.println("*****************************");
        a = b/c;
        System.out.println("Speed " + a);
        System.out.println("*****************************");
        System.out.println("Speed = Distance/Time");
        System.out.println("Distance = " + b + "Km");
        System.out.println("Time = " + c + "hrs");
        System.out.println("Speed = " + a + "Km/h");
        System.out.println("*****************************");
    }
}
class next{
    void nextl(){
        float a = 0f;
        Scanner scc = new Scanner(System.in);
        System.out.println("Area of Equilateral Triangle is: ");
        a = scc.nextFloat();
        double area = (1.73*a*a) /  4;
        System.out.println("Area of Equilateral Triangle is: " + area);
    }
}