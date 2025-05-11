
//package pharmacymanagementsystem;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
///**
// *
// * @author WINDOWS 10
// */
//public class database {
//
//    public static Connection connectDb(){
//
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//
//            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/pharmacy", "root", ""); // root is the default username while "" or empty is for the pass
//            return connect;
//        }catch(Exception e){e.printStackTrace();}
//        return null;
//    }
//
//}
package pharmacymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class database {
    // إضافة متغير static للنسخة الوحيدة
    private static database instance;
    private static Connection connection;

    // جعل Constructor خاص
    private database() {}

    // إضافة method للحصول على النسخة الوحيدة
    public static synchronized database getInstance() {
        if (instance == null) {
            instance = new database();
        }
        return instance;
    }

    public static Connection connectDb() {
        try {
            if (connection == null) {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/pharmacy",
                    "root",
                    ""
                );
            }
            return connection;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                connection = null;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}