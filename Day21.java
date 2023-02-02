import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nuimber[] = new int[size];

        //input
        for (int   i=0; i<size; i++)
        {
            nuimber[i] = sc.nextInt();
        }

        //output
        for (int i=0; i<size; i++){
            System.out.println(nuimber[i]);
        }
    }
}
