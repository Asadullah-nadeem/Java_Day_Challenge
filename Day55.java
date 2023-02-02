public class Day55 {
    public static void main(String[] args) {
        int a = 0, b = 0, c =0, d = 0;
        boolean h = true;
        boolean m = false;
        boolean K;
        K=h;
        h = m;
        m = K;


        if (a+b == c+d){
            System.out.println(h);
        }else {
            System.out.println(m);
        }
    }
}
