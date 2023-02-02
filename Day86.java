import java.util.HashMap;

public class Day86 {
    public static void main(String[] args) {
        HashMap<String, Integer>map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        if(map.containsKey("a")){
            Integer z = map.get("a");
            System.out.println(z);

        }
        else{
            Integer z = map.get("c");
            System.out.println(z);
        }
    }
}
