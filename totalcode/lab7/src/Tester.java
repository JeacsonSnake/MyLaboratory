public class Tester {
    

    public static void main(String[] args) {
        SUV suv1 = new SUV();  
        SUV suv2 = new SUV(2, "Nissan", "4");
        Car car1 = new Car(3, "Ford", true);
        suv1.setBrand("BMW");
        suv1.setDrive("rear");
        suv1.setNoOfDoors(5);
        suv1.printDetails();
        System.out.println(suv1.getDrive());
        car1.setNoOfDoors(5);
        car1.printDetails();
        System.out.println(car1.isSportsModel());
    }

}

class Car extends Vehicle {
    protected boolean sportsModel;

    public Car(int noOfDoors, String brand) {
        super(noOfDoors, brand);
        sportsModel = false;
    }


    public Car(int noOfDoors, String brand, boolean sportsModel) {
        super(noOfDoors, brand);
        this.sportsModel = sportsModel;
    }
    public boolean isSportsModel(){
        return sportsModel;
    }
}
class SUV extends Vehicle{
    protected String wheelDrive;
    
    public SUV() {
    }

    public SUV(int noOfDoors, String brand, String wheelDrive) {
        super(noOfDoors, brand);
        this.wheelDrive = wheelDrive;
    }
    public String getDrive() {
        return wheelDrive;
    }
    public void setDrive(String wheelDrive) {
        this.wheelDrive = wheelDrive;
    }
}