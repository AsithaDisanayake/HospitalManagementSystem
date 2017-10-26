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
public class PatientObj {

    private String p_id;
    private String p_name;
    private int age;
    private String gender;
    private String nic;
    private String blood_group;
    private int phn_no;
    private String address;
    private String g_name;
    private String g_no;
    private String admit_id;
    private String admit_date;
    private String medical;
    private String ward_id;
    private String ward_name;
    private String external;
    private String consultant;
    private String recommand;
    private String discharge;

    //Getters
    public String getPatient_id() {
        return p_id;
    }

    public String getPatient_name() {
        return p_name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getNic() {
        return nic;
    }

    public String getBloodGroup() {
        return blood_group;
    }

    public int getPhn_no() {
        return phn_no;
    }

    public String getAddress() {
        return address;
    }

    public String getGname() {
        return g_name;
    }

    public String getGno() {
        return g_no;
    }

    public String getAdmit_id() {
        return admit_id;
    }

    public String getAdmit_date() {
        return admit_date;
    }

    public String getMedical() {
        return medical;
    }

    public String getWard_id() {
        return ward_id;
    }

    public String getWard_name() {
        return ward_name;
    }

    public String getExternal() {
        return external;
    }

    public String getConsultant() {
        return consultant;
    }

    public String getRecommand() {
        return recommand;
    }

    public String getDischarge() {
        return discharge;
    }

    //Setters
    public void setPatient_id(String p_id) {
        this.p_id = p_id;
    }

    public void setPatient_name(String p_name) {
        this.p_name = p_name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public void setBloodGroup(String blood_group) {
        this.blood_group = blood_group;
    }

    public void setPhn_no(int phn_no) {
        this.phn_no = phn_no;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGname(String g_name) {
        this.g_name = g_name;
    }

    public void setGno(String g_no) {
        this.g_no = g_no;
    }

    public void setAdmit_id(String admit_id) {
        this.admit_id = admit_id;
    }

    public void setAdmit_date(String admit_date) {
        this.admit_date = admit_date;
    }

    public void setMedical(String medical) {
        this.medical = medical;
    }

    public void setWard_id(String ward_id) {
        this.ward_id = ward_id;
    }

    public void setWard_name(String ward_name) {
        this.ward_name = ward_name;

    }

    public void setExternal(String external) {
        this.external = external;
    }

    public void setConsultant(String consultant) {
        this.consultant = consultant;
    }

    public void setRecommand(String recommand) {
        this.recommand = recommand;
    }

    public void setDischarge(String discharge) {
        this.discharge = discharge;
    }
}
