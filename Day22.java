import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cls = sc.nextInt();

        int[][] numbers = new  int[rows][cls];

        //input
        //rows

        for (int i=0;i<rows; i++){
            for(int j=0; j<=cls; j++){
                numbers[i][j]= sc.nextInt();
            }
        }
        //output
        for (int i=0; i<rows; i++){
            for (int j=0; j<cls; j++){
                System.out.print(numbers[i][j] + "3");
            }
            System.out.println();
        }
    }
}