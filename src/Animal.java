public class Animal {

    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family ,String name, int age,boolean isMammal ) {
        this.isMammal = isMammal;
        this.age = age;
        this.name = name;
        this.family = family;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
