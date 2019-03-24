/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author oscar
 */
@WebService(serviceName = "ws_Stock")
public class ws_Stock {
    String[ ] stock = {"00110-Samsung", "01010-Motorola3","00180-SamsungS3", "11010-Motorola3"
            ,"00111-Iphone", "01210-Motorola8"}; 
   
    @WebMethod(operationName = "obtenerStock")
    public int obtenerStock(@WebParam(name = "id") String id) {
        int resultado = 0;
        for (String stock1 : stock) {
            String[] producto = stock1.split("-");
            if(producto[0].equals(id)){
                resultado = 1;
                break;
            }
        }
        
        return resultado;
    }
    
    @WebMethod(operationName = "obtenerListadoStock")
    public String obtenerListadoStock(@WebParam(name = "id") String id) { 
        return "101254-Cartas;01010-Motorola3;00180-SamsungS3;11010-Motorola3;00111-Iphone;01210-Motorola8;";
    }
}
