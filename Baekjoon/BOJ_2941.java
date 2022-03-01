package BOJ.IM대비;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        HashMap<String, Integer> croatia = new HashMap<>();
        int result = 0;
        croatia.put("c=", 1);
        croatia.put("c-", 1);
        croatia.put("dz=", 1);
        croatia.put("d-", 1);
        croatia.put("lj", 1);
        croatia.put("nj", 1);
        croatia.put("s=", 1);
        croatia.put("z=", 1);

        for(int i=0; i<str.length(); i++){
            if(i+1 < str.length() && croatia.get(str.substring(i,i+2)) != null){
                result += 1;
                i++;
            }
            else if(i+2 < str.length() && croatia.get(str.substring(i,i+3)) != null){
                result += 1;
                i += 2;
            }
            else{
                result += 1;
            }
        }
        System.out.println(result);
    }
}
