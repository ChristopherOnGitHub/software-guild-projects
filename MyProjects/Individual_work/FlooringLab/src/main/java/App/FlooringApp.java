/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Ops.FlooringController;
import java.io.IOException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author apprentice
 */

public class FlooringApp {

    public static void main(String[] args) throws IOException {

        ApplicationContext springFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        FlooringController controller = springFactory.getBean("controller", FlooringController.class);
        
        controller.run();
    }
}
