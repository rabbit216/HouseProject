package com.lwj.house;

public class HouseInfo {

    //项目名称
    private String projectName;
    //楼栋
    private String building;
    //房号
    private String room;
    //规划用途
    private String planning;
    //房屋功能
    private String features;
    //房屋户型
    private String houseType;
    //所在楼层
    private String floor;
    //层高
    private String layerHeight;
    //房屋朝向
    private String oriented;
    //房屋结构
    private String structure;
    //是否公建配套
    private String publicBuilding;
    //是否回迁
    private String relocation;
    //是否自用
    private String selfuse;
    //批准销售状态
    private String approvedSales;
    //商品房销售价目表
    private String houseSalespricelist;
    //封闭阳台
    private String closedBalcony;
    //非封闭阳台
    private String noClosedBalcony;
    //厨房
    private String kitchen;
    //卫生间
    private String bathroom;
    //预测总面积
    private String forecastArea;
    //实测面积
    private String measuredArea;
    //预测套内面积
    private String predictionInsideArea;
    //实测套内面积
    private String measuredInsideArea;
    //预测公摊面积
    private String forecastPoolArea;
    //实测公摊面积
    private String measuredPoolArea;
    //是否抵押
    private String mortgage;
    //是否查封
    private String seal;
    //温馨提示
    private String tips;

    public HouseInfo(String projectname, String building, String room, String planning, String features, String housetype, String floor, String layerheight, String oriented, String structure, String publicBuilding, String relocation, String selfuse, String approvedsales, String housesalespricelist, String closedbalcony, String noClosedbalcony, String kitchen, String bathroom, String forecastarea, String measuredarea, String predictioninsidearea, String measuredinsidearea, String forecastpoolarea, String measuredpoolarea, String mortgage, String seal, String tips) {
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

    public HouseInfo() {
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
        return "HouseInfo{" +
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


