import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name and Password: ");
        String name = sc.next();
        String password = sc.next();
        System.out.println("Enter your Initial Balance: ");
        int balance = sc.nextInt();
        System.out.println("Enter your Phone Number: ");
        long phoneNumber = sc.nextLong();



   /*     // SBI Account

        SBIAccount sbi = new SBIAccount(name, balance, password);

        //printing the unique account no.
        System.out.println("Account number: "+sbi.getAccountNo());

        // printing the balance
        System.out.println("Your current account balance: "+sbi.getBalance());

        // deposit money
        System.out.print("Enter the amount:");
        int amount = sc.nextInt();
        System.out.println(sbi.depositMoney(amount));
        System.out.println("Your current balance is: "+sbi.getBalance());


        // Withdraw Money
        System.out.print("Enter the amount to be withdrawn:");
        int amount1 = sc.nextInt();
        System.out.print("Enter the password:");
        String enteredPassword = sc.next();
        System.out.println(sbi.withdrawMoney(amount1,enteredPassword));
        System.out.println("New current balance is: "+sbi.getBalance());


        // Rate of Interest
        System.out.print("Enter time to calculate interest:");
        Float time = sc.nextFloat();
        System.out.println("Interest of "+time+" years on current balance "+sbi.getBalance()+" is: "+sbi.calculateInterest(time));

*/



        // HDFC ACCOUNT

        HDFCAccount hdfc = new HDFCAccount(name, password, balance, phoneNumber);

        // User details Display
        System.out.println("Welcome to HDFC Bank!");
        System.out.println("Account Holder Name: "+hdfc.getName());
        System.out.println("Mobile Number: "+hdfc.phoneNumber());


        //printing the unique account no.
        System.out.println("Account Number: "+hdfc.getAccountNo());

        // printing the balance
        System.out.println("Your current Account balance : "+hdfc.getBalance());

        // deposit money
        System.out.print("Enter the amount:");
        int amount = sc.nextInt();
        System.out.println(hdfc.depositMoney(amount));
        System.out.println("New Current Balance : "+hdfc.getBalance());

        // withdraw money
        System.out.print("Enter the amount to be withdrawn:");
        int amount1 = sc.nextInt();
        System.out.print("Enter the password:");
        String enteredPassword = sc.next();
        System.out.println(hdfc.withdrawMoney(amount1,enteredPassword));
        System.out.println("New Balance : "+hdfc.getBalance());


        // Rate of Interest
        System.out.print("Enter time to calculate interest:");
        Float time = sc.nextFloat();
        System.out.println("Interest of "+time+" years on available balance "+hdfc.getBalance()+" is: "+hdfc.calculateInterest(time));


    }
}