package PrototypeDesign;
import Demo.*;

public class Main {

    public static void main(String[] args) {
        try {
            String mobilePrototype = PrototypeFactory.getInstance(PrototypeFactory.ModelType.MOBILE).toString();
            System.out.println(mobilePrototype);

            String androidPrototype = PrototypeFactory.getInstance(PrototypeFactory.ModelType.ANDROIDMOBILE).toString();
            System.out.println(androidPrototype);

            String iphonePrototype = PrototypeFactory.getInstance(PrototypeFactory.ModelType.IPHONEMOBILE).toString();
            System.out.println(iphonePrototype);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}