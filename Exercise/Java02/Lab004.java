package Exercise.Java02;

import java.sql.SQLOutput;

public class Lab004 {

    public static void main(String[] args) {
        //Differece between println and print
        System.out.print("Helloworld");//Print: prints text and cursor stay in the same line
        System.out.println("Heyooo");//Println: prints text and cursor moves to the next line
        System.out.println("people!!!");

        //printf: print format
        // %d -> any integer - byte, short, int or long
        // %s -> String
        // %c -> char
        // %f -> float

        int age = 18;
        System.out.printf("age is %d",age); // %d is considered as format to fetch the integer data
        System.out.println("age is %d");//%d is considerd as text

        //
        byte b = 10;  //-128 to 127
        short s = 128;
        //int s = 19; variable name should be unique

/*      type           size(bits)       default
        byte            8               0
        short           16              0
        int             32              0
        long            64              0
        float           32              0.0f
        double          64              0.0
        char            16              ASCII-9, unicode-\u0000
    AnyReferenceType    64              null
    



 */

    }
}
