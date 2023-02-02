import java.util.HashMap;
import java.util.Map;

class Day84{
    public static void main(String[] args) {
        HashMap<Integer,String>a=new HashMap<>();
        a.put(1,"hello 1");
        a.put(2,"hello 2");
        a.put(3,"hello 3");
        a.put(4,"hello 4");
        for(Map.Entry m:a.entrySet()){
            int i=(int) m.getKey();
            if(i%2==0){
                System.out.println(m.getKey()+" "+m.getValue());
            }
        }
    }
}