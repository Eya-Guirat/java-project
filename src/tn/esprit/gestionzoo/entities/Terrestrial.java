package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.service.Omnivore;

public non-sealed class Terrestrial extends Animal implements Omnivore<Food> {

    int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.Terrestrial{" +
                "nbrLegs=" + nbrLegs +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammmal=" + isMammal +
                '}';
    }

    @Override
    public void eatMeat(Food meat) {
    System.out.println(meat);
    }


    @Override
    public void eatPlantAndMeat(Food food) {
    System.out.println(food);
    }

    @Override
    public void eatPlant(Food plant) {
    System.out.println(plant);
    }
}
