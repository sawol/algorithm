package BOJ.IM대비;

import java.util.Scanner;

public class BOJ_1592 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int[] arr = new int[n];
        int idx = 0;
        int cnt = 0;

        while(true){
            idx %= n;
            arr[idx] += 1;
            if(arr[idx] == m){
                System.out.println(cnt);
                break;
            }
            idx += l;
            cnt++;
        }
    }
}
