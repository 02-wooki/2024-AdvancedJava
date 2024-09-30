package week4;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) {
        byte b[] = new byte[6];

        try {
            FileInputStream fin = new FileInputStream("/Users/sunghyunwook/Documents/KSU/2024-2/자바프로그래밍응용/AdvancedJava/src/binaryStreamTest.txt");
            int n = 0, c;

            while ((c=fin.read()) != -1) {
                b[n] = (byte)c;
                n++;
            }

            System.out.println("binaryStreamTest.txt");
            for (int i = 0; i < b.length; i++)
                System.out.println(b[i] + " ");

        } catch (IOException e) {
            System.out.println("읽기 실패: 경로 명세 확인");
        }
    }
}
