package com.pluralsight;

public class House extends Asset{

    protected String address;
    protected String condition;//1-excellent, 2-good, 3-fair, 4-poor
    protected double squareFoot;
    protected double lotSize;

    //this calls on the getters and setters values for the house properties
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public double getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(double squareFoot) {
        this.squareFoot = squareFoot;
    }

    public double getLotSize() {
        return lotSize;
    }

    public void setLotSize(double lotSize) {
        this.lotSize = lotSize;
    }

    //these are the constructors
    public House(String description, String dateAcquired, double originalCost, String address, String condition, double squareFoot, double lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
        this.condition = condition.toLowerCase();
    }
    @Override
    public double getValue(){
        double pricePerSqFt;
        switch (condition){
            case "excellent":
                pricePerSqFt = 180.00;
                break;
            case "good":
                pricePerSqFt = 130.00;
                break;
            case "fair":
                pricePerSqFt = 90.00;
                break;
            case "poor":
                pricePerSqFt = 80.00;
                break;
            default:
                pricePerSqFt = 0.00;
                break;
        }

        double baseValue = squareFoot * pricePerSqFt;
        double lotBonus = lotSize * 0.25;
        return baseValue + lotBonus;
    }
}
