import java.util.Scanner;

class Day60{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (name.isBlank())
        {
            System.out.println("Enter your Name ");
            name = scanner.nextLine();
        }
        System.out.println("hello " +name);
    }
}