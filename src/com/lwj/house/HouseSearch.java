package com.lwj.house;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.sql.SQLException;

public class HouseSearch {
    public static void main(String[] args) throws SQLException, IOException {
        HouseProject houseProject = new HouseProject();

        //String url = "http://61.142.120.214:9000/web/House.jsp?id=386432&lcStr=0";
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
            for (int j = 0; j < ths.size(); j++) {
                String text = ths.get(j).text();
                if (i == 1 && j == 0) {
                    houseProject.projectname = text;
                    System.out.println("项目名称：" + text);
                }
                if (i == 1 && j == 1) {
                    houseProject.Building = text;
                    System.out.println("楼栋：" + text);
                }
                if (i == 2 && j == 0) {
                    houseProject.room = text;
                    System.out.println("房号：" + text);
                }
                if (i == 2 && j == 1) {
                    houseProject.Planning = text;
                    System.out.println("规划用途：" + text);
                }
                if (i == 3 && j == 0) {
                    houseProject.Features = text;
                    System.out.println("房屋功能：" + text);
                }
                if (i == 3 && j == 1) {
                    houseProject.Housetype = text;
                    System.out.println("房屋户型：" + text);
                }
                if (i == 4 && j == 0) {
                    houseProject.floor = text;
                    System.out.println("所在楼层：" + text);
                }
                if (i == 4 && j == 1) {
                    houseProject.Layerheight = text;
                    System.out.println("层高：" + text);
                }
                if (i == 5 && j == 0) {
                    houseProject.Oriented = text;
                    System.out.println("房屋朝向：" + text);
                }
                if (i == 5 && j == 1) {
                    houseProject.structure = text;
                    System.out.println("房屋结构：" + text);
                }
                if (i == 6 && j == 0) {
                    houseProject.PublicBuilding = text;
                    System.out.println("是否公建配套：" + text);
                }
                if (i == 6 && j == 1) {
                    houseProject.Relocation = text;
                    System.out.println("是否回迁：" + text);
                }
                if (i == 7 && j == 0) {
                    houseProject.Selfuse = text;
                    System.out.println("是否自用：" + text);
                }
                if (i == 7 && j == 1) {
                    houseProject.Approvedsales = text;
                    System.out.println("批准销售状态：" + text);
                }
                if (i == 8 && j == 0) {
                    houseProject.housesalespricelist = text;
                    System.out.println("商品房销售价目表(经物价部门监制）：" + text);
                }
                if (i == 10 && j == 0) {
                    houseProject.Closedbalcony = text;
                    System.out.println("封闭阳台：" + text);
                }
                if (i == 10 && j == 1) {
                    houseProject.NoClosedbalcony = text;
                    System.out.println("非封闭阳台：" + text);
                }
                if (i == 11 && j == 0) {
                    houseProject.kitchen = text;
                    System.out.println("厨房：" + text);
                }
                if (i == 11 && j == 1) {
                    houseProject.bathroom = text;
                    System.out.println("卫生间：" + text);
                }
                if (i == 12 && j == 0) {
                    System.out.println(text);
                }
                if (i == 13 && j == 0) {
                    houseProject.Forecastarea = text;
                    System.out.println("预测总面积：" + text);
                }
                if (i == 13 && j == 1) {
                    houseProject.Measuredarea = text;
                    System.out.println("实测面积：" + text);
                }
                if (i == 14 && j == 0) {
                    houseProject.Predictioninsidearea = text;
                    System.out.println("预测套内面积：" + text);
                }
                if (i == 14 && j == 1) {
                    houseProject.Measuredinsidearea = text;
                    System.out.println("实测套内面积：" + text);
                }
                if (i == 15 && j == 0) {
                    houseProject.Forecastpoolarea = text;
                    System.out.println("预测公摊面积：" + text);
                }
                if (i == 15 && j == 1) {
                    houseProject.Measuredpoolarea = text;
                    System.out.println("实测公摊面积：" + text);
                }
                if (i == 16 && j == 0) {
                    System.out.println(text);
                }
                if (i == 17 && j == 0) {
                    houseProject.mortgage = text;
                    System.out.println("是否抵押：" + text);
                }
                if (i == 17 && j == 1) {
                    houseProject.Seal = text;
                    System.out.println("是否查封：" + text);
                }
                if (i == 18 && j == 0) {
                    System.out.println(text);
                }
                if (i == 19 && j == 0) {
                    houseProject.Tips=text;
                    System.out.println(text);
                }
            }
        }
        System.out.println(houseProject);
    }
}

