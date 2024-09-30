package week2;

public class Student extends Person {


    public Student(String name, int age) {
        super(name, "학생", age);
    }

    public void study(String s) {
        System.out.println(getName() + "은 " + s + "를 공부합니다.");
    }
    @Override
    public void eat() {
        System.out.println(getName() + "은 도시락을 먹었다.");
    }
}
