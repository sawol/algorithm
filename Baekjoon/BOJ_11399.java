package BOJ.IM대비;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int result = 0;
        int tmp = 0;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int num: arr){
            tmp += num;
            result += tmp;
        }
        System.out.println(result);
    }
}
