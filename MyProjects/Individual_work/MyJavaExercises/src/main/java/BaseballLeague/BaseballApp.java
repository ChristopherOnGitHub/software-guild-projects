/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseballLeague;

import java.io.IOException;

/**
 *
 * @author apprentice
 */
public class BaseballApp {
    public static void main(String[] args) throws IOException {
        
        BaseballController start = new BaseballController();
        start.run();
    }
    
}
