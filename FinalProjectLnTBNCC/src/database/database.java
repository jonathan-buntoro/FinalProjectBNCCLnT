package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database { 
 public static Connection connect() {
  Connection connection = null;
  try {
   Class.forName("com.mysql.cj.jdbc.Driver");
   connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bobacool_database?useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
  } catch (ClassNotFoundException e) {
   e.printStackTrace();
  } catch (SQLException e) {
   e.printStackTrace();
  }
  return connection;
 }
}