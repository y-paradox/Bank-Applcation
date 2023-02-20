public interface BankInterface {

    String name();

    long phoneNumber();

    int getBalance();

    String depositMoney(int amount);

    String withdrawMoney(int amount1, String enteredPassword);

    float calculateInterest(float time);


}
