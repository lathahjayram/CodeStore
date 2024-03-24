package Exercise.Java02;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next().toLowerCase();

        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        //linkedhashmap used to maintain the inseration order of characters
        int count = 1;
        for(int i=0;i<str.length();i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),count);
            }else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }
        for(Character c : map.keySet()){
            if(map.get(c)==1) {
                System.out.println("The non repeated charcter is " + c);
                break;
            }
//            else{
//                System.out.println("All characters are repeated");
//            }
        }

    }
}
