// 2021763040 성현욱

package week3;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {

    static TreeSet<Integer> nums = new TreeSet<>();

    public static void main(String[] args) {
        while (nums.size() < 6) {
            nums.add(random());
        }
        System.out.println(nums);
    }

    public static int random() {
        Random r = new Random();
        return r.nextInt(44) + 1;
    }
}
