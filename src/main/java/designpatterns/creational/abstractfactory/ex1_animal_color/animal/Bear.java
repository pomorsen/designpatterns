package designpatterns.creational.abstractfactory.ex1_animal_color.animal;

public class Bear implements Animal {
    @Override
    public String getType() {
        return "Bear";
    }

    @Override
    public String makeSound() {
        return null;
    }
}
