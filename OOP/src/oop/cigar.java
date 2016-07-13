package oop;

import java.awt.List;
import java.io.Serializable;

/**
 *
 * @author PC
 */
public class cigar extends tobaccoProduct {
    public int fatness;
    public tobacco tobacco;

    public int getFatness() {
        return fatness;
    }

    public void setFatness(int fatness) {
        this.fatness = fatness;
    }

    public oop.tobacco getTobacco() {
        return tobacco;
    }

    public void setTobacco(oop.tobacco tobacco) {
        this.tobacco = tobacco;
    }
    
    @Override
    public void setInfo(Integer ...data) {
        
        tobacco = new tobacco();
        
        int index = 0;
        for (Integer temp : data) {
            if (index == 0)
                tobacco.setNicotine(temp);
            else if (index == 1)
                tobacco.setTar(temp);
            else if (index == 2)
                fatness = temp;
            index++;
        }
        
    }
    
    @Override
    public String getInfo(){
        //list.add("Cigar :" + tobacco.getNicotine() + tobacco.getTar() + fatness);
        /*System.out.println(tobacco.getNicotine());
        System.out.println(tobacco.getTar());
        System.out.println(fatness);*/
        
        return "Cigar : " + tobacco.getNicotine() + " " + tobacco.getTar() + " " + fatness;
    }
    
}
