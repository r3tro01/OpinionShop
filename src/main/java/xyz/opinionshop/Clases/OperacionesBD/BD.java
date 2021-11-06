package xyz.opinionshop.Clases.OperacionesBD;
import java.sql.*;

public class BD {
    protected static Connection Conexion = null;
    protected static PreparedStatement Consulta;
    protected static ResultSet RS = null;
    private static final String base = "java";
    private static final String user = "admin";
    private static final String password = "Thelifework01$";
    private static final String url = "jdbc:mysql://portfolio.czgafo92x7sm.us-east-2.rds.amazonaws.com:3306/" + base + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
   public static Connection Conectar() throws SQLException, ClassNotFoundException {
      if (Conexion == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Conexion = DriverManager.getConnection(url, user, password);
      }
      return Conexion;
   }
   
   public static void Desconectar() throws SQLException {
      if (Conexion != null) {
         Conexion = null;
      }
   }

}
