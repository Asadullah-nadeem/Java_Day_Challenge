import java.util.Scanner;

class Day59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        StringBuilder reverseInput = new StringBuilder();
        for (int i = input.length()- 1; i>=0; i--){
            reverseInput.append(input.charAt(i));
        }
        System.out.println(reverseInput);
        if (input.equalsIgnoreCase(reverseInput.toString())){
            System.out.println("palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}