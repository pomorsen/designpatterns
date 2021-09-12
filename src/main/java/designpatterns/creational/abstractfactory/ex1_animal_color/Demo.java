package designpatterns.creational.abstractfactory.ex1_animal_color;

import designpatterns.creational.abstractfactory.ex1_animal_color.animal.Dog;
import designpatterns.creational.abstractfactory.ex1_animal_color.color.White;

public class Demo {
  public static void main(String[] args) {
    AbstractFactory abstractFactory;

    abstractFactory = FactoryProvider.getFactory("animal");
    Dog dog = (Dog) abstractFactory.create("Dog");
    dog.getType();
    dog.makeSound();

    abstractFactory = FactoryProvider.getFactory("color");
    White white = (White) abstractFactory.create("White");
    white.getColor();
  }
}
