package web.model;

public class Car {
    private String nameOfOwner;
    private int Number;
    private String name;

    public Car(String nameOfOwner, int number, String name) {
        this.nameOfOwner = nameOfOwner;
        Number = number;
        this.name = name;
    }

    public Car() {
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameOfOwner='" + nameOfOwner + '\'' +
                ", Number=" + Number +
                ", name='" + name + '\'' +
                '}';
    }

}

