import java.util.UUID;

public class HDFCAccount implements BankInterface{

    private String name;
    private String accountNo;
    private String password;
    private int balance;
    private long phoneNumber;
    private float roi;


    public HDFCAccount(String name, String password, int balance, long phoneNumber) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.phoneNumber = phoneNumber;

        this.roi = 4.8F;
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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(float roi) {
        this.roi = roi;
    }




    @Override
    public String name() {
        return this.name;
    }

    @Override
    public long phoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance = balance+amount;
        return "Money Added Successfully! ";
    }

    @Override
    public String withdrawMoney(int amount1, String enteredPassword) {
        if(enteredPassword.equals(password)){
            if(amount1 > balance){
                return "Insufficient Balance";
            }
            else{
                balance = balance - amount1;
                return "Money Deducted Successfully";
            }
        }
        else{
            return "Wrong Password!";
        }
    }

    @Override
    public float calculateInterest(float time) {
        float interest = (float) ((balance*roi*time)/100.0);
        return interest;
    }
}

