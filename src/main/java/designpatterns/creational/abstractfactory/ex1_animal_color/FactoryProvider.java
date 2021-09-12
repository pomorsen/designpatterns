package designpatterns.creational.abstractfactory.ex1_animal_color;

public class FactoryProvider {
    public static AbstractFactory getFactory(String factoryType){
        if("Animal".equalsIgnoreCase(factoryType)){
            return new AnimalFactory();
        } else if ("Color".equalsIgnoreCase(factoryType)){
            return new ColorFactory();
        }
        throw new RuntimeException("Unknown factory type");
    }
}
