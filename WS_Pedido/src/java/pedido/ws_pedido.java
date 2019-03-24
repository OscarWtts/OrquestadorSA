/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedido;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author oscar
 */
@WebService(serviceName = "ws_pedido")
public class ws_pedido {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "cargarPedido")
    public int eviarPedido(@WebParam(name = "id") String id, @WebParam(name = "cantidad") int cantidad) {
        int respuesta = 0;
        try{
        AdmonColas.cargaCola(id,cantidad);
        respuesta = 1;
        }
        catch(Exception e) {     
            respuesta = 0;
        }
         return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerPedido")
    public int obtenerPedido() {
        int respuesta = 0;
        try{
        AdmonColas.obtenerCola();
        respuesta = 1;
        }
        catch(Exception e) {     
            respuesta = 0;
        }
         return respuesta;
    }
}
