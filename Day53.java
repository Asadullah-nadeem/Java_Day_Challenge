import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        double x;
        double y;
        double z;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = sc.nextInt();
        System.out.println("Enter side y: ");
        y = sc.nextInt();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("The Hypotenuse is " +z );
        sc.close();
    }
}
