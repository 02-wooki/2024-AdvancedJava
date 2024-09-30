package week4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriter fout = null;

        int c;
        try {
            fout = new FileWriter("/Users/sunghyunwook/Documents/KSU/2024-2/자바프로그래밍응용/AdvancedJava/src/outputTest.txt");
            String line = scanner.nextLine();

            while (line.length() != 0) {
                fout.write(line, 0, line.length());
                fout.write("\r\n");

                line = scanner.nextLine();
            }

            fout.close();
        } catch (IOException e) {
            System.out.println("출력 오류");
        }
    }
}
