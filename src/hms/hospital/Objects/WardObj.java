/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.hospital.Objects;

/**
 *
 * @author Asitha Imala
 */
public class WardObj {
    
     private int ward_id;
    private String ward_name;
    private String doc_id;
    private String max;
    private String current;
   

    //Getters
  
    public int getWard_id() {
        return ward_id;
    }

    public String getWard_name() {
        return ward_name;
    }

    public String getDoc_Id() {
        return doc_id;
    }

    public String getMaxnop() {
        return max;
    }

    public String getCurrent() {
        return current;
    }

  
    public void setWard_id(int ward_id) {
        this.ward_id = ward_id;
    }

    public void setWard_name(String ward_name) {
        this.ward_name = ward_name;

    }

    public void setDoc_ID(String doc_id) {
        this.doc_id = doc_id;
    }

    public void setMaxnop(String max) {
        this.max = max;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

  
}
