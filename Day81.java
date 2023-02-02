public class Day81 {
    public static  int calcfac(int n){
        if (n == 1 || n ==0){
            return 1;
        }
        int fact_num1 = calcfac(n-1);
        int fact_n = n * fact_num1;
        return fact_n;
    }

    public static void main(String[] args) {
        int n = 12;
        int ans = calcfac(n);
        System.out.println(ans);
    }
}
