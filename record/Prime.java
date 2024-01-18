
import primecheck.PrimeChecker;
import java.util.*;

public class Prime {
    public static void main(String[] args) {
        System.out.print("Enter the number to check: ");
        Scanner c = new Scanner(System.in);
        int prime = c.nextInt();
        PrimeChecker p = new PrimeChecker(prime);
        p.Check();
    }
}
