package BOJ.IM대비;

import java.io.IOException;
import java.util.Scanner;

public class BOJ_2477{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        final int CASE = 6;
        int[] tmp = new int[CASE];
        int[] map = new int[CASE*2];
        int[] direct = new int[CASE*2];
        int[] cntDirect = new int[4];
        int result = 0;

        for(int i=0; i<CASE; i++){
            int idx = sc.nextInt();
            int n = sc.nextInt();

            tmp[idx-1] += n;
            map[i] = n;
            map[i+CASE] = n;
            direct[i] = idx;
            direct[i+CASE] = idx;
            cntDirect[idx-1] += 1;
        }

        int x = tmp[3];
        int y = tmp[1];

        if(cntDirect[0]==2 && cntDirect[2]==2){     // ㄱ
            for(int i=0; i<CASE*2-3; i++){
                if(direct[i]==3 && direct[i+1]==1 && direct[i+2]==3){
                    result = x*y - map[i+1]*map[i+2];
                    break;
                }
            }
        }else if(cntDirect[0]==2 && cntDirect[3]==2){       // ㄱ 270도 회전
            for(int i=0; i<CASE*2-3; i++){
                if(direct[i]==1 && direct[i+1]==4 && direct[i+2]==1){
                    result = x*y - map[i+1]*map[i+2];
                    break;
                }
            }
        }else if(cntDirect[1]==2 && cntDirect[2]==2){       // ㄱ 90도 회전
            for(int i=0; i<CASE*2-3; i++){
                if(direct[i]==2 && direct[i+1]==3 && direct[i+2]==2){
                    result = x*y - map[i+1]*map[i+2];
                    break;
                }
            }
        }else if(cntDirect[1]==2 && cntDirect[3]==2){       // ㄱ 180도 회전
            for(int i=0; i<CASE*2-3; i++){
                if(direct[i]==4 && direct[i+1]==2 && direct[i+2]==4){
                    result = x*y - map[i+1]*map[i+2];
                    break;
                }
            }
        }
        System.out.println(result*k);
    }
}