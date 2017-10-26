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
public class TreatmentObj extends PatientObj{

    private String testId;
    private String testDate;
    private String consultant;
    private String testName;
    private String details;

    //Getters
    public String getTestId() {
        return testId;
    }

    public String getTestDate() {
        return testDate;
    }

    public String getConsultant() {
        return consultant;
    }

    public String getTestName() {
        return testName;
    }

    public String getDetails() {
        return details;
    }

    //Setters
    public void setTestId(String testId) {
        this.testId = testId;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public void setConsultant(String consultant) {
        this.consultant = consultant;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

