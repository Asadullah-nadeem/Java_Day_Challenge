import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        if(A!=null){
            StringBuilder sb = new StringBuilder(A);
            if(A.equals(sb.reverse().toString()))
                System.out.println("Yes");
            else
                System.out.println("No");
        }

    }
}
