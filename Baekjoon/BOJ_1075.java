package BOJ.개인;

import java.util.Scanner;

public class BOJ_1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = (sc.nextLong()/100)*100;
        int f = sc.nextInt();

        for(int i=0; i<f; i++){
            if((n+i)%f==0){
                System.out.printf("%02d", i);
                break;
            }
        }
    }
}
