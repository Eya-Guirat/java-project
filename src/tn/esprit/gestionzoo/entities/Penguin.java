package tn.esprit.gestionzoo.entities;

public class Penguin extends Terrestrial {

    protected float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal, int nbrLegs, float swimmingDepth) {
        super(family, name, age, isMammal, nbrLegs);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.Penguin{" +
                "swimmingDepth=" + swimmingDepth +
                "nbrLegs=" + nbrLegs +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammmal=" + isMammal +
                '}';
    }

    public void swim() {
        System.out.println("This penguin is swimming to a depth of " + swimmingDepth + " meters.");
    }

}
