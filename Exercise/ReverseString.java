package Exercise;

import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = scan.next();
        String rstr = "";
        char ch;
        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            rstr = ch + rstr;
        }
        System.out.println("Reverse of entered string:"+ rstr);
    }

}