package designpatterns.creational.factory.ex2_trucks.store;

import designpatterns.creational.factory.ex2_trucks.vehicle.Crane;
import designpatterns.creational.factory.ex2_trucks.vehicle.Truck;
import designpatterns.creational.factory.ex2_trucks.vehicle.Vehicle;
import designpatterns.creational.factory.ex2_trucks.vehicle.VehicleType;

public class HeavyVehicleStore extends VehicleStore {
    @Override
    public Vehicle createVehicle(VehicleType vehicleType) {
        switch (vehicleType){
            case TRUCK: return new Truck();
            case CRANE: return new Crane();
        }
        return null;
    }
}
