package Demo;


public class AppleMobile implements PrototypeCapable {
    private String name = null;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public AppleMobile clone() throws CloneNotSupportedException {
        System.out.println("Cloning Iphone object..");
        return (AppleMobile) super.clone();
    }
    @Override
    public String toString() {
        return "Iphone";
    }
}