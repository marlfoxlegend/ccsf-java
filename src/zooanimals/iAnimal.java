package zooanimals;

@SuppressWarnings("unused")
public interface iAnimal {
    String getAnimalType();
    int getIdTag();
    void setIdTag(int anIdTag);
    int getMinTemperature();
    int getMaxTemperature();
}