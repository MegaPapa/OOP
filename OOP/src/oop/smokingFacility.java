package oop;

import java.awt.List;
import java.io.Serializable;

/**
 *
 * @author PC
 */
public abstract class smokingFacility  implements Serializable  {
    
    public String factory;

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }
    
    public void setInfo(String ...data) {}
    public void setInfo(Integer ...data) {}
    public String getInfo(){ return "";}
    //protected String fabricator;
    //protected abstract void getParameters();
}
