import java.io.*;
import java.util.*;

class SimpleCustomException extends Exception {
    String msg;

    SimpleCustomException(String msg) {
        super(msg);
    }

}

public class x {

    public static void main(String[] args) {
        try {
            throw new SimpleCustomException("User defined Exception");
        }

        catch (SimpleCustomException ex) {
            System.out.println(ex);
            System.out.println(ex.getMessage());
        }
    }

}