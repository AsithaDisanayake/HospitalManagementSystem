/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.hospital.Code;

import hms.hospital.DbConeection.DB;
import hms.hospital.Objects.DoctorObj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Asitha Imala
 */
public class DoctorCode {
    
    
         public static void save( DoctorObj docObj ) {
        try {            
            
            
              Connection con = DB.connect();
                PreparedStatement r = con.prepareStatement("insert into doctor values('" + docObj.getDocID() + "','" +  docObj.getEmp_name() + "','" +  docObj.getEmp_id() + "','" +  docObj.getSpeciality() + "')");
                r.executeUpdate();
                r.close();
                JOptionPane.showMessageDialog(null, "Successfuly Saved");
                
                
     
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }
    



  public void update(DoctorObj docObj) {
        try {
            Connection con = DB.connect();
            PreparedStatement r = con.prepareStatement("update doctor set status='" + docObj.getSpeciality() + "'where doc_id='" + docObj.getDocID() + "'");
            r.executeUpdate();
            r.close();
            JOptionPane.showMessageDialog(null, "Successfuly Update");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }  
  
  
  
          public void delete(DoctorObj docObj) {
        try {
            Connection com = DB.connect();
            PreparedStatement r = com.prepareStatement("delete from doctor where doc_id='" + docObj.getDocID()+ "'");
            r.executeUpdate();
            r.close();
            JOptionPane.showMessageDialog(null, "Successfuly delete");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
  

}

