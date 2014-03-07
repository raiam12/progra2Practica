/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uia.is12.data;

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
    static final String JBCD ="com.mysql.jdbc.Driver";
    static final String DB_URL ="jdbc:mysql://localhost:3306/semana8";
    
    static final String USER ="root";
    static final String PASS ="root";
    Connection con = null;
    CallableStatement stat = null;
    public SongDAO() {
    }
    
    public Song getSong() throws SQLException{
        Song cancion = new Song();
        ArrayList<Verse> verse = new ArrayList<Verse>();
        con = DriverManager.getConnection(DB_URL, USER, PASS);
        String sql = "SELECT * FROM semana8.verse";
        stat = con.prepareCall(sql);
        ResultSet res = stat.executeQuery();
        
        while(res.next()){
            System.out.println(res.getString("id")+"             "+res.getString("paragraph"));
        }
        
        stat.close();
        con.close();
        
        
        
        
        
        verse.add(new Verse("Best Song Ever",4000));
        verse.add(new Verse("Look, if you had one shot, one opportunity ",1000));
        verse.add(new Verse("to seize everything you ever wanted ",1000));
        verse.add(new Verse("One moment",1000));
        verse.add(new Verse("would you capture it or just let it slip?",1000));
        verse.add(new Verse("His palms are sweaty, knees weak, arms are heavy ",1000));
        verse.add(new Verse("there'ss vomit on his sweater already, mom's spaghetti ",1000));
        verse.add(new Verse("he's nervous, but on the surface he looks calm and ready",1000));
        verse.add(new Verse("to drop bombs, but he keeps on forgettin ",1000));
        verse.add(new Verse("what he wrote down, the whole crowd goes so loud",1000));
        verse.add(new Verse("he opens his mouth, but the words won't come out",1000));
        verse.add(new Verse("he's chokin, how everybody's jokin now ",1000));
        verse.add(new Verse("the clocks run out, times up over, bloah!",1000));
        verse.add(new Verse("snap back to reality, oh there goes gravity ",1000));
        verse.add(new Verse("oh, there goes rabbit, he choked ",1000));
        verse.add(new Verse("hes so mad, but he wont give up that",1000));
        verse.add(new Verse("Eminem--Lose yourself",1000));
        
        
        cancion.setVerse(verse);
        return cancion;
    }
    
}
