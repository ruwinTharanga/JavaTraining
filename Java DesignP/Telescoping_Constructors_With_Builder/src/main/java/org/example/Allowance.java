package org.example;

public class Allowance {
    private final String InternetAllowance; // required
    private final String CarAllowance; // required
    private final String TravelAllowance; // required
    // constructor
    public Allowance (Bulder bulder){
        this.CarAllowance = bulder.CarAllowance;
        this.TravelAllowance = bulder.TravelAllowance;
        this.InternetAllowance = bulder.InternetAllowance;
    }
    // Inner static class
    // Builder class
    public static class Bulder{
        private  String InternetAllowance;
        private  String CarAllowance;
        private  String TravelAllowance;

        public Bulder(String InternetAllowance){
            this.InternetAllowance = InternetAllowance;
        }
        // get instance of Allowance
        public Allowance build() {
            // constructor of monthly salary
            // builder instance is passed as parameter
            return new Allowance(this);
        }
        // required Allowance
        public Bulder CarAllowance(String CarAllowance){
            this.CarAllowance = CarAllowance;
            return this;
        }
        // required Allowance
        public Bulder TravelAllowance(String TravelAllowance){
            this.TravelAllowance = TravelAllowance;
            return this;
        }
    }
    @Override
    public String toString() {
        return "Allowance{" +
                "InternetAllowance='" + InternetAllowance + '\'' +
                ", CarAllowance='" + CarAllowance + '\'' +
                ", TravelAllowance='" + TravelAllowance + '\'' +
                '}';
    }
}
