package zooanimals;

@SuppressWarnings("unused")
public interface IAnimal {
    String getAnimalType();
    int getIdTag();
    void setIdTag(int anIdTag);
    int getMinTemperature();
    int getMaxTemperature();
}