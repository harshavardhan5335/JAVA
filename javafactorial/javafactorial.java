//Factorial using abstract class 

abstract class Factorial {

    public abstract int findfactorial (int a );

}
class javafactorial extends Factorial{

public int findfactorial(int n )

{
    int answer = 1, i ; 
    for (i= 2 ; i <=n ;i++ )
    answer*=i;
return answer ; 

}
public static void main(String[] args) {
   Factorial obj = new javafactorial();
   int result = obj.findfactorial(7);
   System.out.println(" 7 is Equal to : " + result ); 
}
}
