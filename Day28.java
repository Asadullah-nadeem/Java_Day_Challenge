import java.util.Scanner;

public class Day28 {
    //Make a menu-driven program. The user can enter 2 numbers, either 1 or 0.
    //If the user enters 1 then keep taking input from the user for a student’s
    //marks(out of 100).
    //If they enter 0 then stop.
    //If he/ she scores :
    //Marks >=90 -> print “This is Good”
    //89 >= Marks >= 60 -> print “This is also Good”
    //59 >= Marks >= 0 -> print “This is Good as well”
    //Because marks don’t matter but our effort does.
    //(Hint : use do-while loop but think & understand why)
    //int a, b, excellent; = 100 - 90; excellent.
    //int c, d, good; = 90 - 60; good.
    // int e, f, pass; 60 - 40; well pass
    // int g, h, fail; 40-01; fail;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            int marks = sc.nextInt();
            if(marks >= 90 && marks <= 100) {
                System.out.println("excellent");
            } else if(marks >= 60 && marks <= 89) {
                System.out.println("Good Well");
            } else if(marks >= 0 && marks <= 59) {
                System.out.println("fail");
            } else {
                System.out.println("Invalid");
            }
            System.out.println("Want to continue ? (yes(1) or no(0))");
            input = sc.nextInt();
        } while(input == 1);
    }
}
