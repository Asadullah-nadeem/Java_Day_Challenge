public class Day24 {
    public static void main(String[] args) {
        String nameA = "Tony";
        String nameB = "HTony";


        if (nameA.compareTo(nameB) == 0 ){
            System.out.println("String are equal");
        }else {
            System.out.println("String are not equal");
        }

        if (nameA == nameB){
            System.out.println("String are equal");
        }else {
            System.out.println("String are not equal");
        }
    }
}
