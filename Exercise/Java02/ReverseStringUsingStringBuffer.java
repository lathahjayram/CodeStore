package Exercise.Java02;

import java.util.Scanner;

public class ReverseStringUsingStringBuffer {
    public static void main(String[] args) {
        StringBuffer str= new StringBuffer("java");
        str.reverse();
        System.out.println(str);
    }
}
