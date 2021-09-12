package designpatterns.creational.factory.ex2_trucks;

import designpatterns.creational.factory.ex2_trucks.store.HeavyVehicleStore;
import designpatterns.creational.factory.ex2_trucks.store.VehicleStore;
import designpatterns.creational.factory.ex2_trucks.vehicle.VehicleType;

public class Demo {

  public static void main(String[] args) {
    VehicleStore vehicleStore = new HeavyVehicleStore();
    vehicleStore.orderVehicle(VehicleType.CRANE);
    vehicleStore.orderVehicle(VehicleType.TRUCK);
  }
}
