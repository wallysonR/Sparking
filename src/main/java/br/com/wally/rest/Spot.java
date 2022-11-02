package br.com.wally.rest;

public class Spot {
    private String id;
    private String licensePlateCar;
    private String brandCar;
    private String modelCar;
    private String colorCar;
    private String responsibleName;
    private String block;
    private String localSpot;

    public Spot() {}
    public Spot(String id, String licensePlateCar, String brandCar, String modelCar, String colorCar, String responsibleName, String block, String localSpot) {
        this.id = id;
        this.licensePlateCar = licensePlateCar;
        this.brandCar = brandCar;
        this.modelCar = modelCar;
        this.colorCar = colorCar;
        this.responsibleName = responsibleName;
        this.block = block;
        this.localSpot = localSpot;
    }

    public String getLocalSpot() {
        return localSpot;
    }

    public void setLocalSpot(String localSpot) {
        this.localSpot = localSpot;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

}
