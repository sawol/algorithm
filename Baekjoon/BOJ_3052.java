package BOJ.IM대비;

import java.util.Scanner;

public class BOJ_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[42];
        int result = 0;

        for(int i=0; i<10; i++){
            int input = sc.nextInt()%42;
            if(!arr[input]){
                arr[input] = true;
                result++;
            }
        }
        System.out.println(result);
    }
}