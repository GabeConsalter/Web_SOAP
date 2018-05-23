/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServiceSOAP;

import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
/**
 *
 * @author Diego
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface Interface_SOAP {
    
  @WebMethod float Somar(float a, float b);
  @WebMethod float Subtrair_A_menos_B(float a, float b);
  @WebMethod float Dividir_A_por_B(float a, float b);
  @WebMethod float Multiplicar(float a, float b);
  @WebMethod float Quadrado(float a);
  @WebMethod float Cubo(float a);
  

}
