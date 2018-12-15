package demo;

import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class HouseToMysql {
    static Connection conn;
    static Statement st;

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("美悦湾");
        arrayList.add("4栋");
        arrayList.add("2018/11/23");
      //  InsertProduct(arrayList);
        insert("house_list","(name)","('大亚湾')");
}
    public static Connection getConnection() {
        Connection con = null;  //创建用于连接数据库的Connection对象
        try {
            Class.forName("com.mysql.jdbc.Driver");// 加载Mysql数据驱动
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/housedb", "root", "mysql");// 创建数据连接
            System.out.println("数据库连接成功");

        } catch (Exception e) {
            System.out.println("数据库连接失败" + e.getMessage());
        }
        return con; //返回所建立的数据库连接
    }

    /**
     * 向指定数据库插入数据
     * @param tableName  表名
     * @param key  列表
     * @param values 内容
     */
    public static void insert(String tableName,String key,String values) {
        conn = getConnection(); // 首先要获取连接，即连接到数据库
       String sql="insert into "+tableName +key+"values"+ values;
        try {
            System.out.println("sql=" + sql);
            Statement statement = (Statement) conn.createStatement();    // 创建用于执行静态sql语句的Statement对象
            int count = statement.executeUpdate(sql);  // 执行插入操作的sql语句，并返回插入数据的个数
            System.out.println("向"+tableName+"表中插入" + count + "条数据成功"); //输出插入操作的处理结果
            conn.close();   //关闭数据库连接
        } catch (SQLException e) {
            System.out.println("插入数据失败" + e.getMessage());
        }
    }


}
