package oop;

import java.awt.List;
import java.io.Serializable;
import javax.swing.JTextField;
/**
 *
 * @author PC
 */
public class electronicCigarette extends smokingFacility  {
    public String evoparatorType;

    public String getEvoparatorType() {
        return evoparatorType;
    }

    public void setEvoparatorType(String evoparatorType) {
        this.evoparatorType = evoparatorType;
    }
    
    
    @Override
    public void setInfo(String ...data) {
        
        int index = 0;
        for (String temp : data) {
            if (index == 0)
                evoparatorType = temp;
            else
                factory = temp;
            index++;
        }
    }
    
    @Override
    public String getInfo() {
        //list.add("e.Cigarette :" + evoparatorType + factory);
        System.out.println("e.Cigarette:");
        System.out.println(evoparatorType);
        System.out.println(factory);
        
        return "e.Cigarette : " + evoparatorType + " " + factory ;
    }
    
}
