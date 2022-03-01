package BOJ.개인;

import java.util.Scanner;

public class BOj_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(n>1){
            n -= 6*i;
            i++;
        }
        System.out.println(i);
    }
}
