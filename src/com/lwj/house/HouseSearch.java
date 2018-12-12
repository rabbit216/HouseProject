package com.lwj.house;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class HouseSearch {
    final static String url3_1 = "http://61.142.120.214:9000/web/salestable.jsp?buildingcode=DYW0044600101&projectcode=DYW00446001";
    //   final static String url4_1 = "http://61.142.120.214:9000/web/House.jsp?id=386432&lcStr=0";
    final static String url4Head = "http://61.142.120.214:9000/web/House.jsp?";

    public static void main(String[] args) throws IOException {
        ArrayList<String> url4List = getUrl4List(url3_1);
        for (int i = 0; i < url4List.size(); i++) {
            String url4 = url4List.get(i);
            Document document = getDocument(url4);
            HouseInfo houseInfo = changeDoumentToHouse(document);
            inserHouseInfoToMysql(houseInfo);
        }
    }

    /**
     * 传入第三层的链接得到一个第四层链接的集合
     *
     * @param url3
     * @return
     * @throws IOException
     */
    public static ArrayList<String> getUrl4List(String url3) throws IOException {
        Document doc = Jsoup.connect(url3).get();
        Elements divs = doc.select("div[style=cursor:hand]");
        Iterator<Element> iterator = divs.iterator();
        ArrayList<String> urlList = new ArrayList<>();
        while (iterator.hasNext()) {
            Element element = iterator.next();
            String onclick = element.attr("onclick");
            String url = getURL(onclick);
            urlList.add(url);
            //System.out.println(url);
        }
        return urlList;

    }

    /**
     * 传入一个String对它进行截取和拼接得到一个第四层链接
     *
     * @param string
     * @return
     */
    public static String getURL(String string) {
        String first = string.substring(13, 19);
        String end = string.substring(20, 21);
        String id = "id=" + first;
        String ends = "&lcStr=" + end;
        return url4Head + id + ends;
    }

    /**
     * 传入一个HouseInfo对象将其插入到数据库
     *
     * @param houseInfo
     */
    public static void inserHouseInfoToMysql(HouseInfo houseInfo) {
        System.out.println(houseInfo);
        Connection conn = getConnection(); // 首先要获取连接，即连接到数据库
        String projectName = houseInfo.getProjectName();
        String building = houseInfo.getBuilding();
        String room = houseInfo.getRoom();
        String price=houseInfo.getHouseSalespricelist();
        String houseArea=houseInfo.getPredictionInsideArea();
        String sql = "insert into house_list(projectName,building,room,price,houseArea) values(" + "'" + projectName + "'" + ","
                + "'" + building + "'" + "," + "'" + room + "'" +","+"'"+price+"'"+ ","+"'"+houseArea+"'"+")";
        try {
            System.out.println("sql=" + sql);
            Statement statement = (Statement) conn.createStatement();    // 创建用于执行静态sql语句的Statement对象
            int count = statement.executeUpdate(sql);  // 执行插入操作的sql语句，并返回插入数据的个数
            System.out.println("向表中插入" + count + "条数据成功"); //输出插入操作的处理结果
            conn.close();   //关闭数据库连接
        } catch (SQLException e) {
            System.out.println("插入数据失败" + e.getMessage());
        }
    }

    /**
     * 访问URL并获取Document
     *
     * @param url
     * @return Document
     * @throws IOException
     */
    private static Document getDocument(String url) throws IOException {
        System.out.println(url);
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
                String text = ths.get(j).text().replaceAll(" ", "");
                if (i == 1 && j == 0) {
                    houseInfo.setProjectName(text);
                    //System.out.println("项目名称：" + text);
                } else if (i == 1 && j == 1) {
                    houseInfo.setBuilding(text);
                    //System.out.println("楼栋：" + text);
                } else if (i == 2 && j == 0) {
                    houseInfo.setRoom(text);
                    //System.out.println("房号：" + text);
                } else if (i == 2 && j == 1) {
                    houseInfo.setPlanning(text);
                    //System.out.println("规划用途：" + text);
                } else if (i == 3 && j == 0) {
                    houseInfo.setFeatures(text);
                    //System.out.println("房屋功能：" + text);
                } else if (i == 3 && j == 1) {
                    houseInfo.setHouseType(text);
                    //System.out.println("房屋户型：" + text);
                } else if (i == 4 && j == 0) {
                    houseInfo.setFloor(text);
                    //System.out.println("所在楼层：" + text);
                } else if (i == 4 && j == 1) {
                    houseInfo.setLayerHeight(text);
                    //System.out.println("层高：" + text);
                } else if (i == 5 && j == 0) {
                    houseInfo.setOriented(text);
                    //System.out.println("房屋朝向：" + text);
                } else if (i == 5 && j == 1) {
                    houseInfo.setStructure(text);
                    //System.out.println("房屋结构：" + text);
                } else if (i == 6 && j == 0) {
                    houseInfo.setPublicBuilding(text);
                    //System.out.println("是否公建配套：" + text);
                } else if (i == 6 && j == 1) {
                    houseInfo.setRelocation(text);
                    //System.out.println("是否回迁：" + text);
                } else if (i == 7 && j == 0) {
                    houseInfo.setSelfuse(text);
                    //System.out.println("是否自用：" + text);
                } else if (i == 7 && j == 1) {
                    houseInfo.setApprovedSales(text);
                    //System.out.println("批准销售状态：" + text);
                } else if (i == 8 && j == 0) {
                    houseInfo.setHouseSalespricelist(text);
                    //System.out.println("商品房销售价目表(经物价部门监制）：" + text);
                } else if (i == 10 && j == 0) {
                    houseInfo.setClosedBalcony(text);
                    //System.out.println("封闭阳台：" + text);
                } else if (i == 10 && j == 1) {
                    houseInfo.setNoClosedBalcony(text);
                    //System.out.println("非封闭阳台：" + text);
                } else if (i == 11 && j == 0) {
                    houseInfo.setKitchen(text);
                    //System.out.println("厨房：" + text);
                } else if (i == 11 && j == 1) {
                    houseInfo.setBathroom(text);
                    //System.out.println("卫生间：" + text);
                } else if (i == 12 && j == 0) {
                    //System.out.println(text);
                } else if (i == 13 && j == 0) {
                    houseInfo.setForecastArea(text);
                    //System.out.println("预测总面积：" + text);
                } else if (i == 13 && j == 1) {
                    houseInfo.setMeasuredArea(text);
                    //System.out.println("实测面积：" + text);
                } else if (i == 14 && j == 0) {
                    houseInfo.setPredictionInsideArea(text);
                    //System.out.println("预测套内面积：" + text);
                } else if (i == 14 && j == 1) {
                    houseInfo.setMeasuredInsideArea(text);
                    //System.out.println("实测套内面积：" + text);
                } else if (i == 15 && j == 0) {
                    houseInfo.setForecastPoolArea(text);
                    //System.out.println("预测公摊面积：" + text);
                } else if (i == 15 && j == 1) {
                    houseInfo.setMeasuredPoolArea(text);
                    //System.out.println("实测公摊面积：" + text);
                } else if (i == 16 && j == 0) {
                    //System.out.println(text);
                } else if (i == 17 && j == 0) {
                    houseInfo.setMortgage(text);
                    //System.out.println("是否抵押：" + text);
                } else if (i == 17 && j == 1) {
                    houseInfo.setSeal(text);
                    //System.out.println("是否查封：" + text);
                } else if (i == 18 && j == 0) {
                    //System.out.println(text);
                } else {
                    houseInfo.setTips(text);
                    //System.out.println(text);
                }
            }
        }
        return houseInfo;
    }

    /**
     * 数据库连接
     *
     * @return
     */
    public static Connection getConnection() {
        Connection con = null;  //创建用于连接数据库的Connection对象
        try {
            Class.forName("com.mysql.jdbc.Driver");// 加载Mysql数据驱动
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/housedb", "root", "mysql");// 创建数据连接
            //System.out.println("数据库连接成功");

        } catch (Exception e) {
            //System.out.println("数据库连接失败" + e.getMessage());
        }
        return con; //返回所建立的数据库连接
    }
}

