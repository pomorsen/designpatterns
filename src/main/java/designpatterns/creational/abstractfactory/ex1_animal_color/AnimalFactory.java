package designpatterns.creational.abstractfactory.ex1_animal_color;

import designpatterns.creational.abstractfactory.ex1_animal_color.animal.Animal;
import designpatterns.creational.abstractfactory.ex1_animal_color.animal.Bear;
import designpatterns.creational.abstractfactory.ex1_animal_color.animal.Dog;
import designpatterns.creational.abstractfactory.ex1_animal_color.exception.UnknownAnimalTypeException;

public class AnimalFactory implements AbstractFactory {
    @Override
    public Animal create(String animalType) {
        switch (animalType){
            case "Dog": return new Dog();
            case "Bear": return new Bear();
        }
        throw new UnknownAnimalTypeException();
    }
}
