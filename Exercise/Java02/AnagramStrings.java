package Exercise.Java02;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings {

    //Anagram => check if 2 strings have same characters, str1: amy and str2: may here both strings has characters 'a', 'm' and 'y' so strings are anagram
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        char[] arrs1= s1.toLowerCase().toCharArray();
        char[] arrs2 = s2.toLowerCase().toCharArray();

        Arrays.sort(arrs1);
        Arrays.sort(arrs2);

        if(Arrays.equals(arrs1,arrs2)){
            System.out.println("strings are anagram");
        }else{
            System.out.println("strings are not anagram");
        }
    }
}
