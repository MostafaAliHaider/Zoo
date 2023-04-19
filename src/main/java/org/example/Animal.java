package org.example;

public abstract class Animal {
    private String name;
    private DietType dietType;
    private int age;


    public Animal(String name, DietType dietType, int age){
        this.name = name;
        this.dietType = dietType;
        this.age  = age;
    }


    public abstract int calculateSpeed(int age);


    @Override
    public String toString(){
        return  name + " har diet type " + dietType + "." + " Den er " + age + " år gammel, og har en hastighet på " + calculateSpeed(age) + " kilometer i timen.";
    }
}
