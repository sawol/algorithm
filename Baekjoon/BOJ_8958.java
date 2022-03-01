package BOJ.IM대비;

import java.util.Scanner;

public class BOJ_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String str = sc.next();
            int result = 0;
            int tmp = 0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == 'O'){
                    tmp += 1;
                    result += tmp;
                }else{
                    tmp = 0;
                }
            }
            System.out.println(result);
        }
    }
}
