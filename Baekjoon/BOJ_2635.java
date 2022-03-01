package BOJ.IM대비;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_2635{
    static int maxCnt;
    static ArrayList<Integer> maxArr;

    private static void find(int n, int x, ArrayList<Integer> arr){
        arr.add(n);
        if(x<0){
            if(maxCnt < arr.size()){
                maxCnt = arr.size();
                maxArr = arr;
            }
            return;
        }

        find(x,n-x, arr);
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=n; i>0; i--){
            find(n, i, new ArrayList<Integer>());
        }
        System.out.println(maxCnt);
        for(int i=0; i<maxCnt; i++){
            System.out.print(maxArr.get(i)+ " ");
        }
    }
}