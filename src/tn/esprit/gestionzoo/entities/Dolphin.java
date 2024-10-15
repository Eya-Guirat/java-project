package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{

    protected float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal , String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Dolphin{" +
                "swimmingSpeed='" + swimmingSpeed + '\'' +
                "habitat='" + habitat + '\'' +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammmal=" + isMammal +
                '}';
    }

    public void swim (){
        System.out.println("This dolphin is swimming");
    }

}
