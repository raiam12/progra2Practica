/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.conexiones;

import com.uia.is12.domain.Verse;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class mySQLDB {
    static final String JBCD ="com.mysql.jdbc.Driver";
    static final String DB_URL ="jdbc:mysql://localhost:3306/progra2";
    ArrayList<Verse> verse = new ArrayList<Verse>();
    static final String USER ="root";
    static final String PASS ="root";
    Connection con = null;
    CallableStatement stat = null;
    Statement stmt;
    
    public ResultSet executeQuery(String sql) throws SQLException{
        con = DriverManager.getConnection(DB_URL, USER, PASS);
        stat = con.prepareCall(sql);
        ResultSet res = stat.executeQuery();
        return res;
    }
    public void closeexecuteQuery() throws SQLException{
        con.close();
        stat.close();
    }
    
    public void closeExecute() throws SQLException{
        con.close();
        stmt.close();
    }
    public void execute(String sql) throws SQLException{
        con = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = con.createStatement();
        stmt.execute(sql);
    }
}
