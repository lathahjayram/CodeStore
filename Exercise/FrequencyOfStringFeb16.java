package Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfStringFeb16 {
    //count each char in a input
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        Integer count =1;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //String str = "Hello";
        str = str.toLowerCase();
        char[] arr = str.toCharArray();

        for(int i =0; i<str.length();i++){
            char c= str.charAt(i);
            if(!map.containsKey(c)){
                map.put(c, count);
            }else{
                map.put(c,count+1);
            }
        }
        for(char c : map.keySet()){
            System.out.println("The count of "+c+" = "+map.get(c));
        }
    }
}
