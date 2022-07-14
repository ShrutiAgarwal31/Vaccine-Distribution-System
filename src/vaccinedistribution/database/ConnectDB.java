
package vaccinedistribution.database;

import java.sql.*;

public class ConnectDB {
    private static final String url = "jdbc:postgresql://164.52.193.222:5432/JavaFx";
    private static final String user = "Avitech";
    private static final String password = "9323211633459";
    public static Connection conn =null;
    
    public static Connection createConnection(){
        try{
            conn =DriverManager.getConnection(url,user,password);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}
