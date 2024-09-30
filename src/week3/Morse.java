// 2021763040 성현욱

package week3;

import java.util.HashMap;
import java.util.Scanner;

public class Morse {
    final static String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    static HashMap<String, String> morseCode = new HashMap<>();

    public static void main(String[] args) {

        // 모스 해쉬맵 만들기
        for (int i = 0; i < morse.length; i++) {
            morseCode.put(morse[i], String.format("%c", (char)(i + 'a')));
        }

        // 입력받기
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(decodeMorse(input));
    }

    public static String decodeMorse(String input) {
        String result = "";
        String[] arr = input.split(" ");

        for (String s : arr)
            result += morseCode.get(s);

        return result;
    }
}
