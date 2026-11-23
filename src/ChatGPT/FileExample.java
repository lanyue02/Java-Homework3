package ChatGPT;

import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        try {
            // 寫入檔案
            FileWriter writer = new FileWriter("test.txt");

            writer.write("Hello Java!\n");
            writer.write("This is a file example.");

            writer.close();

            System.out.println("檔案寫入成功！");

            // 讀取檔案
            FileReader reader = new FileReader("test.txt");
            BufferedReader buffer = new BufferedReader(reader);

            String line;

            System.out.println("檔案內容：");

            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }

            buffer.close();

        } catch (IOException e) {
            System.out.println("發生檔案錯誤！");
        }
    }
}
