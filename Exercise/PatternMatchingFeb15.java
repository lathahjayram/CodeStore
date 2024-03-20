package Exercise;

import java.util.Scanner;

public class PatternMatchingFeb15 {

/* *      *          *           i(row)  j(star)                *       i       j (spaces)
   **    **          **          1       1                     **       1       3
   ***  ***          ***         2       2                    ***       2       2
   ********          ****        3       3                   ****       3       1
                                 n       n                              n       n-i
* */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i;j++){
                    System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<=n-(n-i);j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

}
