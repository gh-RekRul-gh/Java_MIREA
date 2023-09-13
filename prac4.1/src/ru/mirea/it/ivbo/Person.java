package ru.mirea.it.ivbo;

public class Person {
    private String fullName = "noname";
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        System.out.println(this.fullName + " became " + fullName);
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println(this.fullName + " became " + age + "y.o.");
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " is moving");
    }
    public void talk() {
        System.out.println(fullName + " is talking");
    }

}
