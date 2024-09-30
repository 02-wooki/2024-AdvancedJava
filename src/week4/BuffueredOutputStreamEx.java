package week4;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class BuffueredOutputStreamEx {
    public static void main(String[] args) {
        try {
            BufferedOutputStream bout = new BufferedOutputStream(System.out, 5);
            FileReader fin = new FileReader("/Users/sunghyunwook/Documents/KSU/2024-2/자바프로그래밍응용/AdvancedJava/src/outputTest.txt");

            int c;
            while ((c = fin.read()) != -1) {
                bout.write((char)c);
            }

            fin.close();
//            bout.close();
        } catch (IOException e) {
            System.out.println("IOException Error Caused");
        }
    }
}
