package ru.mirea.ikbo2519.pr1.part1;

public class TestDog {
    public static void main(String[] args) {
        Dog dog_1 = new Dog("Mike", 2);
        Dog dog_2 = new Dog("Helen", 7);
        Dog dog_3 = new Dog("Bob");
        dog_3.setAge(1);
        System.out.println(dog_1);
        dog_1.intoHumanAge();
        dog_2.intoHumanAge();
        dog_3.intoHumanAge();
    }
}
