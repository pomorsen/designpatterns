package designpatterns.creational.abstractfactory.ex1_animal_color;

public interface AbstractFactory<T> {
    T create(String animalType);
}
