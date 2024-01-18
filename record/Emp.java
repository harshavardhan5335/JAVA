import java.io.*;
import java.util.*;

class Employee {
    String emp_name, address, mail_id;
    int emp_id;
    long mobile_no;

    Employee(String emp_name, int emp_id, String address, String mail_id, long mobile_no) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.address = address;
        this.mail_id = mail_id;
        this.mobile_no = mobile_no;
    }
}

class Programmer extends Employee {
    double basicPay;

    Programmer(String emp_name, int emp_id, String address, String mail_id, long mobile_no, double basicPay) {
        super(emp_name, emp_id, address, mail_id, mobile_no);
        this.basicPay = basicPay;
    }

    void generatePaySlip() {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - (pf + staffClubFund);
        System.out.println("\nEmployee Name: " + emp_name);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Address: " + address);
        System.out.println("Mail ID: " + mail_id);
        System.out.println("Mobile Number: " + mobile_no);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}

public class Emp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Programmer:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Employee ID: ");
        int empID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Mail ID: ");
        String mailID = scanner.nextLine();
        System.out.print("Mobile Number: ");
        long mobileNo = scanner.nextLong();
        System.out.print("Basic Pay: ");
        double basicPay = scanner.nextDouble();

        Programmer programmer = new Programmer(name, empID, address, mailID, mobileNo, basicPay);
        programmer.generatePaySlip();
    }
}
