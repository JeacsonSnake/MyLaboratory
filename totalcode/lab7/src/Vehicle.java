public class Vehicle {
    protected int noOfDoors;
    protected String brand;

    public Vehicle() {
        System.out.println("Default Constructor of the Super class called");
    }

    public Vehicle(int noOfDoors, String brand) {
        System.out.println("General Constructor of Vehicle called");
        this.noOfDoors = noOfDoors;
        this.brand = brand;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printDetails(){
        System.out.println(noOfDoors);
        System.out.println(brand);
    }

}
