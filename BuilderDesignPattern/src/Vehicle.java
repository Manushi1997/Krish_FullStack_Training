public class Vehicle {
    //required parameters

    private String CAR;
    private String VAN;
    private String BIKE;


    //optional parameters
    private boolean isFuelTypePetrol;
    private boolean isVehicleHaveLicence;

    private Vehicle(Builder builder) {
        this.CAR = builder.CAR;
        this.VAN = builder.VAN;
        this.BIKE = builder.BIKE;
        this.isFuelTypePetrol= builder.isFuelTypePetrol;
        this.isVehicleHaveLicence = builder.isVehicleHaveLicence;
    }

    public String getCAR() {
        return CAR;
    }
    public String getVAN() {
        return VAN;
    }
    public String getBIKE() {
        return BIKE;
    }
    public boolean isFuelTypePetrol() {
        return isFuelTypePetrol;
    }
    public boolean isVehicleHaveLicence() {
        return isVehicleHaveLicence;
    }

    public static class Builder{
        //required parameters
        private String CAR;
        private String VAN;
        private String BIKE;


        //optional parameters
        private boolean isVehicleHaveLicence;
        private boolean isFuelTypePetrol;

        public Builder(String car, String van, String bike) {
            this.CAR = car;
            this.VAN = van;
            this.BIKE = bike;
        }

        public Builder setVehicleHaveLicence(boolean isVehicleHaveLicence) {
            this.isVehicleHaveLicence = isVehicleHaveLicence;
            return this;
        }

        public Builder setFuelTypePetrol(boolean isFuelTypePetrol) {
            this.isFuelTypePetrol = isFuelTypePetrol;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }


}
