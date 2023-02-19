public interface BankInterface {

    int getBalance();

    String depositMoney(int amount);

    String withdrawMoney(int amount1, String enteredPassword);

    double calculateInterest(int time);


}
