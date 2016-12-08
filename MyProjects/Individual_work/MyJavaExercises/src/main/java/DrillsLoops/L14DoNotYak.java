/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLoops;

/**
 *
 * @author apprentice
 */
public class L14DoNotYak {
    
//    Suppose the String "yak" is unlucky. Given a String, return a version 
//            where all the "yak" are removed, but the "a" can be any char. 
//                    The "yak" Strings will not overlap. 
//
//doNotYak("yakpak") -> "pak"
//doNotYak("pakyak") -> "pak"
//doNotYak("yak123ya") -> "123ya"

public String doNotYak(String str) {
    
    String x = str.replace("yak", "");
    
    return x;

}
    
}
