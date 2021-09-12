package designpatterns.creational.factory.ex2_trucks.store;

import designpatterns.creational.factory.ex2_trucks.vehicle.Vehicle;
import designpatterns.creational.factory.ex2_trucks.vehicle.VehicleType;

public abstract class VehicleStore {

    public void orderVehicle(VehicleType vehicleType){
        Vehicle vehicle = createVehicle(vehicleType);
        vehicle.polish();
    }

    public abstract Vehicle createVehicle(VehicleType vehicleType);

}
