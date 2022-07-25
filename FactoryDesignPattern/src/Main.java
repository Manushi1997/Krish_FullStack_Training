import Home.*;
import Model.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("working code");
        Animal Dog = Home.getAnimal("Dog","Jade","black and brown","chicken");
        Animal Cat= Home.getAnimal("Cat","Kitty","white","milk");
        System.out.println("Factory Dog Config::"+Dog);
        System.out.println("Factory cat Config::"+ Cat);
    }
    }
