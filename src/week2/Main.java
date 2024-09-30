// 소프트웨어학과
// 2021763040 성현욱

package week2;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("이건우", "게시판 이용자", 50);
        System.out.println("내 이름은 " + p.getName() + "이고, 직업은 " + p.getJob() + "이다.");
        System.out.println("나이는 " + p.getAge() + "이다.");
        p.sleep();
        p.eat("봉골레크림파스타");

        Student s = new Student("손영빈", 23);
        s.sleep();
        if(s instanceof Student)
            ((Student) s).study("국어");

        Teacher t = new Teacher("강동협", 99);
        t.teach("수학");
        t.sleep();
        t.study("영어");
    }
}
