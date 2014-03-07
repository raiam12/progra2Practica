/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uia.is12.view;

import com.uia.is12.business.SongBusinness;
import com.uia.is12.domain.Verse;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class SongView extends Thread{
    private SongBusinness controller = new SongBusinness();
    
    @Override
    public void run(){
        ArrayList<Verse> versos = controller.getSong().getVerse();
        
        for(Verse verso : versos){
            try {
            
            System.out.println(verso.getParagraph());
            Thread.sleep(verso.getVerseTime());
            } catch (InterruptedException ex) {
                Logger.getLogger(SongView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
