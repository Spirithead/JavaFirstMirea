package ru.mirea.task2.opt4;

public class Dog {
    String name;
    int age;
    public Dog(String name, int age){
        this.name=name;
        this.age=age;
    }
    public Dog(){
        name="";
        age=0;
    }

    public String getName(){return name;}
    public int getAge(){return age;}
    public void setName(String name){this.name=name;}
    public void setAge(int age){this.age=age;}
    public int humanAge(){return age*7;}
    public String toString(){
        return "name: "+name+", age: "+age;
    }
}
