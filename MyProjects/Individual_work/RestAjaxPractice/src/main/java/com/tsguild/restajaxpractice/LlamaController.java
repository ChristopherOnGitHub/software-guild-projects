/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.restajaxpractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author apprentice
 */
@Controller
public class LlamaController {
    
    Map<String, Llama> llamaMap = new HashMap<>();
    
    @ResponseBody
    @RequestMapping(value="/test", method=RequestMethod.GET)
    public Llama testLlama(){
        return new Llama("Fred III");
    }
    
    @ResponseBody
    @RequestMapping(value="/Fred", method=RequestMethod.GET)
    public Llama getFred(){
        return new Llama("Fred");
    }
    
    
    @ResponseBody
    @RequestMapping(value="/makeLlama", method=RequestMethod.GET)
    public Llama makeLlama(HttpServletRequest request){
        String llamaName = request.getParameter("llamaName");
        if(llamaName == null || llamaName.isEmpty()){
            llamaName = "Fred";
        }
        
        Llama aLlama = new Llama(llamaName);
        
        String packThing = request.getParameter("thing");
        if(packThing != null && !packThing.isEmpty()){
            aLlama.getPack().add(packThing);
        }
        
        llamaMap.put(llamaName, aLlama);
        
        return aLlama;
    }
    
    @ResponseBody
    @RequestMapping(value="/getLlama", method=RequestMethod.GET)
    public Llama getThatLama(HttpServletRequest request){
        String gottenLlama = request.getParameter("llamaName");
        Llama foundLlama;
        
        if(gottenLlama == null || gottenLlama.isEmpty()){
            foundLlama = new Llama("Fred");
        }else{
            foundLlama = llamaMap.get(gottenLlama);
        }
        
        return foundLlama;
    }
    
    @ResponseBody
    @RequestMapping(value="/makeLlama/{llamaName}", method=RequestMethod.POST)
    public Llama makeNewLlamaWithPathVariables(@PathVariable String llamaName){
        if(llamaName == null || llamaName.isEmpty()){
            llamaName = "Billbo";
        }
        
        Llama aLlama = new Llama(llamaName);
        llamaMap.put(llamaName, aLlama);
        return aLlama;
    }
    
    @ResponseBody
    @RequestMapping(value="/getLlama/{llamaName}", method=RequestMethod.GET)
    public Llama getALlama(@PathVariable String llamaName){
        Llama foundLlama = llamaMap.get(llamaName);
        return foundLlama;
    }
    
    @ResponseBody
    @RequestMapping(value="/allLlamas", method=RequestMethod.GET)
    public Collection<Llama> getAllLlamas(){
        return llamaMap.values();
    }
}
