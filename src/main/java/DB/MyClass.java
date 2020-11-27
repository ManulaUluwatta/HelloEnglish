/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author manul
 */
public class MyClass {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
        DBConnection db= new DBConnection();
        
//        Connection conn = DBConnection.getDBConnection().getConnection();
//        String SQL = "insert into level values(?,?)";
//        PreparedStatement stm = conn.prepareStatement(SQL);
//        stm.setObject(1, 1);
//        stm.setObject(2, "Basic");
//        int res = stm.executeUpdate();
//        if(res > 0){
//            System.out.println("DOne");
////        }
//         OutputStream output = new FileOutputStream("settings/LevelProperty.properties");
//
//            Properties prop = new Properties();
//
//            // set the properties value
//            prop.setProperty("level_id", "1");
//
//            // save properties to project root folder
//            prop.store(output, null);
//
//            System.out.println(prop);

        
    }
    
}
