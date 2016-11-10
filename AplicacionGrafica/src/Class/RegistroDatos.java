/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

//import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Esthefani Machado
 */
public class RegistroDatos {
    
    public int RegistroDatos (String NombreTabla, Object[] Datos){

        int Filas = 0;
        try {
            Conectar cc = new Conectar(); 
            Connection cn = cc.getConnection();
            String CadenaSQL = "INSERT INTO " + NombreTabla + " values ("+"'"+Datos[0]+"'";
            
            for (int i =1; i<=Datos.length;i++){
                if (i<Datos.length)
                    CadenaSQL = CadenaSQL + ",'"+Datos[i]+"'";
                else
                    CadenaSQL = CadenaSQL + ")";  
            }
            
            JOptionPane.showMessageDialog(null, CadenaSQL);
            
            //Statement
            
            Statement Insertar = cn.createStatement();
            Filas =  Insertar.executeUpdate(CadenaSQL);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return Filas;
    }
    
}
