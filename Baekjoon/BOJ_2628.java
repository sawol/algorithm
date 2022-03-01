package BOJ.IM대비;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2628{

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();       // 가로
        int y = sc.nextInt();       // 세로
        int n = sc.nextInt();
        int result = 0;
        ArrayList<Integer> arrX = new ArrayList<>();        // 가로 리스트
        ArrayList<Integer> arrY = new ArrayList<>();        // 세로 리스트
        arrX.add(0);            // idx = 0 은 0으로 초기화
        arrY.add(0);            // idx = 0 은 0으로 초기화

        // 리스트에 값 삽입
        for(int i=0; i<n; i++) {
            if(sc.nextInt() == 1){
                arrX.add(sc.nextInt());
            }else{
                arrY.add(sc.nextInt());
            }
        }

        // 정렬 -> 왜? 잘라진 종이들의 길이를 쉽게 구하기 위해
        Collections.sort(arrX);
        Collections.sort(arrY);
        // x, y 값을 리스트의 마지막에 넣어 잘라진 종이의 길이를 구함
        arrX.add(x);
        arrY.add(y);
        // 잘려진 종이의 가로 세로 길이를 저장하는 배열
        int[] tmpX = new int[arrX.size()];
        int[] tmpY = new int[arrY.size()];

        // 잘라진 가로세로 길이를 알기위해 현재 잘려진 위치 - 이전에 잘려진 위치
        for(int i=1; i<arrX.size(); i++){
            tmpX[i-1] = arrX.get(i) - arrX.get(i-1);
        }
        for(int i=1; i<arrY.size(); i++){
            tmpY[i-1] = arrY.get(i) - arrY.get(i-1);
        }

        // 가장 큰 잘려진 종이 구하기
        for(int i=0; i<tmpX.length; i++){
            for(int j=0; j<tmpY.length; j++){
                int sizeXY = tmpX[i] * tmpY[j];
                if(result < sizeXY)     result = sizeXY;
            }
        }
        System.out.println(result);
    }
}