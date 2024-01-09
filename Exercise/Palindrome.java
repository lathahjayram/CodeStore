package Exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println("Enter a text, Let's see if it's a Palindrome!:");
        Scanner scan = new Scanner(System.in);
        String s1= scan.next();
        String  s2 = "";
        char ch;
        for(int i = 0; i < s1.length(); i++){
            ch = s1.charAt(i);
            s2 = ch + s2;
        }
        System.out.println("Reverese of the text you entered:"+ s2);
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Heyy..kudos..This is a Palindrome");
        }
        else {
            System.out.println("Ohh..NO..this isn't Palindrome!!!");
        }
    }
}
