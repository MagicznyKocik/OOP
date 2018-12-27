package part1.constructors;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(1, 0, "Default name", "Default mail", String.valueOf(284489934));
        System.out.println("Empty constructor called");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(122,5000,customerName,email,phoneNumber);
    }

    public BankAccount(int accountNumber, int balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Account constructor with parameters called");
    }

    public void setAccountNumber(int accountNumber){

        this.accountNumber = accountNumber;
        System.out.println("Your account number is " + this.accountNumber);
    }

    public void setBalance(int balance){
        if(balance > 0) {
            this.balance = balance;
            System.out.println("Your balance is " + this.balance);
        } else {
            System.out.println("You can't set negative value");
            this.balance = 0;
            System.out.println("Your balance is " + this.balance);
        }
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
        System.out.println("Your customer name is " + this.customerName);
    }

    public void setEmail(String email) {
        this.email = email;
        System.out.println("Your email is " + this.email);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        System.out.println("Your phone number is " + this.phoneNumber);
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public int getBalance(){
        return this.balance;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public void depositFunds(int amount){
        if(amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("You can't deposit negative value of money");
        }
    }

    public void withdrawFunds(int amount){
        if(amount > 0 && amount < this.balance ) {
            this.balance -= amount;
        } else {
            System.out.println("You can't withdraw negative value of money");
        }
    }
}
