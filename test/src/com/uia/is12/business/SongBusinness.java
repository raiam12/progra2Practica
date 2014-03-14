/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uia.is12.business;

import com.uia.is12.data.SongDAO;
import com.uia.is12.domain.Song;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class SongBusinness {
    private SongDAO songdao= new SongDAO();

    public SongBusinness() {
    }
    
    public Song getSong() throws SQLException{
       return songdao.getSong();
    }
    
    public void addPoem(Song poem) throws SQLException, Exception{
        if(!(songdao.exists(poem))){
           songdao.addVerse(poem);
        } else {
            throw new Exception("El poema ya existe en la BD");
        }
    }
}
