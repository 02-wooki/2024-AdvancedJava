package week4;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        byte b[] = {7, 41, 3, 4, -1, 24};
        
        try {
            FileOutputStream fout = new FileOutputStream("/Users/sunghyunwook/Documents/KSU/2024-2/자바프로그래밍응용/AdvancedJava/src/binaryStreamTest.txt");
            for (int i = 0; i < b.length; i++)
                fout.write(b[i]);

            fout.close();
        } catch (IOException e) {
            System.out.println("저장 실패: 경로 명세 확인");
        }
    }
}
