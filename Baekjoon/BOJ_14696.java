package BOJ.IM대비;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class BOJ_14696{

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Loop1:
        for(int i=0; i<n; i++){
            HashMap<Integer, Integer> mapA = new HashMap<>();
            HashMap<Integer, Integer> mapB = new HashMap<>();

            for(int j=1; j<=4; j++){
                mapA.put(j, 0);
                mapB.put(j, 0);
            }

            int cardNumA = sc.nextInt();

            for(int j=0; j<cardNumA; j++){
                int cardTypeA = sc.nextInt();
                mapA.put(cardTypeA, mapA.get(cardTypeA)+1);
            }

            int cardNumB = sc.nextInt();

            for(int j=0; j<cardNumB; j++){
                int cardTypeB = sc.nextInt();
                mapB.put(cardTypeB, mapB.get(cardTypeB)+1);
            }

            for(int j=4; j>0; j--){
                if(mapA.get(j) > mapB.get(j)){
                    System.out.println("A");
                    continue Loop1;
                }
                else if(mapA.get(j) < mapB.get(j)){
                    System.out.println("B");
                    continue Loop1;
                }
            }
            System.out.println("D");
        }
    }
}