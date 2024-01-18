package Super;
import java.io.*;
import java.util.*;
class a {
a(){
    System.out.println("This is a");
}
}
class b extends a {
    b(){
        System.out.println("This is car");
    }
}

class c extends b{
    c(){
        System.out.println("This is c");
    }
}
 class super_ {
    public static void main (String args[]){
       c key = new c();        
       }
}
