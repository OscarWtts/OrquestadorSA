/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author oscar
 */
@WebService(serviceName = "ws_fabrica")
public class ws_fabrica {

     
    
    @WebMethod(operationName = "fechaEntraga")
    public String fechaEntrega(@WebParam(name = "idTienda") String txt) {
        int ran = (int)(Math.random()*1000);
        return "Próximo envío para "+ txt +" de productos en " + ran + " días!";
    }
}
