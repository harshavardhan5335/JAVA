package primecheck;

public class PrimeChecker {
 int a;
 public PrimeChecker(int a) 
{
        this.a = a;
  }

    public void Check() {
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                System.out.println(a + " is not a prime number.");
                return;
            }
        }
        System.out.println(a + " is a prime number.");
    }
}