package BOJ.IM대비;

import java.io.IOException;
import java.util.Scanner;

public class BOJ_10158{

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int antW = sc.nextInt();
        int antH = sc.nextInt();
        int time = sc.nextInt();

        int wallCntW = (antW + time)/w % 2;
        int wallCntH = (antH + time)/h % 2;

        if(wallCntH == 0 && wallCntW == 0){     // 원래 방향(오른쪽 위)
            antW = (antW + time) % w;
            antH = (antH + time) % h;
        }
        else if(wallCntH == 0 && wallCntW == 1){     // 왼쪽 위
            antW = w - (antW + time) % w;
            antH = (antH + time) % h;
        }
        else if(wallCntH == 1 && wallCntW == 0){     // 오른쪽 아래
            antW = (antW + time) % w;
            antH = h - (antH + time) % h;
        }else{                                      // 왼쪽 아래
            antW = w - (antW + time) % w;
            antH = h - (antH + time) % h;
        }
        System.out.println(antW +" " + antH);
    }
}