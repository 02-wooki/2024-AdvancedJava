package week2;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

public class Person {

    String name;
    String job;
    int age;

    public Person(String name, String job, int age) {
        setName(name);
        setJob(job);
        setAge(age);
    }

    @Getter
    public String getName() {
        return name;
    }
    @Getter
    public String getJob() {
        return job;
    }
    @Getter
    public int getAge() {
        return age;
    }

    @Setter
    public void setName(String name) {
        this.name = name;
    }
    @Setter
    public void setJob(String job) {
        this.job = job;
    }
    @Setter
    public void setAge(int age) {
        if(age <= 0)
            this.age = 0;
        else
            System.out.println("나이를 바르게 입력해 주세요.");
    }



    public void say(String s) {
        System.out.println("\"" + s + "\"");
    }
    public void sleep() {
        System.out.println("잠을 잤다.");
    }
    public void eat(String s) {
        System.out.println(name + "은 " + s + "를 먹었다.");
    }
    public void eat() {
        System.out.println(name + "은 밥을 먹었다.");
    }

}
