package com.lwj.house;

import java.util.ArrayList;

public class Datalist {
    //项目名称
    private String projectName;
    //楼栋
    private String building;
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

    public Datalist(String projectName, String building) {
        this.projectName = projectName;
        this.building = building;
    }

    @Override
    public String toString() {
        return "Datalist{" +
                "projectName='" + projectName + '\'' +
                ", building='" + building + '\'' +
                '}';
    }
}
