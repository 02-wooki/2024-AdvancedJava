package week4;

import java.io.*;

public class FileReaderEx {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            // FileReader로 inputTest.txt 파일 객체 생성
            FileReader fin = new FileReader("/Users/sunghyunwook/Documents/KSU/2024-2/자바프로그래밍응용/AdvancedJava/src/inputTest.txt");

            int c;
            while ((c = fin.read()) != -1)
                System.out.print((char)c);

        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
