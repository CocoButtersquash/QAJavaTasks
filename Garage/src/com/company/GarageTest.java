package com.company;

import junit.framework.TestCase;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 09/08/2017.
 */
public class GarageTest extends TestCase {
    @org.junit.Before
    public void setUp() throws Exception {
    Garage garage = new Garage();
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void addVehicle() throws Exception {
        Truck rig = new Truck(false,"Big","Rig","1234ABC","24",75,false,30000.00);

    }

    @org.junit.Test
    public void calculateTotal() throws Exception {

    }

    @org.junit.Test
    public void emptyGarage() throws Exception {

    }

    @org.junit.Test
    public void removeVehicle() throws Exception {

    }

    @org.junit.Test
    public void removeVehicleByRegistration() throws Exception {

    }

    @org.junit.Test
    public void costToFixVehicleWithReg() throws Exception {

    }

    @org.junit.Test
    public void removeTypes() throws Exception {

    }

    @org.junit.Test
    public void fixVehicle() throws Exception {

    }

}