package access;

public class Person {
    Computer pc = new Computer();//computer has default modifier
    //static Planet planet;
    private int age; //limits access to variable--INSTANCE variable

    public void setAge(int val) {
        age = val;
    }
    public int getAge() {
        return age;
    }

    public void code() {
        pc.code();
    }
}
//since two classes in the same package it is allowed
class House {
    public void tenant(){
        Person person = new Person();
        person.setAge(1);
        person.pc = new Computer();//compiles just fine
    }
}