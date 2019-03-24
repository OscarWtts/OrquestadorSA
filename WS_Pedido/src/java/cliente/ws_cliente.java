/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author oscar
 */
@WebService(serviceName = "ws_cliente")
public class ws_cliente {

    
    @WebMethod(operationName = "devolverDireccion")
    public String devolverDireccion(@WebParam(name = "cliente") String txt) {
        return "orden 12057 Entregada";
    }
}
