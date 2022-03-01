package BOJ.IM대비;

import java.io.IOException;
import java.util.Scanner;

public class BOJ_2491{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] increase = new int[n];
        int[] decrease = new int[n];
        int result = 0;

        // 배열에 값 채우기 - increase, decrease는 최소값인 1로 셋팅
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            increase[i] = 1;
            decrease[i] = 1;
        }

        // 증가하는 수와 감소하는 수의 개수 구하기
        for(int i=1; i<n; i++){
            if(arr[i] >= arr[i-1]){
                increase[i] = increase[i-1] + 1;
            }
            if(arr[i] <= arr[i-1]){
                decrease[i] = decrease[i-1] + 1;
            }
        }

        // 최대값 구하기
        for(int i=0; i<n; i++){
            if(increase[i] > result){
                result = increase[i];
            }
            if(decrease[i] > result){
                result = decrease[i];
            }
        }

        System.out.println(result);
    }
}