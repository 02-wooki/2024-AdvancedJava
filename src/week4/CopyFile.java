package week4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        try {
            FileReader fin = new FileReader("/Users/sunghyunwook/Documents/KSU/2024-2/자바프로그래밍응용/AdvancedJava/src/inputTest.txt");
            FileWriter fout = new FileWriter("/Users/sunghyunwook/Documents/KSU/2024-2/자바프로그래밍응용/AdvancedJava/src/outputTest.txt");

            int c;
            while ((c = fin.read()) != -1)
                fout.write(c);

            fout.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
