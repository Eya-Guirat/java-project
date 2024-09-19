public class Zoo {

    Animal [] animals;
    String name;
    String city;
     int nbrCages;

    public Zoo(Animal[] animals, String name, String city,int nbrCages) {
        this.animals = new Animal[nbrCages];
        this.nbrCages = nbrCages;
        this.city = city;
        this.name = name;
    }


    public void displayZoo(){

        System.out.println("Name: " + name + "City: " + city + "Nombre Cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}