package com.lwj.house;

public class HouseProject {
    String projectname;
    String Building;
    String room;
    String Planning;
    String Features;
    String Housetype;
    String floor;
    String Layerheight;
    String Oriented;
    String structure;
    String PublicBuilding;
    String Relocation;
    String Selfuse;
    String Approvedsales;
    String housesalespricelist;
    String Closedbalcony;
    String NoClosedbalcony;
    String kitchen;
    String bathroom;
    String Forecastarea;
    String Measuredarea;
    String Predictioninsidearea;
    String Measuredinsidearea;
    String Forecastpoolarea;
    String Measuredpoolarea;
    String mortgage;
    String Seal;
    String Tips;

    public HouseProject(String projectname, String building, String room, String planning, String features, String housetype, String floor, String layerheight, String oriented, String structure, String publicBuilding, String relocation, String selfuse, String approvedsales, String housesalespricelist, String closedbalcony, String noClosedbalcony, String kitchen, String bathroom, String forecastarea, String measuredarea, String predictioninsidearea, String measuredinsidearea, String forecastpoolarea, String measuredpoolarea, String mortgage, String seal, String tips) {
        this.projectname = projectname;
        Building = building;
        this.room = room;
        Planning = planning;
        Features = features;
        Housetype = housetype;
        this.floor = floor;
        Layerheight = layerheight;
        Oriented = oriented;
        this.structure = structure;
        PublicBuilding = publicBuilding;
        Relocation = relocation;
        Selfuse = selfuse;
        Approvedsales = approvedsales;
        this.housesalespricelist = housesalespricelist;
        Closedbalcony = closedbalcony;
        NoClosedbalcony = noClosedbalcony;
        this.kitchen = kitchen;
        this.bathroom = bathroom;
        Forecastarea = forecastarea;
        Measuredarea = measuredarea;
        Predictioninsidearea = predictioninsidearea;
        Measuredinsidearea = measuredinsidearea;
        Forecastpoolarea = forecastpoolarea;
        Measuredpoolarea = measuredpoolarea;
        this.mortgage = mortgage;
        Seal = seal;
        Tips = tips;
    }

    public HouseProject() {

    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getBuilding() {
        return Building;
    }

    public void setBuilding(String building) {
        Building = building;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getPlanning() {
        return Planning;
    }

    public void setPlanning(String planning) {
        Planning = planning;
    }

    public String getFeatures() {
        return Features;
    }

    public void setFeatures(String features) {
        Features = features;
    }

    public String getHousetype() {
        return Housetype;
    }

    public void setHousetype(String housetype) {
        Housetype = housetype;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getLayerheight() {
        return Layerheight;
    }

    public void setLayerheight(String layerheight) {
        Layerheight = layerheight;
    }

    public String getOriented() {
        return Oriented;
    }

    public void setOriented(String oriented) {
        Oriented = oriented;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String isPublicBuilding() {
        return PublicBuilding;
    }

    public void setPublicBuilding(String publicBuilding) {
        PublicBuilding = publicBuilding;
    }

    public String isRelocation() {
        return Relocation;
    }

    public void setRelocation(String relocation) {
        Relocation = relocation;
    }

    public String isSelfuse() {
        return Selfuse;
    }

    public void setSelfuse(String selfuse) {
        Selfuse = selfuse;
    }

    public String isApprovedsales() {
        return Approvedsales;
    }

    public void setApprovedsales(String approvedsales) {
        Approvedsales = approvedsales;
    }

    public String getHousesalespricelist() {
        return housesalespricelist;
    }

    public void setHousesalespricelist(String housesalespricelist) {
        this.housesalespricelist = housesalespricelist;
    }

    public String getClosedbalcony() {
        return Closedbalcony;
    }

    public void setClosedbalcony(String closedbalcony) {
        Closedbalcony = closedbalcony;
    }

    public String getNoClosedbalcony() {
        return NoClosedbalcony;
    }

    public void setNoClosedbalcony(String noClosedbalcony) {
        NoClosedbalcony = noClosedbalcony;
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

    public String getForecastarea() {
        return Forecastarea;
    }

    public void setForecastarea(String forecastarea) {
        Forecastarea = forecastarea;
    }

    public String getMeasuredarea() {
        return Measuredarea;
    }

    public void setMeasuredarea(String measuredarea) {
        Measuredarea = measuredarea;
    }

    public String getPredictioninsidearea() {
        return Predictioninsidearea;
    }

    public void setPredictioninsidearea(String predictioninsidearea) {
        Predictioninsidearea = predictioninsidearea;
    }

    public String getMeasuredinsidearea() {
        return Measuredinsidearea;
    }

    public void setMeasuredinsidearea(String measuredinsidearea) {
        Measuredinsidearea = measuredinsidearea;
    }

    public String getForecastpoolarea() {
        return Forecastpoolarea;
    }

    public void setForecastpoolarea(String forecastpoolarea) {
        Forecastpoolarea = forecastpoolarea;
    }

    public String getMeasuredpoolarea() {
        return Measuredpoolarea;
    }

    public void setMeasuredpoolarea(String measuredpoolarea) {
        Measuredpoolarea = measuredpoolarea;
    }

    public String isMortgage() {
        return mortgage;
    }

    public void setMortgage(String mortgage) {
        this.mortgage = mortgage;
    }

    public String isSeal() {
        return Seal;
    }

    public void setSeal(String seal) {
        Seal = seal;
    }

    public String getTips() {
        return Tips;
    }

    public void setTips(String tips) {
        Tips = tips;
    }

    @Override
    public String toString() {
        return "HouseProject{" +
                "projectname='" + projectname + '\'' +
                ", Building='" + Building + '\'' +
                ", room='" + room + '\'' +
                ", Planning='" + Planning + '\'' +
                ", Features='" + Features + '\'' +
                ", Housetype='" + Housetype + '\'' +
                ", floor=" + floor +
                ", Layerheight='" + Layerheight + '\'' +
                ", Oriented='" + Oriented + '\'' +
                ", structure='" + structure + '\'' +
                ", PublicBuilding=" + PublicBuilding +
                ", Relocation=" + Relocation +
                ", Selfuse=" + Selfuse +
                ", Approvedsales=" + Approvedsales +
                ", housesalespricelist='" + housesalespricelist + '\'' +
                ", Closedbalcony=" + Closedbalcony +
                ", NoClosedbalcony=" + NoClosedbalcony +
                ", kitchen=" + kitchen +
                ", bathroom=" + bathroom +
                ", Forecastarea=" + Forecastarea +
                ", Measuredarea=" + Measuredarea +
                ", Predictioninsidearea=" + Predictioninsidearea +
                ", Measuredinsidearea=" + Measuredinsidearea +
                ", Forecastpoolarea=" + Forecastpoolarea +
                ", Measuredpoolarea=" + Measuredpoolarea +
                ", mortgage=" + mortgage +
                ", Seal=" + Seal +
                ", Tips='" + Tips + '\'' +
                '}';
    }
}
