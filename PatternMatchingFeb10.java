package Exercise;

import java.util.Scanner;

public class PatternMatchingFeb10 {

   /* 1 space & 1 star          row(i)     spaces(j)
    -*          i->row           1          1
    --**        k-> stars        2          2
    ---***      j-> spaces       3          3
    ----****                    ________________
                                 i          j<=2
    */

    public static void main(String[] args) {
        System.out.println("Enter a number to create pattern:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
