package zooanimals;

import java.util.Objects;

public class Coati implements IAnimal, Comparable<IAnimal> {
    private static final String ANIMAL_TYPE = "Coati";
    private static final int MIN_CELSIUS = 18;
    private static final int MIN_FAHRENHEIT = 64;
    private static final int MAX_CELSIUS = 32;
    private static final int MAX_FAHRENHEIT = 90;

    private Integer idTag = Objects.hashCode(this);

    public String getAnimalType() {
        return ANIMAL_TYPE;
    }

    public int getIdTag() {
        return idTag;
    }

    public void setIdTag(int anIdTag) {
        idTag = anIdTag;
    }

    public int getMinTemperature() {
        return getMinTemperature(false);
    }

    public int getMinTemperature(boolean inDegreesFahrenheit) {
        return inDegreesFahrenheit ? MIN_FAHRENHEIT : MIN_CELSIUS;
    }

    public int getMaxTemperature() {
        return getMaxTemperature(false);
    }

    public int getMaxTemperature(boolean inDegreesFahrenheit) {
        return inDegreesFahrenheit ? MAX_FAHRENHEIT : MAX_CELSIUS;
    }

    @Override
    public String toString() {
        String fmt = "%S | <IdTag>: %d | <Temperature>[MIN,MAX]: %d\u00B0 C, %d\u00B0 C";
        return String.format(fmt, ANIMAL_TYPE, idTag, getMinTemperature(), getMaxTemperature());
    }

    @Override
    public int compareTo(IAnimal o) {
        return (getAnimalType().compareTo(o.getAnimalType()));
    }
}
