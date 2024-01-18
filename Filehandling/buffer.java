package Filehandling;

//string buffer
public class buffer {
    public static void main(String[] args) {

        /*
         * StringBuffer();
         * StringBuffer(String str) ;
         */

        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        System.out.println(sb);
    }
}
