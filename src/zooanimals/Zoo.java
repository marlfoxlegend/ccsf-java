package zooanimals;

import java.util.ArrayList;

public class Zoo {
    private static ArrayList<iAnimal> animals = new ArrayList<>();

    public static void main(String[] args) {
        Coati coati = new Coati();
        VervetMonkey vervet = new VervetMonkey();
        animals.add(coati);
        animals.add(vervet);
        System.out.println(coati.getAnimalType());
        System.out.println(coati.getIdTag());
        System.out.println(coati.getMinTemperature());
        System.out.println(coati.getMaxTemperature());
        System.out.println(coati.compareTo(vervet));

        System.out.println("_____________________________________");

        System.out.println(vervet.getAnimalType());
        System.out.println(vervet.getIdTag());
        System.out.println(vervet.getMinTemperature());
        System.out.println(vervet.getMaxTemperature());
        System.out.println(coati.compareTo(vervet));
    }
}
