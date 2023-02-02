import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        // Write your code here.
        boolean b=n.isProbablePrime(1);
        if(b){System.out.print("prime");}else{System.out.print("not prime");}
    }
}