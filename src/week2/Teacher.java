package week2;

public class Teacher extends Person implements Teachable, Studyable {
    public Teacher(String name, int age) {
        super(name, "교사", age);
    }

    public void teach(String s) {
        System.out.println(getName() + " 선생님은 " + s + "과목을 가르칩니다.");
    }
    public void study(String s) {
        System.out.println(getName() + "선생님은 " + s + "과목을 공부합니다.");
    }
}
