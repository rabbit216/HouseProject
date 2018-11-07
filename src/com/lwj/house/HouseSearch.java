package com.lwj.house;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.sql.SQLException;

public class HouseSearch {
    final static String url = "http://61.142.120.214:9000/web/House.jsp?id=386432&lcStr=0";

    public static void main(String[] args) throws SQLException, IOException {
        Document document = getDocument(url);
        HouseInfo houseInfo = changeDoumentToHouse(document);
        System.out.println(houseInfo);
    }

    /**
     * 访问URL并获取Document
     *
     * @param url
     * @return Document
     * @throws IOException
     */
    private static Document getDocument(String url) throws IOException {
        return Jsoup.connect(url).get();
    }

    /**
     * Document封装成HouseInfo对象
     *
     * @param document
     * @return
     */
    private static HouseInfo changeDoumentToHouse(Document document) {
        HouseInfo houseInfo = new HouseInfo();
        Elements trs = document.select("table").select("tr");
        for (int i = 0; i < trs.size(); i++) {
            Elements ths = trs.get(i).select("td");
            for (int j = 0; j < ths.size(); j++) {
                String text = ths.get(j).text();
                if (i == 1 && j == 0) {
                    houseInfo.setProjectName(text);
                    System.out.println("项目名称：" + text);
                } else if (i == 1 && j == 1) {
                    houseInfo.setBuilding(text);
                    System.out.println("楼栋：" + text);
                } else if (i == 2 && j == 0) {
                    houseInfo.setRoom(text);
                    System.out.println("房号：" + text);
                } else if (i == 2 && j == 1) {
                    houseInfo.setPlanning(text);
                    System.out.println("规划用途：" + text);
                } else if (i == 3 && j == 0) {
                    houseInfo.setFeatures(text);
                    System.out.println("房屋功能：" + text);
                } else if (i == 3 && j == 1) {
                    houseInfo.setHouseType(text);
                    System.out.println("房屋户型：" + text);
                } else if (i == 4 && j == 0) {
                    houseInfo.setFloor(text);
                    System.out.println("所在楼层：" + text);
                } else if (i == 4 && j == 1) {
                    houseInfo.setLayerHeight(text);
                    System.out.println("层高：" + text);
                } else if (i == 5 && j == 0) {
                    houseInfo.setOriented(text);
                    System.out.println("房屋朝向：" + text);
                } else if (i == 5 && j == 1) {
                    houseInfo.setStructure(text);
                    System.out.println("房屋结构：" + text);
                } else if (i == 6 && j == 0) {
                    houseInfo.setPublicBuilding(text);
                    System.out.println("是否公建配套：" + text);
                } else if (i == 6 && j == 1) {
                    houseInfo.setRelocation(text);
                    System.out.println("是否回迁：" + text);
                } else if (i == 7 && j == 0) {
                    houseInfo.setSelfuse(text);
                    System.out.println("是否自用：" + text);
                } else if (i == 7 && j == 1) {
                    houseInfo.setApprovedSales(text);
                    System.out.println("批准销售状态：" + text);
                } else if (i == 8 && j == 0) {
                    houseInfo.setHouseSalespricelist(text);
                    System.out.println("商品房销售价目表(经物价部门监制）：" + text);
                } else if (i == 10 && j == 0) {
                    houseInfo.setClosedBalcony(text);
                    System.out.println("封闭阳台：" + text);
                } else if (i == 10 && j == 1) {
                    houseInfo.setNoClosedBalcony(text);
                    System.out.println("非封闭阳台：" + text);
                } else if (i == 11 && j == 0) {
                    houseInfo.setKitchen(text);
                    System.out.println("厨房：" + text);
                } else if (i == 11 && j == 1) {
                    houseInfo.setBathroom(text);
                    System.out.println("卫生间：" + text);
                } else if (i == 12 && j == 0) {
                    System.out.println(text);
                } else if (i == 13 && j == 0) {
                    houseInfo.setForecastArea(text);
                    System.out.println("预测总面积：" + text);
                } else if (i == 13 && j == 1) {
                    houseInfo.setMeasuredArea(text);
                    System.out.println("实测面积：" + text);
                } else if (i == 14 && j == 0) {
                    houseInfo.setPredictionInsideArea(text);
                    System.out.println("预测套内面积：" + text);
                } else if (i == 14 && j == 1) {
                    houseInfo.setMeasuredInsideArea(text);
                    System.out.println("实测套内面积：" + text);
                } else if (i == 15 && j == 0) {
                    houseInfo.setForecastPoolArea(text);
                    System.out.println("预测公摊面积：" + text);
                } else if (i == 15 && j == 1) {
                    houseInfo.setMeasuredPoolArea(text);
                    System.out.println("实测公摊面积：" + text);
                } else if (i == 16 && j == 0) {
                    System.out.println(text);
                } else if (i == 17 && j == 0) {
                    houseInfo.setMortgage(text);
                    System.out.println("是否抵押：" + text);
                } else if (i == 17 && j == 1) {
                    houseInfo.setSeal(text);
                    System.out.println("是否查封：" + text);
                } else if (i == 18 && j == 0) {
                    System.out.println(text);
                } else {
                    houseInfo.setTips(text);
                    System.out.println(text);
                }
            }
        }
        return houseInfo;
    }


}

