import java.util.*;
public class Day89 {
    public static void main(String[] args) {
        ArrayList<String>z=new ArrayList();
        z.add("1");
        z.add("3");
        z.add("3");
        z.add("2");
        z.add("4");
        z.remove(1);
        z.remove("3");
        System.out.println(z);
    }
}
