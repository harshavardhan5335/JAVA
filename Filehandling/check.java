package Filehandling;

public class check {
    public static void main(String[] args) {

        String name = "Neo";

        String name1 = "Neo";
        System.out.println(System.identityHashCode(name));
        System.out.println(System.identityHashCode(name1));
        System.out.println(name);

        name = "Trinity";
        System.out.println(name);
        System.out.println(System.identityHashCode(name));
        System.out.println(System.identityHashCode(name1));
    }
}
