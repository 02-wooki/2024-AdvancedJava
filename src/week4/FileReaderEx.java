package week4;

import java.io.*;

public class FileReaderEx {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            FileReader fin = new FileReader("/Users/sunghyunwook/Documents/KSU/2024-2/자바프로그래밍응용/AdvancedJava/src/index.txt");
//            FileInputStream fis = new FileInputStream("/Users/sunghyunwook/Documents/KSU/2024-2/자바프로그래밍응용/AdvancedJava/src/index.txt");
//            InputStreamReader in = new InputStreamReader(fis);

            int c;
            while ((c = fin.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
