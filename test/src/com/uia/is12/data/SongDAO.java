/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uia.is12.data;

import com.uia.is12.domain.Song;
import com.uia.is12.domain.Verse;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class SongDAO {

    public SongDAO() {
    }
    
    public Song getSong(){
        Song cancion = new Song();
        ArrayList<Verse> verse = new ArrayList<Verse>();
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
