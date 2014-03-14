/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uia.is12.data;

import com.uia.is12.conexiones.mySQLDB;
import com.uia.is12.domain.Song;
import com.uia.is12.domain.Verse;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class SongDAO {
    private final mySQLDB conector = new mySQLDB();
    public SongDAO() {
    }
    
    public Song getSong() throws SQLException{
        
        Song cancion = new Song();
        ArrayList<Verse> verse = new ArrayList();
        //verse = conector.executeQuery("SELECT * FROM verse");
        cancion.setVerse(verse);
        return cancion;
    }
    
    public void addVerse(Song poem) throws SQLException{
        String sql = "INSERT INTO poem values('"+poem.getID()+"','"+poem.getName()+"')";
        conector.execute(sql);
        conector.closeExecute();
    }
    
    public boolean exists(Song poem) throws SQLException{
       boolean exist = false;
       System.out.println(poem.getName());
        ResultSet set = conector.executeQuery("SELECT * FROM poem WHERE name ='"+poem.getName()+"'");
        if(set.next()){
            exist = true;
        }
        conector.closeexecuteQuery();
        return exist;
        
    }
    
}
