import java.util.UUID;

public class SBIAccount implements BankInterface{

    private String name;
    private String accountNo;
    private int balance;
    private String password;
    private double rateOfInterest;


    public SBIAccount(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.rateOfInterest = 5.9;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public long phoneNumber() {
        return 0;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance = this.balance + amount;
        return "Money added"+amount;
    }

    @Override
    public String withdrawMoney(int amount1, String enteredPassword) {
        if(enteredPassword.equals(this.password)){
            if(balance < amount1){
                return "Low Balance";
            }
            else{
                balance = balance - amount1;
                return "Money deducted";
            }
        }
        else{
            return "Wrong Password";
        }
    }

    @Override
    public float calculateInterest(float time) {
        return (float) ((balance*rateOfInterest*time)/100.0);
    }
}
