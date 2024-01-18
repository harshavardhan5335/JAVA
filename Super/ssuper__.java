
import java.io.*;
import java.util.*;
class a {
void msg(){
    System.out.println("This is a");
    }
}
class b extends a {
    void msg(){
        super.msg();
        System.out.println("This is b");        
    }
}
class c extends b{
    void msg(){
        super.msg();
        System.out.println("This is c");
    }
}
class d extends c {
    void msg(){
        super.msg();
        System.out.println("This is d "); 
    }
}
 class super__ {
    public static void main (String args[]){
       d key = new d(); 
       key.msg();       
    }
}
