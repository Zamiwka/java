package oop;

public class Dog {

    public String name;
    public int age;
    public String breed;
    public String color;
    public String eat() {
        return "Eat-eat";

    }
    public String bark(){
        return "gav-gav";
    }
    public String run(){
        return " run";

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
