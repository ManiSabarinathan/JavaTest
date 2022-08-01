public class VehicleCarThisSuperTest {
    public static void main(String ... args) {
        Car c1 = new Car("tran1");
        System.out.println("trans:: "+ c1.trans + " type:: " + c1.type + " maxSpeed:: " + c1.maxSpeed);

        Car c2 = new Car("2W",200,"trans2");
        System.out.println("trans:: "+ c2.trans + " type:: " + c2.type + " maxSpeed:: " + c2.maxSpeed);

    }
}

class Vehicle {
    String type = "4W";
    int maxSpeed = 100;
    Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
    Vehicle() {

    }
}

class Car extends Vehicle {
    String trans;
    Car(String trans) {
        this.trans = trans;
    }
    Car(String type, int maxSpeed, String trans) {
        super(type,maxSpeed);
        this.trans = trans;
    }
}