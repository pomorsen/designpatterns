package designpatterns.creational.abstractfactory.ex1_animal_color;

import designpatterns.creational.abstractfactory.ex1_animal_color.color.Brown;
import designpatterns.creational.abstractfactory.ex1_animal_color.color.White;

public class ColorFactory implements AbstractFactory {
    @Override
    public Object create(String colorName) {
        switch (colorName){
            case "Brown": return new Brown();
            case "White": return new White();
        }
        throw new RuntimeException("Unkown color name");
    }
}
