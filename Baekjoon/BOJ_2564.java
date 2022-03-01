package BOJ.IM대비;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_2564{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        // 가로 세로 길이
        int x = sc.nextInt();
        int y = sc.nextInt();

        // 상점 수
        int storeNum = sc.nextInt();

        // 동서남북 상점 위치
        ArrayList<Integer> east = new ArrayList<>();
        ArrayList<Integer> west = new ArrayList<>();
        ArrayList<Integer> south = new ArrayList<>();
        ArrayList<Integer> north = new ArrayList<>();

        for(int i=0; i<storeNum; i++){
            switch (sc.nextInt()){
                case 1:
                    north.add(sc.nextInt());
                    break;
                case 2:
                    south.add(sc.nextInt());
                    break;
                case 3:
                    west.add(sc.nextInt());
                    break;
                case 4:
                    east.add(sc.nextInt());
                    break;
            }
        }

        // 동근이 위치
        int dongDirect = sc.nextInt();
        int dongDist = sc.nextInt();

        // 각 상점 별 최단 거리
        switch(dongDirect){
            case 1:
                for(int n: north)   result += Math.abs(n-dongDist);
                for(int s: south)   result += y + Math.min(s+dongDist, x-s+x-dongDist);
                for(int w: west)   result += w+dongDist;
                for(int e: east)   result += e+x-dongDist;
                break;
            case 2:
                for(int n: north)   result += y + Math.min(n+dongDist, x-n+x-dongDist);
                for(int s: south)   result += Math.abs(s-dongDist);
                for(int w: west)   result += y-w+dongDist;
                for(int e: east)   result += y-e+x-dongDist;
                break;
            case 3:
                for(int n: north)   result += n+dongDist;
                for(int s: south)   result += y-dongDist+s;
                for(int w: west)   result += Math.abs(w-dongDist);
                for(int e: east)   result += x + Math.min(e+dongDist, y-e+y-dongDist);
                break;
            case 4:
                for(int n: north)   result += x-n + dongDist;
                for(int s: south)   result += y-dongDist + x-s;
                for(int w: west)   result += x + + Math.min(w+dongDist, y-w+y-dongDist);
                for(int e: east)   result += Math.abs(e-dongDist);
                break;
        }
        System.out.println(result);
    }
}