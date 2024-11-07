package tn.esprit.gestionzoo.service;

public interface Omnivore <T> extends Carnivore<T>, Herbivore<T>{
    void eatPlantAndMeat(T food);

}
