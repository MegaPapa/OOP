package oop;

import java.awt.List;
import java.io.Serializable;

/**
 *
 * @author PC
 */
public class tobaccoProduct extends smokingFacility implements Serializable {
    public tobacco tobacco;

    
    public tobacco getTobacco() {
        return tobacco;
    }

    public void setTobacco(tobacco tobacco) {
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
            index++;
        }
        
    }
    
    @Override
    public String getInfo(){
        //list.add("tobacco product :" + tobacco.getNicotine() + tobacco.getTar());
        /*System.out.println("Tobacco product:");
        System.out.println(tobacco.getNicotine());
        System.out.println(tobacco.getTar());*/
        
        return "tobacco product : " + tobacco.getNicotine() + " " + tobacco.getTar();
    }
}
