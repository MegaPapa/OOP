package oop;

import java.awt.List;
import java.io.Serializable;

/**
 *
 * @author PC
 */
public class cigarette extends cigar {
    public String filterType;

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public oop.tobacco getTobacco() {
        return tobacco;
    }

    public void setTobacco(oop.tobacco tobacco) {
        this.tobacco = tobacco;
    }
    public String flavour;
    public tobacco tobacco;
    
    @Override
    public void setInfo(String ...data) {
        
        int index = 0;
        for (String temp : data) {
            if (index == 0)
                filterType = temp;
            else if (index == 1)
                flavour = temp;
            else if (index == 2)
                factory = temp;
            index++;
        }
        
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
    public String getInfo() {
        //list.add("Cigarette :" + tobacco.getNicotine() + tobacco.getTar() + flavour);
        /*System.out.println("Cigarette:");
        System.out.println(filterType);
        System.out.println(flavour);
        System.out.println(fatness);
        System.out.println(tob.getNicotine());
        System.out.println(tob.getTar());*/
        
        return "Cigarette :" + tobacco.getNicotine() + " " + tobacco.getTar()+ " " + flavour;
    }
    
    /*cigarette(int nicotine,int tar,int fatness,String fabricator){
        
    }*/
}
