package src;

//hello world program
public class Lab001 {
    public static void main(String[] args) {

        System.out.println("Hello world");

        byte age = 10; //byte==>data type //age==>variable/variable_name //10==>literal/variable_value
        //age= 128; //Since byte range is -128 to 127 Cannot assign value out boundary
        age = 127;
        //age= age+1; //same as line number 10
        System.out.println(age+1);//128

        //age is local variable, because it is initialised inside a method


    }
}

/* multi comment
----
 -----
 */

/** this is called Documentation
 *
 */

/*
Data types:
1. Primitive Data type: cannot be further brokem
ex: boolean,
 */