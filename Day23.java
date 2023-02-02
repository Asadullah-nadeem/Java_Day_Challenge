import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        String fN = "My";
        String LN = "mya";
        String FLLM = fN + "@" + LN;
        int jk = 52;
        System.out.println(FLLM.repeat(jk));
        System.out.println(FLLM);
        System.out.println(FLLM.length());
        for(int i=0; i<FLLM.length(); i++){
            System.out.println(FLLM.charAt(i));
        }

    }
}