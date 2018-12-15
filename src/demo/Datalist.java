package demo;

import java.util.ArrayList;

public class Datalist {
    //项目名称
    private String projectName;
    //楼栋
    private String building;
    private  String room;

    public Datalist(String projectName, String building, String room) {
        this.projectName = projectName;
        this.building = building;
        this.room = room;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
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
    @Override
    public String toString() {
        return "Datalist{" +
                "projectName='" + projectName + '\'' +
                ", building='" + building + '\'' +
                ", room='" + room + '\'' +
                '}';
    }
}
