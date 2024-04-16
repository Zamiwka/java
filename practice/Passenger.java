package practice;

public class Passenger {
    //IS A --->Dad -> Son --> Association
    // Has A --->CHELOVEK ->HAND--> composition|

    public String name;
    private int age;


    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
