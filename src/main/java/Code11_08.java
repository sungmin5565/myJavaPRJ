import java.io.BufferedReader;
import java.io.FileReader;

public class Code11_08 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("c:FirstJaca/myData1.txt"));
            String inStr;

            while (true) {
                inStr = br.readLine();
                if (inStr == null)
                    break;
            }

            br.close();
        } catch (Exception e) {
        }
    }
}
