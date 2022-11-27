package zooanimals;
/*
Author: Lam Vong
 */
class VervetMonkey implements iAnimal{
    private String animaltype;
    private int IDnumber;
    private int mincelsius;
    private int maxcelsius;

    public String getAnimalType() {
        animaltype = "VervetMonkey";
        return animaltype;
    }

    public int getIdTag() {
        return IDnumber;
    }

    public void setIdTag(int anIdTag) {
        if (anIdTag >= 100000000 && anIdTag <= 999999999) {//(set the ID to be nine digits and first digit can not be 0)
            IDnumber = anIdTag;
        }
        else {
            System.out.println("Invaid ID!");
        }
    }

    public int getMinTemperature() {
        mincelsius = 18;
        return mincelsius;
    }

    public int getMaxTemperature() {
        maxcelsius = 26;
        return maxcelsius ;
    }

}