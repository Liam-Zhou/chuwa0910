package com.chuwa.shawnlearning.vehicle.impl;

import com.chuwa.shawnlearning.vehicle.Vehicle;
import com.chuwa.shawnlearning.vehicle.VehicleType;

public class BigTruck extends VehicleBase implements Vehicle  {
    BigTruck(String plateNumber) {
        super(plateNumber);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.TRUCK;
    }

}