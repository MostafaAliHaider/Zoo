package org.example;

public class Main {
    public static void main(String[] args) {

        Hest hest = new Hest("husan", DietType.HERBIVORE, 8 );
        Hest husan = new Hest("husanTo", DietType.HERBIVORE, 15);

        Esel humar = new Esel("Humar", DietType.OMNIVORE, 6);
        Esel humarTo = new Esel("Jenny", DietType.OMNIVORE, 9);

        Love simba = new Love("Simba", DietType.CARNIVORE, 25);
        Love mufasa = new Love("Mufasa", DietType.CARNIVORE, 11);

        System.out.println(mufasa);

    }
}