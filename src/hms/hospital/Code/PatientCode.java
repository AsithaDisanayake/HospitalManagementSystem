/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.hospital.Code;

import hms.hospital.DbConeection.DB;
import hms.hospital.Objects.PatientObj;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Asitha Imala
 */
public class PatientCode {

    public static void save(PatientObj patientObj) {
        try {

            Connection con = DB.connect();
            PreparedStatement r = con.prepareStatement("insert into patient values('" + patientObj.getPatient_id() + "','" + patientObj.getPatient_name() + "','" + patientObj.getAge() + "','" + patientObj.getGender() + "','" + patientObj.getNic() + "','" + patientObj.getBloodGroup() + "','" + patientObj.getPhn_no() + "','" + patientObj.getAddress() + "','" + patientObj.getGname() + "','" + patientObj.getGno() + "')");
            r.executeUpdate();
            r.close();
            JOptionPane.showMessageDialog(null, "Successfuly Saved");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void delete(PatientObj patientObj) {
        try {
            Connection con = DB.connect();
            PreparedStatement r = con.prepareStatement("delete from patient where p_id='" + patientObj.getPatient_id() + "'");
            r.executeUpdate();
            r.close();
            JOptionPane.showMessageDialog(null, "Successfuly delete");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void update(PatientObj patientObj) {
        try {

            Connection con = DB.connect();
            PreparedStatement r = con.prepareStatement("update patient set p_name='" + patientObj.getPatient_name() + "',age='" + patientObj.getAge() + "',gender='" + patientObj.getGender() + "', nic='" + patientObj.getNic() + "',blood_group='" + patientObj.getBloodGroup() + "',address='" + patientObj.getAddress() + "',phn_no='" + patientObj.getPhn_no() + "',g_name='" + patientObj.getGname() + "',g_no='" + patientObj.getGno() + "'where p_id='" + patientObj.getPatient_id() + "'");
            r.executeUpdate();
            r.close();
            JOptionPane.showMessageDialog(null, "Successfuly Update");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public static PatientObj search(String id) {

        PatientObj patientObj = new PatientObj();

        try {
            Connection con = DB.connect();
            ResultSet r = con.createStatement().executeQuery("select * from patient where p_id='" + id + "'");
            boolean b = false;
            while (r.next()) {
                b = true;
                patientObj.setPatient_id(r.getString("p_id"));
                patientObj.setPatient_name(r.getString("p_name"));
                patientObj.setAge(Integer.parseInt(r.getString("age")));
                patientObj.setGender(r.getString("gender"));
                patientObj.setNic(r.getString("nic"));
                patientObj.setBloodGroup(r.getString("blood_group"));

            }

            ResultSet r2 = con.createStatement().executeQuery("select * from admit where p_id='" + id + "'");
            boolean b2 = false;
            while (r2.next()) {
                b2 = true;

                patientObj.setAdmit_id(r2.getString("admit_id"));

                patientObj.setMedical(r2.getString("admit_date"));
                patientObj.setWard_id(r2.getString("ward_id"));
                patientObj.setExternal(r2.getString("external"));
                patientObj.setConsultant(r2.getString("consultant"));
                patientObj.setRecommand(r2.getString("recommand"));
                 patientObj.setDischarge(r2.getString("discharge"));
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

        return patientObj;

    }

}
