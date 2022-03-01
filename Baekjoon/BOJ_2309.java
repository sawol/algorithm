package BOJ.IM대비;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2309{
    static int[] arr = new int[9];
    static boolean check = false;
    private static void comb(int tall, int idx, int[] tmp, int num){
        if(tall == 100 && num == 7){
            for(int t: tmp){
                System.out.println(t);
            }
            check = true;
            return;
        }
        if(idx>8 || tall > 100 || num >= 7 || check == true){
            return;
        }
        tmp[num] = arr[idx];
        comb(tall+arr[idx], idx+1, tmp, num+1);
        tmp[num] = 0;
        comb(tall, idx+1, tmp, num);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<9; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        comb(0,0, new int[7], 0);
    }
}