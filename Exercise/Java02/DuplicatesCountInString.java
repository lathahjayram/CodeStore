package Exercise.Java02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicatesCountInString {
    public static void main(String[] args) {

    Scanner sc  = new Scanner(System.in);
    String str=sc.nextLine().toUpperCase();
    Map<Character,Integer> map = new HashMap<Character,Integer>();
    char[] arr = str.toCharArray();
    int count =1;

        for (int i = 0; i < arr.length; i++) {
            //char c = str.charAt(i);
            if(!map.containsKey(arr[i])){
                map.put(arr[i],count);
            }else{
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        for(char c:map.keySet()){
            if(map.get(c)>1) {
                System.out.println("The Duplicate count of " + c + "=" + map.get(c));
            }
            else{
                System.out.println("The character occured only once " + c );
            }
        }

    }
}
