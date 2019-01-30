/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rup.lab;

/**
 *
 * @author Mahe
 */

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import oracle.jdbc.pool.OracleDataSource;
import oracle.jdbc.OracleConnection;
import java.sql.DatabaseMetaData;

public class connect {
     // TODO Auto-generated method stub
     public static void main(String[] args) {
    
    try {
        Connection con = (Connection)DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system", "qwerty123");
        Statement stmt=(Statement) con.createStatement();
        String query="select * from booking ";
        ResultSet rs=stmt.executeQuery(query);
        while(rs.next())
        {
            System.out.println(rs.getString(1)+" "+rs.getString(2));
        }
        
        con.close();
    } catch (SQLException e) {
        System.out.println("Connection Failed! Check output console");
        
    }
    

}
}

