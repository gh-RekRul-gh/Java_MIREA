package ru.mirea.it.ivbo;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Alex", 23);
        person1.talk();
        person1.setFullName("Sam");
        person1.setAge(34);
        person1.move();
        person2.setAge(31);
        person2.talk();
    }
}