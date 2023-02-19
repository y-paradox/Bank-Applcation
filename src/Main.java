import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name, password and balance: ");
        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();


        SBIAccount sbi = new SBIAccount(name, balance, password);

        //printing the unique account no.
        System.out.println("Your account is created with account number: "+sbi.getAccountNo());

        // printing the balance
        System.out.println("Your current account balance: "+sbi.getBalance());

        // deposit money
        System.out.println("Enter the amount to be deposited:");
        int amount = sc.nextInt();
        System.out.println(sbi.depositMoney(amount));
        System.out.println("Your current balance is: "+sbi.getBalance());

        // withdraw money
        System.out.println("Enter the amount to be withdrawn:");
        int amount1 = sc.nextInt();
        System.out.println("Enter the password:");
        String enteredPassword = sc.next();
        System.out.println(sbi.withdrawMoney(amount1,enteredPassword));
        System.out.println("New current balance is: "+sbi.getBalance());

        // Rate of Interest
        System.out.println("Enter time to calculate interest:");
        int time = sc.nextInt();
        System.out.println("Interest of "+time+" years on current balance "+sbi.getBalance()+" is: "+sbi.calculateInterest(time));




    }
}