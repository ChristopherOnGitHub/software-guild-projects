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
public class SuperHero {

    private String name;
    private String power;
    private String secretIdentity;
    public String lastKnownLocation;
    static int superHeroCount;

    public SuperHero(String name, String power) {
        superHeroCount++;
        this.name = name;
        this.power = power;
    }

    public int getNumberSuperHeros() {
        return superHeroCount;
    }

    public String getName() {
        return this.name;
        //Super heros will tell people who ask what their name is
    }

    public String getPower() {
        return this.power;
        //Their powers can be changed by external forces
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setSecretIdentity(String newIdentity) {
        this.secretIdentity = newIdentity;
        //Can change secret identity but won't tell
        //write only
    }

}
