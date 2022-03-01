package BOJ.IM대비;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_2605{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            int card = sc.nextInt();
            list.add(i-card, i+1);
        }
        for(int i=0; i<n; i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}