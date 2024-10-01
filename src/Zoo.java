public class Zoo {

    Animal [] animals;
    String name;
    String city;
    static int nbrCages=25;

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

    public boolean addAnimal(Animal animal){
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i]!=null && animal.name.equals(animals[i].name)  ) {
                return false;
            } else if (animals[i] == null) {
                animals[i] = animal;
                return true;
            }

        }
        return false;
    }

    public void displayAnimals(){
        for (int i = 0; i < nbrCages; i++) {
            if(animals[i] != null){
                System.out.println(animals[i].toString());
            }
        }
    }

    public int searchAnimal(Animal animal){
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i]==animal && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }


    public boolean removeAnimal(Animal animal){
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i]==animal ) {
                animals[i] = null;
                System.out.println("animal removed");
                for (int j = i ; j < nbrCages -1; j++) {
                    animals[j] = animals[j+1];
                }
                return true;
            }
        }
        return false;
    }


    public boolean isZooFull(){
        int nbAnimals =0;
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i]!=null) {
                nbAnimals = nbAnimals + 1;
            }
        }
        return (nbAnimals == nbrCages);
    }


    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        int nbAnimalsZ1 = 0;
        int nbAnimalsZ2 = 0;

        for (int i = 0; i < z1.nbrCages; i++) {
            if (z1.animals[i] != null) {
                nbAnimalsZ1++;
            }
        }

        for (int i = 0; i < z2.nbrCages; i++) {
            if (z2.animals[i] != null) {
                nbAnimalsZ2++;
            }
        }

        return nbAnimalsZ1 > nbAnimalsZ2 ? z1 : z2;
    }




}