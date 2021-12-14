package objects;

import java.io.Serializable;

public class Cat implements Serializable {

    String nameCat;
    int ageCat;
    String colorCat;

    public Cat(String nameCat, int ageCat, String colorCat) {
        this.nameCat = nameCat;
        this.ageCat = ageCat;
        this.colorCat = colorCat;
    }

    public Cat() {
    }

    public String getNameCat() {
        return nameCat;
    }

    public int getAgeCat() {
        return ageCat;
    }

    public String getColorCat() {
        return colorCat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nameCat='" + nameCat + '\'' +
                ", ageCat=" + ageCat +
                ", colorCat='" + colorCat + '\'' +
                '}';
    }
}

