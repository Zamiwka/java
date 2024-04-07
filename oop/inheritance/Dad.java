package oop.inheritance;

public class Dad {
    public   String name;
    protected  int age;
    String nose;
    private String hair;
    public  Dad(String name,int age,String nose,String hair) {
        this.name = name;
        this.age =age;
        this.nose = nose;
        this.hair = hair;
    }
    public Dad(String name, int age){
        this.name = name;
        this.age = age;

    }
    public String talent (){
        return "hudojnik";
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }


    @Override
    public String toString() {
        return "Dad{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nose='" + nose + '\'' +
                ", hair='" + hair + '\'' +
                '}';
    }

}
