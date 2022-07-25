package Home;

import Model.*;

public class Home {
    public static Animal getAnimal(String type, String name, String color, String food){
        if("Dog".equalsIgnoreCase(type)) return new Dog(name, color, food);
        else if("Cat".equalsIgnoreCase(type)) return new Cat(name, color, food);

        return null;
    }
}
