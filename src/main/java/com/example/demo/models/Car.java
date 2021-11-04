package com.example.demo.models;

public class Car {

    private String carID;
    private String manufacturer;
    private String model;
    private String productionYear;
    private String horsepower;
    private String consumption;
    private String consumptionType;
    private String price;

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public String getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(String horsepower) {
        this.horsepower = horsepower;
    }

    public String getConsumptionType() {
        return consumptionType;
    }

    public void setConsumptionType(String consumptionType) {
        this.consumptionType = consumptionType;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getConsumption() {
        return consumption;
    }

    public void setConsumption(String consumption) {
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carID='" + carID + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", productionYear='" + productionYear + '\'' +
                ", horsepower='" + horsepower + '\'' +
                ", consumption='" + consumption + '\'' +
                ", consumptionType='" + consumptionType + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public Car(String consumption, String consumptionType) {
        this.consumption = consumption;
        this.consumptionType = consumptionType;
    }
    public Car(){

    }
}
