/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServiceSOAP;

//import Models.UserModel;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
//import jdbc.ConnectionFactory;
 
@WebService(endpointInterface = "WebServiceSOAP.Interface_SOAP")
public class Implements_SOAP implements Interface_SOAP{

    @Override
    public float Somar(float a, float b) {
        
        return a+b;        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float Subtrair_A_menos_B(float a, float b) {
        return a-b;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float Dividir_A_por_B(float a, float b) {
        
       return a/b;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float Multiplicar(float a, float b) {
        
        return a*b;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float Quadrado(float a) {
        return a*a;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float Cubo(float a) {
        return a*a*a;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
