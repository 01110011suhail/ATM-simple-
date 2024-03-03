import java.util.Scanner;

public class ATM {

    float balance;
    int pin = 123;
    Scanner sc = new Scanner(System.in);

    public void pin() {
        System.out.println("enter the pin");
        int PIN = sc.nextInt();
        if (pin == PIN) {
            menu();

        } else {
            System.out.println("Invalid pin!");

        }
    }

    public void menu() {
        System.out.println("Welcome dear customer");
        System.out.println("1. account balance !  ");
        System.out.println("2. Deposit Amount! ");
        System.out.println("3. withdraw Amount! ");
        System.out.println("4. EXIT!");

        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println(balance + "Availble in acount");
                menu();
                break;

            case 2:
                System.out.println("enter the amount");
                int bal = sc.nextInt();
                balance = balance + bal;
                System.out.println(balance + "amount deposit succefully");
                menu();
                break;

            case 3:
                System.out.println("enter the amount to withdraw");
                int amount = sc.nextInt();
                if (amount > balance) {
                    System.out.println("you dont have enough balance");
                } else {
                    balance = amount - balance;
                    System.out.println("amount  withdraw successfully!");

                }
                menu();
                break;
            case 4:
                System.out.println("succefully exit");

        }

    }

    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.pin();
    }

}