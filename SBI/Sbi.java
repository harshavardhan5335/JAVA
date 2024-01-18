import java.io.*;
import java.util.*;

public class Sbi {
    public static void main(String[] args) {
        long AccountNum = 22105020;
        long AccountBalance = 100000;
        int MinimumBalance = 1000;
        int pin = 609420;
        int Pin;
        Scanner  intput = new Scanner(System.in);
        
       
        System.out.print("Enter your account number: ");
        long EnteredAccountNum =  intput.nextLong();
        
        if (EnteredAccountNum == AccountNum) {
            System.out.println("YOUR ACCOUNT NUMBER IS " + AccountNum);
        } else {
            System.out.println("\n Enter a valid account number ");
            return;
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter your pin number: ");
            Pin =  intput.nextInt();

            if (Pin != pin) {
                System.out.print("Enter the correct pin. You have " + (3 - i) + " attempts left.\n");
            } else {
                while (Pin== pin) {
                    System.out.println("1: DEPOSIT");
                    System.out.println("2: WITHDRAW");
                    System.out.println("3: MINI STATEMENT");
                    System.out.println("4: CHECK BALANCE");
                    System.out.print("Enter your Option: ");
                    int Option =  intput.nextInt();

                    switch (Option) {
                        case 1:
                            System.out.print("Enter the Deposit Amount: ");
                            int deposit =  intput.nextInt();
                            AccountBalance += deposit;
                            System.out.println("The account balance after deposit is " + AccountBalance);
                            break;
                        case 2:
                            System.out.print("Enter the Withdraw Amount: ");
                            int withdraw =  intput.nextInt();
                            if (AccountBalance - withdraw >= MinimumBalance) {
                                AccountBalance -= withdraw;
                                System.out.println("Your withdrawal is successful.");
                                System.out.println("Account balance: " + AccountBalance + "\n");
                            } else {
                                System.out.println("Insufficient balance.:(");
                            }
                            break;
                        case 3:
                            System.out.println("MINI STATEMENT  ");
                            System.out.println("\nAccount number: " + AccountNum + "\n"  );
                            System.out.println("Account name: Harsha ");
                            System.out.println("\nAccount balance: " + AccountBalance );
                            break;
                        case 4:
                            System.out.println("CHECK BALANCE");
                            long availableBalance = AccountBalance - MinimumBalance;
                            System.out.println("The available balance is " + availableBalance);
                            break;
                        default:
                            System.out.println("INVALID CHOICE");
                    }

                    System.out.print("\nEnter 1 to continue or 0 to exit: ");
                    int next =  intput.nextInt();
                    if (next == 0) {
                        break;
                    } else if (next != 1) {
                        System.out.println("INVALID CHOICE: 1 to continue, 0 to exit :(");
                        break;
                    }
                }
                break;
            }
        }
    }
}
