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
public class TestObj extends PatientObj {

    private String trId;
    private String trDate;
    private String consultant;
    private String trName;
    private String details;

    //Getters
    public String getTrId() {
        return trId;
    }

    public String getTrDate() {
        return trDate;
    }

    public String getConsultant() {
        return consultant;
    }

    public String getTrName() {
        return trName;
    }

    public String getDetails() {
        return details;
    }

    //Setters
    public void setTrstId(String trId) {
        this.trId = trId;
    }

    public void setTestDate(String trDate) {
        this.trDate = trDate;
    }

    public void setConsultant(String consultant) {
        this.consultant = consultant;
    }

    public void setTrName(String trName) {
        this.trName = trName;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
