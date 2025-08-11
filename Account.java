public class Account {
    private double Balance;

    public Account(double initialBalance) {
        if (initialBalance > 0) {
            Balance = initialBalance;

        }
    }

    public static void main(String[] args) {
    }

    public void credit(double Amount) {
        Balance = Balance + Amount;

    }

    public double getBalance() {
        return Balance;
    }
}