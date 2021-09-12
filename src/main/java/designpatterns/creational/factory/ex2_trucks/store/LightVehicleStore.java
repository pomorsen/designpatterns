package designpatterns.creational.factory.ex2_trucks.store;

import designpatterns.creational.factory.ex2_trucks.vehicle.Bike;
import designpatterns.creational.factory.ex2_trucks.vehicle.Car;
import designpatterns.creational.factory.ex2_trucks.vehicle.Vehicle;
import designpatterns.creational.factory.ex2_trucks.vehicle.VehicleType;

public class LightVehicleStore extends VehicleStore {
    @Override
    public Vehicle createVehicle(VehicleType vehicleType) {
        switch (vehicleType){
            case BIKE: return new Bike();
            case CAR: return new Car();
        }
        return null;
    }
}
