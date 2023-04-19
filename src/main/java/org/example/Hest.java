package org.example;

public class Hest extends Animal {

    public Hest (String name, DietType dietType, int age){
        super(name, dietType, age);
    }

    @Override
    public int calculateSpeed(int age) {
        int speed;

        if(age < 5){
            speed = 50; //km/h
        } else if (age >= 5 && age < 18){
            speed = 86; 
        } else {
            speed = 100;
        }
        return speed;
    }

}
