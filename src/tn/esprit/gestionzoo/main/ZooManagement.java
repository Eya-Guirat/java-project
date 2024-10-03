package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {

    public static void main(String[] args) {
//        int nbCages;
//        String zooName;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Ecrire le nom du zoo:");
//        zooName = scanner.nextLine();
//
//        System.out.println("Ecrire le nombre de cages dans le zoo:");
//        nbCages = scanner.nextInt();
//
//        System.out.println(zooName + " comporte " + nbCages + " cages");

        //prosit2
        Animal[] animals = new Animal[25];

        Animal lion = new Animal("Felidae", "simba", 5, true);
        Animal zebra = new Animal("Fam1", "flio", 5, true);
        Animal elephant = new Animal("Fam2", "mlio", 5, true);
        Animal tiger = new Animal("Felidae", "Shere Khan", 7, true);
        Animal bear = new Animal("Ursidae", "Baloo", 10, true);

        Animal zebra2 = new Animal("Fam1", "flio", 5, true);

        animals[0] = lion;
        animals[1] = zebra;
        animals[2] = elephant;
        animals[3] = tiger;
        animals[4] = bear;

        Zoo myZoo = new Zoo(animals, "safari", "australia");

        //prosit 3
        myZoo.addAnimal(lion);
        myZoo.addAnimal(zebra);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(bear);

        myZoo.displayZoo();
        myZoo.displayAnimals();


        int indice = myZoo.searchAnimal(zebra);
        System.out.println(indice);


        indice = myZoo.searchAnimal(zebra2);
        System.out.println(indice);

        boolean remove = myZoo.removeAnimal(tiger);
        myZoo.displayAnimals();

        boolean isFull = myZoo.isZooFull();
        System.out.println(isFull);

        Zoo myZoo2 = new Zoo(animals, "safar", "South");
        myZoo2.addAnimal(bear);
        myZoo2.addAnimal(lion);

        Zoo comparer = Zoo.comparerZoo(myZoo, myZoo2);
        System.out.println(comparer);


//        System.out.println(myZoo);
//        System.out.println(myZoo.toString());
//
//       System.out.println(lion);
//       System.out.println(lion.toString());
//
//       myZoo.addAnimal(lion);
//       System.out.println(myZoo);

    }
}
