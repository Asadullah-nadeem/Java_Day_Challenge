public class Day87 {
    public static int z(int[] y, int g) {
        for(int i=0; i<y.length; i++){
            if(y[i] == g){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] v = {10,20,30,50,70,90};
        int g  = 50;
        int output = z(v, g);
        System.out.println(g+" index is " + output);
    }
    
}
