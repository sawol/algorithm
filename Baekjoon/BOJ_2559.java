package BOJ.IM대비;

import java.io.IOException;
import java.util.Scanner;

public class BOJ_2559{

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int result = Integer.MIN_VALUE;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
            if(max<arr[i]){
                max = arr[i];
            }
        }
        if(n==k){
            System.out.println(sum);
        }else if(k==1){
            System.out.println(max);
        }else {
            for (int i = 0; i <= n - k; i++) {
                int tmp = 0;
                for (int j = 0; j < k; j++) {
                    tmp += arr[i + j];
                }
                if (tmp > result) {
                    result = tmp;
                }
            }
            System.out.println(result);
        }
    }
}