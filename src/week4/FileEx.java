package week4;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        File f1 = new File("/Users/sunghyunwook/Documents/KSU/2024-2/자바프로그래밍응용/AdvancedJava/src/");

        System.out.println(f1.getName());
        System.out.println(f1.getParent());
        System.out.println(f1.getPath());
        System.out.println(f1.isFile() ? "file" : "dir");

        System.out.println(listDirectory(f1));
    }

    public static String listDirectory(File dir) {
        String s = "";

        System.out.println("-----------" + dir.getPath() + "-----------");
        File[] subFiles = dir.listFiles();  // dir에 속한 파일들을 File 객체 배열로 리턴

        for (File file : subFiles) {
            long mod = file.lastModified();
            s += String.format("%-25s %-12s Size: %4dByte   Modified: %tb %td %ta %tT\n", file.getName(), file.isFile() ? "File":"Directory", file.length(), mod, mod, mod, mod);
        }

        return s;
    }
}
