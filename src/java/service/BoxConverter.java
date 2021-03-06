/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author igor
 */
@WebService(serviceName = "BoxConverter")
public class BoxConverter {

    /**
     * This is a sample web service operation
     * @param name
     */
    @WebMethod(operationName = "converter")
    public Box hello(@WebParam(name = "name") String name, @WebParam(name="id") int id, @WebParam(name="weight") double weight,@WebParam(name="w")double w,@WebParam(name="h") double h, @WebParam(name="d") double d, @WebParam(name="unitType") String unitType) {
       Box box = new Box(name,id,weight,w,h,d);
        if(unitType.equals("metric")){        
            box.convertToImp();
        }
        if(unitType.equals("imperial")){
            box.convertToMetric();
        }
        return box;
    }
}
