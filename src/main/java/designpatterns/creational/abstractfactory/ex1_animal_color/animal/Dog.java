package designpatterns.creational.abstractfactory.ex1_animal_color.animal;

public class Dog implements Animal {
  @Override
  public String getType() {
    return "Dog";
  }

  @Override
  public String makeSound() {
    return "Woof!";
  }
}
