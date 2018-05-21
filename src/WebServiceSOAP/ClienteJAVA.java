/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServiceSOAP;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author Diego
 */
public class ClienteJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
       URL url = null;
                    
            url = new URL("http://192.168.2.165:9876/WebSeviceSOAP?wsdl");
        
        QName qname = new QName("http://WebServiceSOAP/","Implements_SOAPService");
        Service ws = Service.create(url, qname);
        
        Interface_SOAP inter = ws.getPort(Interface_SOAP.class);
        
        float aux = inter.Somar(2, 2);
        
        System.out.println(aux);
    }
    
}
