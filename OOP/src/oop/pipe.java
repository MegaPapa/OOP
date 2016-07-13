/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.awt.List;
import java.io.Serializable;

/**
 *
 * @author PC
 */
public class pipe extends tobaccoProduct  {
    
    public tobacco tobacco;
    
    
    
    public oop.tobacco getTobacco() {
        return tobacco;
    }

    public void setTobacco(oop.tobacco tobacco) {
        this.tobacco = tobacco;
    }

    public String getHousingMaterial() {
        return housingMaterial;
    }

    public void setHousingMaterial(String housingMaterial) {
        this.housingMaterial = housingMaterial;
    }
    public String housingMaterial;
    
    
    @Override
    public void setInfo(String ...data) {
        
        int index = 0;
        for (String temp : data) {
            if (index == 0)
                housingMaterial = temp;
            else
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
            index++;
        }
        
    }
    
    @Override
    public String getInfo() {
        //list.add("Pipe :" + tobacco.getNicotine() + tobacco.getTar() + housingMaterial);
        /*System.out.println("Pipe:");
        System.out.println(housingMaterial);
        System.out.println(factory);
        System.out.println(tob.getNicotine());
        System.out.println(tob.getTar());*/
        
        return "Pipe : " + tobacco.getNicotine() + " " + tobacco.getTar() + " " + housingMaterial;
    }
}
