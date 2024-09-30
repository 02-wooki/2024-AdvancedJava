// 1분반, 2021763040 성현욱

package Ot;

import java.util.Scanner;

public class RobotTest {
    public static void main(String[] args) {

        // command 입력
        Scanner in = new Scanner(System.in);
        String command = in.nextLine();

        // Robot 인스턴스 생성
        Robot r = new Robot();

        // command 처리
        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            switch (c) {
                case 'R': r.turnR();    break;
                case 'L': r.turnL();    break;
                case 'G': r.go();       break;
                case 'B': r.back();     break;
                default:
                    System.out.println("Unknown command error.");
                    System.exit(1);
            }
        }

        // 출력
        System.out.println("[" + r.x + ", " + r.y + "]");
    }
}

class Robot {
    static final int[] dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};
    int facing;
    int x, y;


    // initializer
    Robot() {
        x = 0;  y = 0;
        facing = 0;
    }

    public void turnR() {
        facing = (facing + 1) % 4;
    }
    public void turnL() {
        facing = (facing + 3) % 4;
    }
    public void go() {
        x += dx[facing];
        y += dy[facing];
    }
    public void back() {
        x -= dx[facing];
        y -= dy[facing];
    }
}