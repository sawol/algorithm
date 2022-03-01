package BOJ.IM대비;

import java.util.Scanner;

public class BOJ_2804 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String[] map = new String[b.length()];
        int r = 0;
        int c = 0;

        Loop1:
        for(int i=0; i<a.length(); i++){
            for(int j=0; j<b.length(); j++){
                if(a.charAt(i) == b.charAt(j)){
                    c = i;
                    r = j;
                    break Loop1;
                }
            }
        }
        for(int i=0; i<b.length(); i++){
            map[i] = "";
            for(int j=0; j<a.length(); j++){
                if(i==r){
                    map[i] += Character.toString(a.charAt(j));
                }
                else if(j==c){
                    map[i] += Character.toString(b.charAt(i));
                }
                else{
                    map[i] += ".";
                }
            }
            System.out.println(map[i]);
        }
    }
}
