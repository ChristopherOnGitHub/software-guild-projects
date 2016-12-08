/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitarDTO;

import java.util.Objects;

/**
 *
 * @author apprentice
 */
public class Guitar {
    
    private int serial;
    private String make;
    private String model;
    private String finish;
    
    public Guitar(){}

    public Guitar(int serial, String make, String model, String finish) {
        this.serial = serial;
        this.make = make;
        this.model = model;
        this.finish = finish;
    }

    public int getSerial() {
        return serial;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getFinish() {
        return finish;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.serial;
        hash = 23 * hash + Objects.hashCode(this.make);
        hash = 23 * hash + Objects.hashCode(this.model);
        hash = 23 * hash + Objects.hashCode(this.finish);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Guitar other = (Guitar) obj;
        if (this.serial != other.serial) {
            return false;
        }
        if (!Objects.equals(this.make, other.make)) {
            return false;
        }
        if (!Objects.equals(this.model, other.model)) {
            return false;
        }
        if (!Objects.equals(this.finish, other.finish)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
