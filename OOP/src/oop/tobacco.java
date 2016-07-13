package oop;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class tobacco implements Serializable {
    public int nicotine,tar;
    
    /*protected void getNicotine(int nicotine){
        this.nicotine = nicotine;
    }
    
    protected void getTar(int tar){
        this.tar = tar;
    }*/

    public int getNicotine() {
        return nicotine;
    }

    public void setNicotine(int nicotine) {
        this.nicotine = nicotine;
    }

    public int getTar() {
        return tar;
    }

    public void setTar(int tar) {
        this.tar = tar;
    }
}
