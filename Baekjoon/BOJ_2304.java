package BOJ.IM대비;

import java.io.IOException;
import java.util.Scanner;

public class BOJ_2304{
    static int[] arr = new int[1001];
    static int maxH;
    static int maxL;
    static int start = 1001;
    static int end;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for(int i=0; i<n; i++){
            int l = sc.nextInt();       // 위치
            int h = sc.nextInt();       // 높이
            arr[l] = h;

            if(l < start)   start = l;
            if(h > maxH){
                maxH = h;
                maxL = l;
            }else if(h == maxH && l > maxL) {
                maxL = l;
            }
            if(l > end)     end = l;
        }

        int point = arr[start];
        for(int i=start; i<maxL; i++){
            if(arr[i] < point)     arr[i] = point;
            if(arr[i] > point)     point = arr[i];
        }

        point = arr[end];
        for(int i=end; i>maxL; i--){
            if(arr[i] < point)     arr[i] = point;
            if(arr[i] > point)     point = arr[i];
        }

        for(int i=start; i<end+1; i++){
            result += arr[i];
        }
        System.out.println(result);
    }
}