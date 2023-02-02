public class Day79 {
//    public static void printNumb(int n) {
//        if (n == 0){
//            return;
//        }
//        System.out.println(n);
//        printNumb(n-1);
//    }
//    public static void main(String[] args) {
//        int n = 0;
//        printNumb(n);
//    }
public static void printNumb(int n) {
    if (n == 6){
        return;
    }
    System.out.println(n);
    printNumb(n+1);
}
    public static void main(String[] args) {
        int n = 1;
        printNumb(n);
    }
}