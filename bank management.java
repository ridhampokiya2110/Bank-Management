import java.util.Scanner;

class Bank {
    private double bal = 50000;
    private int pwd;
    public double money;

    public void deposite() {
        System.out.println("Enter Password:");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if (pwd == 787478) {
            System.out.println("Enter Deposite Money:");
            double money = s.nextDouble();
            bal = bal + money;
            System.out.println("Total Balance: " + bal);
        } else {
            System.out.println("Incorrect Password...");
        }
    }

    public void withdraw() {
        System.out.println("Enter Password:");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if (pwd == 787478) {
            System.out.println("Enter Withdraw Money:");
            double money = s.nextDouble();
            bal = money - bal;
            System.out.println("Withdraw Money: " + money);
            System.out.println("Total Balance: " + bal);

        } else {
            System.out.println("Incorrect Password...");
        }
    }

    public void checkBalance() {
        System.out.println("Enter Password:");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if (pwd == 787478) {
            System.out.println("Total Balance: " + bal);
        } else {
            System.out.println("Incorrect Password...");
        }
    }
}

class Customer {
    public static void main(String[] args) {
        Bank b = new Bank();

        int ch;
        Scanner s = new Scanner(System.in);

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("Enter Your Choice:");
        ch = s.nextInt();

        switch (ch) {
            case 1:
                b.deposite();
                break;
            case 2:
                b.withdraw();
                break;
            case 3:
                b.checkBalance();
                break;
            default:
                System.out.println("Invalid Choice...");
        }

    }
}
