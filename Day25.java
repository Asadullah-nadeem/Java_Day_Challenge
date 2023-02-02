public class Day25 {
    public static void main(String[] args) {
        a aa = new a();
        aa.aa();
        b bb = new b();
        bb.bb();
    }
}
class a{
    void aa(){
        int age = 30;
        if(age > 18) {
            System.out.println("This is an adult");
        } else {
            System.out.println("This is not an adult");
        }
    }
}
class b{
    void bb(){

        int n = 1;
        switch(n) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            default :
                System.out.println("Sunday");
        }
    }
}
