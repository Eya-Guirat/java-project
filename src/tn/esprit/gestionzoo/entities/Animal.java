package tn.esprit.gestionzoo.entities;

public class Animal {

    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid Age");
        } else {

            this.age = age;
        }

    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public Animal(String family , String name, int age, boolean isMammal ) {
        this.isMammal = isMammal;
        this.age = age;
        this.name = name;
        this.family = family;
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
