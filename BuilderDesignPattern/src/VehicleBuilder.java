public class VehicleBuilder {
    public Vehicle getBasicComputer() {
        return new Vehicle().Builder("Car Alto", "Van Dolphin", "Bike Metro").build();
    }

    public Vehicle getGraphicsCardEnabledComputer() {
        return new Vehicle().Builder("Car Alto", "Van Dolphin", "Bike Metro").setGraphicsCardEnabled(true).build();
    }
}
