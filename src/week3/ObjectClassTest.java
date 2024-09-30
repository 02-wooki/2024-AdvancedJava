package week3;

import java.util.StringTokenizer;

public class ObjectClassTest {
    public static void main(String[] args) {
        Point n = new Point(10, 15);
        Point x = new Point(10, 15);
        Point m = n;

        System.out.println(n == m);         // true
        System.out.println(n == x);         // false
        System.out.println(n.equals(m));    // true
        System.out.println(n.equals(x));    // true
    }
}

class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        Point p = (Point)obj;   // obj를 Point 객체로 캐스팅
        return (p.x == this.x) && (p.y == this.y);  // x, y 값이 같으면 true
    }

    @Override
    public String toString() {
        return String.format("%s[%d, %d]", getClass().getName(), x, y);
    }
}