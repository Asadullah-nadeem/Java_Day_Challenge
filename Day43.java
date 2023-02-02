public class Day43 {
    public static void main(String[] args) {
        account a = new account();
        a.getBalance();
    }
}
//Getter and Setter in Java are two conventional methods used to retrieve and update values of
// a variable. They are mainly used to create, modify, delete and view the variable values.
// The setter method is used for updating values and the getter method is used for reading or
// retrieving the values. They are also known as an accessor and mutator.
//The following code is an example of getter and setter methods:
class account{
    private int account_number;
    private int a_bla;

    // getter method
    public int getBalance(){
        return this.a_bla;
    }

    // setter method
    public void setNumber(int num) {
        this.account_number = num;
    }
}