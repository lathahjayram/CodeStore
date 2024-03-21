package Exercise.Java02;

import java.util.Scanner;

public class CountofString
{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine();
        //String str = "fdghk";
        str = str.toLowerCase();
        int count = 0;
        char c = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
           // if (c == str.charAt(i)) {
                count++;
            //}
        }
        System.out.println("The count of characters = " + count);
    }
}