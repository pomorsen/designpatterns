package designpatterns.creational.abstractfactory.ex1_animal_color.exception;

public class UnknownAnimalTypeException extends RuntimeException {
    private static final String ANIMAL_TYPE_NOT_FOUND = "Animal type not found.";

    public UnknownAnimalTypeException() {
        super(ANIMAL_TYPE_NOT_FOUND);
    }
}
