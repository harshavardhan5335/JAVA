import java.util.*;

class suresh_Exception extends Exception {

    String msg;

    suresh_Exception(String msg) {
        super(msg);
    }

}

public class suresh {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your cgpa : ");
        int cgpa = input.nextInt();

        try {
            if (cgpa >= 101 && cgpa <= 0) {
                System.out.println("Enter your correct cgpa");
            } else if (cgpa <= 75) {
                throw new suresh_Exception("you are not eligible");
            } else {
                System.out.println("you are eligible");
            }
        } catch (suresh_Exception e) {
            System.out.println("okok");
            System.out.println(e.getMessage());
        }

    }

}
