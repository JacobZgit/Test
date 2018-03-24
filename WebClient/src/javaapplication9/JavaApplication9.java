/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import com.H;
import com.H_Service;
import com.HelloWS;
import com.HelloWSService;



/**
 *
 * @author Zqh
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        H_Service h=new H_Service();
        HelloWSService helloWSService=new HelloWSService();
        System.out.println(h.getHPort().hello()+helloWSService.getHelloWSPort().hello());
    
    }
    
}
