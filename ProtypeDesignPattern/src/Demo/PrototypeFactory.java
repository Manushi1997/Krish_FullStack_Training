package Demo;

public class PrototypeFactory {
    public static class ModelType
    {
        public static final String MOBILE = "mobile";
        public static final String ANDROIDMOBILE = "android";
        public static final String IPHONEMOBILE = "iphone";
    }
    private static java.util.Map<String , PrototypeCapable> prototypes = new java.util.HashMap<String , PrototypeCapable>();

    static
    {
        prototypes.put(ModelType.MOBILE, new Mobile());
        prototypes.put(ModelType.ANDROIDMOBILE, new AndroidMobile());
        prototypes.put(ModelType.IPHONEMOBILE, new AppleMobile());
    }

    public static PrototypeCapable getInstance(final String s) throws CloneNotSupportedException {
        return ((PrototypeCapable) prototypes.get(s)).clone();
    }
}
