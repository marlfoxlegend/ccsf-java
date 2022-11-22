package zooanimals;

public class Zoo {
    public static void main(String[] args) {
        Coati coati = new Coati();
        Coati buddyCoati = new Coati();
        System.out.println(coati.getAnimalType());
        System.out.println(coati.getIdTag());
        System.out.println(coati.getMinTemperature());
        System.out.println(coati.getMaxTemperature());
        System.out.println(coati.compareTo(buddyCoati));
        System.out.println(coati);
        System.out.println(buddyCoati);
    }
}
