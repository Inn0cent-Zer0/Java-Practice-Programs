import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        int bal = 10000, with, dep, pin;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("===========////Automated Teller Machine////=============");
            System.out.println("Enter the PIN number");
            pin = sc.nextInt();
            if (pin == 1234 || pin == 4321 || pin == 5667 || pin == 9065) {
                System.out.println("Choose 1 for Withdraw");
                System.out.println("Choose 2 for Deposit");
                System.out.println("Choose 3 for Check Balance");
                System.out.println("Choose 4 for EXIT");
                System.out.print("Choose the operation you want to performn\n");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter money to be withdrawn:");
                        with = sc.nextInt();
                        if (bal >= with) {

                            bal = bal - with;
                            System.out.println("Please collect your money");
                        } else {

                            System.out.println("Insufficient Balance");
                        }
                        System.out.println();
                    }
                    case 2 -> {
                        System.out.print("Enter money to be deposited:");
                        dep = sc.nextInt();
                        bal = bal + dep;
                        System.out.println("Your Money has been successfully deposited");
                        System.out.println();
                    }
                    case 3 -> {
                        System.out.println("Balance : " + bal);
                        System.out.println();
                    }
                    case 4 -> System.exit(0);
                }
            } else {
                System.out.println("Please enter a valid PIN code :");
            }

        }
    }
}
