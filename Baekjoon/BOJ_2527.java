package BOJ.IM대비;

import java.io.IOException;
import java.util.Scanner;

public class BOJ_2527{
    static boolean result;

    private static void point(int x1, int y1, int p1, int q1, int x2, int y2, int p2, int q2){
        if( (p1==x2 && q1==y2 ) || (x1==p2 && y1==q2) || (p1==x2 && y1==q2) || (x1==p2 && q1==y2)){     // 점
            System.out.println("c");
            result = true;
            return;
        }
    }

    private static void line(int x1, int y1, int p1, int q1, int x2, int y2, int p2, int q2){
        if( (y1>=y2 && x2==p1 && y1<q2) || (y1<=y2 && x2==p1 && y2<q1) ){
            System.out.println("b");
            result = true;
            return;
        }
    }

    private static void rectangle(int x1, int y1, int p1, int q1, int x2, int y2, int p2, int q2){
        if(x1<=p2 && p1>x2 && y1<=q2 && q1>y2 ){     // 점
            System.out.println("a");
            result = true;
            return;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<4; i++){
            result = false;
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int p1 = sc.nextInt();
            int q1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int p2 = sc.nextInt();
            int q2 = sc.nextInt();

            point(x1,y1,p1,q1,x2,y2,p2,q2);
            if(!result) {
                line(x1, y1, p1, q1, x2, y2, p2, q2);
            }
            if(!result) {
                line(y1, x1, y2, p1, q1, x2, q2, p2);
            }
            if(!result) {
                line(x2, y2, p2, q2, x1, y1, p1, q1);
            }
            if(!result) {
                line(y2, x2, y1, p2, q2, x1, q1, p1);
            }
            if(!result) {
                rectangle(x1, y1, p1, q1, x2, y2, p2, q2);
            }
            if(!result) {
                System.out.println("d");
            }
        }
    }
}