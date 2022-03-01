package BOJ.IM대비;

import java.util.Scanner;

public class BOJ_1244 {
    private static void reverse(int idx, int[] onOff){
        if(onOff[idx] == 1){
            onOff[idx] = 0;
        }else{
            onOff[idx] = 1;
        }
    }
    private static void male(int card, int swichCnt, int[] onOff){
        for(int i=card; i<=swichCnt; i+=card){
            reverse(i-1, onOff);
        }
    }
    private static void female(int card, int swichCnt, int[] onOff){
        for(int i=0; i<card; i++){
            if(card-1-i<0|| card-1+i>=swichCnt){
                return;
            }
            if(card-1-i == card-1+i){
                reverse(card-1-i, onOff);
            }else if(onOff[card-1-i]==onOff[card-1+i]){
                reverse(card-1-i, onOff);
                reverse(card-1+i, onOff);
            }else{
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int swichCnt = sc.nextInt();
        int[] onOff = new int[swichCnt];
        for(int i=0; i<swichCnt; i++){
            onOff[i] = sc.nextInt();
        }
        int studentNum = sc.nextInt();
        for(int i=0; i<studentNum; i++){
            int sex = sc.nextInt();
            int card = sc.nextInt();
            if(sex==1) {
                male(card, swichCnt, onOff);
            }else{
                female(card, swichCnt, onOff);
            }
        }
        for(int i=0; i<swichCnt; i++){
            if(i!=0 && i%20==0){
                System.out.println();
            }
            System.out.print(onOff[i] + " ");
        }
    }
}