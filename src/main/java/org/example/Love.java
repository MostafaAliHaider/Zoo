package org.example;

public class Love extends Animal{

    public Love(String name, DietType dietType, int age){
        super(name, dietType, age);
    }

    @Override
    public int calculateSpeed(int age) {
        int speed;

        if(age < 10){
            speed = 50; //km/h
        } else if (age >= 10 && age < 28){
            speed = 86;
        } else {
            speed = 90;
        }
        return speed;
    }


}
