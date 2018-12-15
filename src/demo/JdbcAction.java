package demo;

import java.sql.*;

public class JdbcAction {
    // 创建静态全局变量
    static Connection conn;
    static Statement statement;
    static ResultSet rs;

    public static void main(String[] args) throws SQLException {
        conn = getConnection();
        getSelect();
        insert("insert into house_list values (10,100)");
        multInsert();
        update();
        delete();
    }

    private static void multInsert() {
        for (int i = 0; i < 100; i++) {
            String sql = String.format("insert into house_list values (%1$d,%2$d)", 3 + i, 97 + i);  // 插入数据的sql语句
            System.out.println(sql);
            insert(sql);
        }
    }

    /**
     * 数据库连接
     * @return
     */
    public static Connection getConnection() {
        Connection con = null;  //创建用于连接数据库的Connection对象
        try {
            Class.forName("com.mysql.jdbc.Driver");// 加载Mysql数据驱动

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/housedb", "root", "123");// 创建数据连接
            System.out.println("数据库连接成功");

        } catch (Exception e) {
            System.out.println("数据库连接失败" + e.getMessage());
        }
        return con; //返回所建立的数据库连接
    }

    /**
     * 数据库查找
     */
    public static void getSelect() {
        try {
            String sql = "select * from house_list";    //要执行的SQL
            statement = conn.createStatement();
            rs = statement.executeQuery(sql);//创建数据对象
            System.out.println("id" + "\t" + "prices");
            while (rs.next()) {
                System.out.print(rs.getInt(1) + "\t");
                System.out.print(rs.getInt(2) + "\t");
                System.out.println();
            }
            rs.close();
            statement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 向指定数据库插入数据
     * @param sql sql命令
     */
    public static void insert(String sql) {
        conn = getConnection(); // 首先要获取连接，即连接到数据库
        try {
            System.out.println("sql=" + sql);
            statement = (Statement) conn.createStatement();    // 创建用于执行静态sql语句的Statement对象
            int count = statement.executeUpdate(sql);  // 执行插入操作的sql语句，并返回插入数据的个数

            System.out.println("向house_list表中插入 " + count + " 条数据"); //输出插入操作的处理结果

            conn.close();   //关闭数据库连接

        } catch (SQLException e) {
            System.out.println("插入数据失败" + e.getMessage());
        }
    }

    /* 更新符合要求的记录，并返回更新的记录数目*/
    public static void update() {
        conn = getConnection(); //同样先要获取连接，即连接到数据库
        try {
            String sql = "update house_list set prices=80 where id=1";// 更新数据的sql语句

            statement = conn.createStatement();    //创建用于执行静态sql语句的Statement对象，st属局部变量

            int count = statement.executeUpdate(sql);// 执行更新操作的sql语句，返回更新数据的个数

            System.out.println("video表中更新 " + count + " 条数据");      //输出更新操作的处理结果

            conn.close();   //关闭数据库连接

        } catch (SQLException e) {
            System.out.println("更新数据失败");
        }
    }

    /**
     * 对指定数据库数据进行删除
     * @throws SQLException
     */
    public static void delete() throws SQLException {
        conn = getConnection(); //同样先要获取连接，即连接到数据库
        String sql = "delete from house_list where id=2";//生成一条sql语句
        Statement stmt = null;//创建Statement对象
        stmt = conn.createStatement();
        stmt.executeUpdate(sql);//执行sql语句
        System.out.println("数据库删除成功");
        conn.close();
        System.out.println("数据库关闭成功");//关闭数据库的连接
    }
}
