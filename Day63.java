import java.util.Scanner;
import java.util.StringTokenizer;

public class Day63 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String pp = a.nextLine();
        StringTokenizer st = new StringTokenizer(pp);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
            /// hello many name
            /// hello
            /// many
            /// name
        }
    }
}