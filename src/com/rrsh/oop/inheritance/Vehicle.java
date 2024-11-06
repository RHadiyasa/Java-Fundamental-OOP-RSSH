package com.rrsh.oop.inheritance;

public class Vehicle{
    private String fuel;
    private String transmission;
    private boolean isElectric;

    public Vehicle(String fuel, String transmission, boolean isElectric) {
        this.fuel = fuel;
        this.transmission = transmission;
        this.isElectric = isElectric;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

   public String toString(){
        return this.fuel + " , " + this.transmission + " , " + this.isElectric;
   }
}
