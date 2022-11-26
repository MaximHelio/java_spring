import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AB7 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

            StringTokenizer st;
            for (int i = 0; i <=a ; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                System.out.println("Case #" + i + ": "
                        + (Integer.parseInt(st.nextToken())
                        + (Integer.parseInt(st.nextToken())));
        }
        br.close();
    }
}
