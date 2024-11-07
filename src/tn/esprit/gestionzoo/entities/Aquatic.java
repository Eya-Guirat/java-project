package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.service.Carnivore;

public non-sealed class Aquatic extends Animal implements Carnivore<Food> {

    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Aquatic{" +
                "habitat='" + habitat + '\'' +
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

    public void swim() {
        System.out.println("This aquatic animal is swimming");
    }

}
