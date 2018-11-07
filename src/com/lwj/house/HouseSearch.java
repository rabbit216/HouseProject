package com.lwj.house;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.sql.SQLException;

public class HouseSearch {
    public static void main(String[] args) throws SQLException, IOException {
        HouseProject houseProject = new HouseProject();
        Document document = Jsoup.connect(
                "http://61.142.120.214:9000/web/House.jsp?id=386432&lcStr=0"
        ).get();
        Elements trs = document.select("table").select("tr");
        for (int i = 0; i < trs.size(); i++) {
            Elements tds = trs.get(i).select("th");
            for (int j = 0; j < tds.size(); j++) {
                String text = tds.get(j).text();
            }
            Elements ths = trs.get(i).select("td");
            getHouseProject(houseProject, i, ths);
        }
        System.out.println(houseProject);
    }

    private static void getHouseProject(HouseProject houseProject, int i, Elements ths) {
        for (int j = 0; j < ths.size(); j++) {
            String text = ths.get(j).text();
            if (i == 1 && j == 0) {
                houseProject.setProjectName(text);
                System.out.println("项目名称：" + text);
            } else if (i == 1 && j == 1) {
                houseProject.setBuilding(text);
                System.out.println("楼栋：" + text);
            } else if (i == 2 && j == 0) {
                houseProject.setRoom(text);
                System.out.println("房号：" + text);
            } else if (i == 2 && j == 1) {
                houseProject.setPlanning(text);
                System.out.println("规划用途：" + text);
            } else if (i == 3 && j == 0) {
                houseProject.setFeatures(text);
                System.out.println("房屋功能：" + text);
            } else if (i == 3 && j == 1) {
                houseProject.setHouseType(text);
                System.out.println("房屋户型：" + text);
            } else if (i == 4 && j == 0) {
                houseProject.setFloor(text);
                System.out.println("所在楼层：" + text);
            } else if (i == 4 && j == 1) {
                houseProject.setLayerHeight(text);
                System.out.println("层高：" + text);
            } else if (i == 5 && j == 0) {
                houseProject.setOriented(text);
                System.out.println("房屋朝向：" + text);
            } else if (i == 5 && j == 1) {
                houseProject.setStructure(text);
                System.out.println("房屋结构：" + text);
            } else if (i == 6 && j == 0) {
                houseProject.setPublicBuilding(text);
                System.out.println("是否公建配套：" + text);
            } else if (i == 6 && j == 1) {
                houseProject.setRelocation(text);
                System.out.println("是否回迁：" + text);
            } else if (i == 7 && j == 0) {
                houseProject.setSelfuse(text);
                System.out.println("是否自用：" + text);
            } else if (i == 7 && j == 1) {
                houseProject.setApprovedSales(text);
                System.out.println("批准销售状态：" + text);
            } else if (i == 8 && j == 0) {
                houseProject.setHouseSalespricelist(text);
                System.out.println("商品房销售价目表(经物价部门监制）：" + text);
            } else if (i == 10 && j == 0) {
                houseProject.setClosedBalcony(text);
                System.out.println("封闭阳台：" + text);
            } else if (i == 10 && j == 1) {
                houseProject.setNoClosedBalcony(text);
                System.out.println("非封闭阳台：" + text);
            } else if (i == 11 && j == 0) {
                houseProject.setKitchen(text);
                System.out.println("厨房：" + text);
            } else if (i == 11 && j == 1) {
                houseProject.setBathroom(text);
                System.out.println("卫生间：" + text);
            } else if (i == 12 && j == 0) {
                System.out.println(text);
            } else if (i == 13 && j == 0) {
                houseProject.setForecastArea(text);
                System.out.println("预测总面积：" + text);
            } else if (i == 13 && j == 1) {
                houseProject.setMeasuredArea(text);
                System.out.println("实测面积：" + text);
            } else if (i == 14 && j == 0) {
                houseProject.setPredictionInsideArea(text);
                System.out.println("预测套内面积：" + text);
            } else if (i == 14 && j == 1) {
                houseProject.setMeasuredInsideArea(text);
                System.out.println("实测套内面积：" + text);
            } else if (i == 15 && j == 0) {
                houseProject.setForecastPoolArea(text);
                System.out.println("预测公摊面积：" + text);
            } else if (i == 15 && j == 1) {
                houseProject.setMeasuredPoolArea(text);
                System.out.println("实测公摊面积：" + text);
            } else if (i == 16 && j == 0) {
                System.out.println(text);
            } else if (i == 17 && j == 0) {
                houseProject.setMortgage(text);
                System.out.println("是否抵押：" + text);
            } else if (i == 17 && j == 1) {
                houseProject.setSeal(text);
                System.out.println("是否查封：" + text);
            } else if (i == 18 && j == 0) {
                System.out.println(text);
            } else {
                houseProject.setTips(text);
                System.out.println(text);
            }
        }
    }
}

