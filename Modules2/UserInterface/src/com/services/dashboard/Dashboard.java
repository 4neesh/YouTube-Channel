package com.services.dashboard;

import com.persistence.MySqlPersister;
import com.services.CarService;

public class Dashboard {

    private Integer carsInStock;

    public void initialise(){
        CarService cs = new CarService();
        MySqlPersister msp = new MySqlPersister();
        this.carsInStock = cs.getCarsInStock();
    }
}
