/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Zqh
 */
@WebService(serviceName = "H")
public class H {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello() {
        return "Hello " + " !";
    }
}
