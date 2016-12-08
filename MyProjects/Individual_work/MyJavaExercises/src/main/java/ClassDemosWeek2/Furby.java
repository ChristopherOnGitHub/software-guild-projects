/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDemosWeek2;

/**
 *
 * @author apprentice
 */
public class Furby {
    
    private String furColor;
    private String[] creepyThingsSaid;
    private String name;
    
    Furby(){}

    public Furby(String furColor, String[] creepyThingsSaid, String name) {
        this.furColor = furColor;
        this.creepyThingsSaid = creepyThingsSaid;
        this.name = name;
    }

    public String getFurColor() {
        return furColor;
    }

    public String[] getCreepyThingsSaid() {
        return creepyThingsSaid;
    }

    public String getName() {
        return name;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void setCreepyThingsSaid(String[] creepyThingsSaid) {
        this.creepyThingsSaid = creepyThingsSaid;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
