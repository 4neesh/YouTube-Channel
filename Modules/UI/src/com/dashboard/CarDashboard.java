package com.dashboard;

public class CarDashboard {

    private int availableCars;

    public void initialiseData(){
//        CarServiceA cs = new CarServiceA();
        CarService cs2 = new CarService();
        this.availableCars = cs.getAvailableCars();

    }

}
