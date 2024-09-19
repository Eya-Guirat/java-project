import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {
        int nbCages;
        String zooName;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ecrire le nom du zoo:");
        zooName = scanner.nextLine();

        System.out.println("Ecrire le nombre de cages dans le zoo:");
        nbCages = scanner.nextInt();

        System.out.println(zooName + " comporte " + nbCages + " cages");

        Animal animals[] = new Animal[25];

        Animal lion = new Animal("Felidae", "simba", 5, true);

        animals[0] = lion;

        Zoo myZoo = new Zoo(animals, "safari", "australia", 18);

        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        //Zoo@49097b5d
        //Zoo@49097b5d
//
       System.out.println(lion);
       System.out.println(lion.toString());

    }
}
