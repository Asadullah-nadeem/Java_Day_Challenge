import java.util.Scanner;

public class Day18 {

    public static void main(String[] args) {

        // User input
        Scanner input = new Scanner(System.in);
        System.out.print("String: ");
        String s = input.nextLine();
        System.out.print("Character: ");
        char c = input.next().charAt(0);
        System.out.print("Integer: ");
        int i = input.nextInt();

        // Switch statement on integer variable
        switch (i) {
            case 1: System.out.println("Integer = 1"); break;
            case 3: System.out.println("Integer = 3"); break;
            case 5: System.out.println("Integer = 5"); break;
            case 7: System.out.println("Integer = 7"); break;
            case 35: System.out.println("Integer = 35"); break;
            default: System.out.println("Integer = " + i);
        }

        // Switch statement on character variable
        switch (c) {
            case '$': System.out.println("Character = $"); break;
            case '#': System.out.println("Character = #"); break;
            case '%': System.out.println("Character = %"); break;
            case 'X': System.out.println("Character = X"); break;
            default: System.out.println("Character = " + c);
        }

        // Switch statement on String variable
        switch (s) {
            case "open": System.out.println("open"); break;
            case "save": System.out.println("save"); break;
            case "exit": System.out.println("exit"); break;
            default: System.out.println("String = "+s);
        }
    }
}