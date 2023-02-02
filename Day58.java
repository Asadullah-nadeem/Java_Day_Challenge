import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        // && = (AND) both condition must be true
        // || = (OR) either condition must be true
        // ! =  (NOT) reverses boolean value of condition


        // && both condition must be True

       // int temp = 15;
      //  if (temp>30){
      //      System.out.println("It is Hot outside");
      //  }else if(temp>=20 && temp<=30){
      //      System.out.println("It is warm outside");
     //   }else {
     //       System.out.println("It is cold outside");
      //  }



       // // || ether condition must be True
       // Scanner scanner = new Scanner(System.in);
       // System.out.println("Your are playing Game! Press Q or q to quit");
       // String respone = scanner.nextLine();
       // if(respone.equals("q") || respone.equals("Q")){
        //    System.out.println("You quit the game");
       // }else {
        //    System.out.println("You are still playing the game *pew pew*");
        //}



        // ! =  (NOT) reverses boolean value of condition
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your are playing Game! Press Q or q to quit");
        String respone = scanner.nextLine();
        if(!respone.equals("q") && !respone.equals("Q")){
            System.out.println("You quit the game");
        }else {
            System.out.println("You are still playing the game *pew pew*");
        }
    }
}