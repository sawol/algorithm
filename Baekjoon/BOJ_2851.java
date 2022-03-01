package BOJ.IM대비;

import java.util.Scanner;

public class BOJ_2851 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for(int i=0; i<10; i++){
            int n = sc.nextInt();
            sum += n;
            if(sum >= 100){
                if(100 - (sum-n) < sum - 100){
                    sum = (sum-n);
                }
                break;
            }
        }
        System.out.println(sum);
    }
}
