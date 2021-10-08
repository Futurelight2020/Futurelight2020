import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @AUTHOR FutureLight
 * @DATE 2021/6/10 - 22:17 - 2021
 */
public class Conn {     //创建类Conn
    Connection con;     //声明Connection对象
    public Connection getConnection() {     //建立返回值为Connection的方法
        try {   //加载数据库驱动类
            Class.forName("com.mysql.jdbc.driver");
            System.out.println("数据库驱动加载成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {   //通过访问数据库的URL，获取数据库连接对象
            con = DriverManager.getConnection("jdbc:mysql:" + "//127.0.0.1/test", "root", "123456");
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {    //主方法
        Conn c = new Conn();    //创建本类对象
        c.getConnection();      //调用连接数据库的方法
        System.out.println("ok");
    }
}
