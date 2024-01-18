/**
 * javafactoial1
 */
interface Factorial {

    public abstract int findfactorial (int a );
    

}

class Driverclass implements Factorial{

public int findfactorial(int n )

{
    int answer = 1, i ; 
    for (i= 2 ; i <=n ;i++ )
    answer*=i;
return answer ; 

}
public static void main(String[] args) {
   Factorial obj = new Driverclass();
   int result = obj.findfactorial(7);
   System.out.println(" 7 is Equal to : " + result ); 
}
}