package com.lwj.house;

public class HouseProject {
    private String projectName;
    private String building;
    private String room;
    private String planning;
    private String features;
    private String houseType;
    private String floor;
    private String layerHeight;
    private String oriented;
    private String structure;
    private String publicBuilding;
    private String relocation;
    private String selfuse;
    private String approvedSales;
    private String houseSalespricelist;
    private String closedBalcony;
    private String noClosedBalcony;
    private String kitchen;
    private String bathroom;
    private String forecastArea;
    private String measuredArea;
    private String predictionInsideArea;
    private String measuredInsideArea;
    private String forecastPoolArea;
    private String measuredPoolArea;
    private String mortgage;
    private String seal;
    private String tips;

    public HouseProject(String projectname, String building, String room, String planning, String features, String housetype, String floor, String layerheight, String oriented, String structure, String publicBuilding, String relocation, String selfuse, String approvedsales, String housesalespricelist, String closedbalcony, String noClosedbalcony, String kitchen, String bathroom, String forecastarea, String measuredarea, String predictioninsidearea, String measuredinsidearea, String forecastpoolarea, String measuredpoolarea, String mortgage, String seal, String tips) {
        this.projectName = projectname;
        this.building = building;
        this.room = room;
        this.planning = planning;
        this.features = features;
        houseType = housetype;
        this.floor = floor;
        layerHeight = layerheight;
        this.oriented = oriented;
        this.structure = structure;
        this.publicBuilding = publicBuilding;
        this.relocation = relocation;
        this.selfuse = selfuse;
        approvedSales = approvedsales;
        houseSalespricelist = housesalespricelist;
        closedBalcony = closedbalcony;
        noClosedBalcony = noClosedbalcony;
        this.kitchen = kitchen;
        this.bathroom = bathroom;
        forecastArea = forecastarea;
        measuredArea = measuredarea;
        predictionInsideArea = predictioninsidearea;
        measuredInsideArea = measuredinsidearea;
        forecastPoolArea = forecastpoolarea;
        measuredPoolArea = measuredpoolarea;
        this.mortgage = mortgage;
        this.seal = seal;
        this.tips = tips;
    }

    public HouseProject() {
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getPlanning() {
        return planning;
    }

    public void setPlanning(String planning) {
        this.planning = planning;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getLayerHeight() {
        return layerHeight;
    }

    public void setLayerHeight(String layerHeight) {
        this.layerHeight = layerHeight;
    }

    public String getOriented() {
        return oriented;
    }

    public void setOriented(String oriented) {
        this.oriented = oriented;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getPublicBuilding() {
        return publicBuilding;
    }

    public void setPublicBuilding(String publicBuilding) {
        this.publicBuilding = publicBuilding;
    }

    public String getRelocation() {
        return relocation;
    }

    public void setRelocation(String relocation) {
        this.relocation = relocation;
    }

    public String getSelfuse() {
        return selfuse;
    }

    public void setSelfuse(String selfuse) {
        this.selfuse = selfuse;
    }

    public String getApprovedSales() {
        return approvedSales;
    }

    public void setApprovedSales(String approvedSales) {
        this.approvedSales = approvedSales;
    }

    public String getHouseSalespricelist() {
        return houseSalespricelist;
    }

    public void setHouseSalespricelist(String houseSalespricelist) {
        this.houseSalespricelist = houseSalespricelist;
    }

    public String getClosedBalcony() {
        return closedBalcony;
    }

    public void setClosedBalcony(String closedBalcony) {
        this.closedBalcony = closedBalcony;
    }

    public String getNoClosedBalcony() {
        return noClosedBalcony;
    }

    public void setNoClosedBalcony(String noClosedBalcony) {
        this.noClosedBalcony = noClosedBalcony;
    }

    public String getKitchen() {
        return kitchen;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    public String getBathroom() {
        return bathroom;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }

    public String getForecastArea() {
        return forecastArea;
    }

    public void setForecastArea(String forecastArea) {
        this.forecastArea = forecastArea;
    }

    public String getMeasuredArea() {
        return measuredArea;
    }

    public void setMeasuredArea(String measuredArea) {
        this.measuredArea = measuredArea;
    }

    public String getPredictionInsideArea() {
        return predictionInsideArea;
    }

    public void setPredictionInsideArea(String predictionInsideArea) {
        this.predictionInsideArea = predictionInsideArea;
    }

    public String getMeasuredInsideArea() {
        return measuredInsideArea;
    }

    public void setMeasuredInsideArea(String measuredInsideArea) {
        this.measuredInsideArea = measuredInsideArea;
    }

    public String getForecastPoolArea() {
        return forecastPoolArea;
    }

    public void setForecastPoolArea(String forecastPoolArea) {
        this.forecastPoolArea = forecastPoolArea;
    }

    public String getMeasuredPoolArea() {
        return measuredPoolArea;
    }

    public void setMeasuredPoolArea(String measuredPoolArea) {
        this.measuredPoolArea = measuredPoolArea;
    }

    public String getMortgage() {
        return mortgage;
    }

    public void setMortgage(String mortgage) {
        this.mortgage = mortgage;
    }

    public String getSeal() {
        return seal;
    }

    public void setSeal(String seal) {
        this.seal = seal;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }


    @Override
    public String toString() {
        return "HouseProject{" +
                "projectName='" + projectName + '\'' +
                ", Building='" + building + '\'' +
                ", room='" + room + '\'' +
                ", Planning='" + planning + '\'' +
                ", Features='" + features + '\'' +
                ", Housetype='" + houseType + '\'' +
                ", floor=" + floor +
                ", Layerheight='" + layerHeight + '\'' +
                ", Oriented='" + oriented + '\'' +
                ", structure='" + structure + '\'' +
                ", PublicBuilding=" + publicBuilding +
                ", Relocation=" + relocation +
                ", Selfuse=" + selfuse +
                ", Approvedsales=" + approvedSales +
                ", housesalespricelist='" + houseSalespricelist + '\'' +
                ", Closedbalcony=" + closedBalcony +
                ", NoClosedbalcony=" + noClosedBalcony +
                ", kitchen=" + kitchen +
                ", bathroom=" + bathroom +
                ", Forecastarea=" + forecastArea +
                ", Measuredarea=" + measuredArea +
                ", Predictioninsidearea=" + predictionInsideArea +
                ", Measuredinsidearea=" + measuredInsideArea +
                ", Forecastpoolarea=" + forecastPoolArea +
                ", Measuredpoolarea=" + measuredPoolArea +
                ", mortgage=" + mortgage +
                ", Seal=" + seal +
                ", Tips='" + tips + '\'' +
                '}';
    }
}


