/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServiceSOAP;

//import Models.ModelUrl;
import javax.xml.ws.Endpoint;

/**
 *
 * @author Diego
 */
public class Web_Service_SOAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //alterar com o IP do PC apos os dois pontos é a porta onde vai criar
        Endpoint.publish("http://192.168.2.165:9876/WebSeviceSOAP",new Implements_SOAP());
        
    }
    
}
