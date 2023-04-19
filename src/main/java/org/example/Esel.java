package org.example;

public class Esel extends Animal{

    public Esel(String name, DietType dietType, int age){
        super(name, dietType, age);
    }

    @Override
    public int calculateSpeed(int age){
        int speed;

        if(age < 7){
            speed = 70; //km/h
        } else if (age >= 7 && age < 20){
            speed = 40;
        } else {
            speed = 110;
        }
        return speed;
    }
}
