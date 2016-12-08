package com.tsguild.vendingmachinewebapp.ops;

import com.tsguild.vendingmachinewebapp.dao.VendingDao;
import com.tsguild.vendingmachinewebapp.dto.Item;
import java.util.List;
import javax.inject.Inject;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HomeController {
        
    private final VendingDao dao;
    
    @Inject
    public HomeController(VendingDao dao){
        this.dao = dao;
    }
    
    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String displayHomePage() {
        return "index";
    }
    
    //get item by id
    
    @ResponseBody
    @RequestMapping(value = "/getItem/{id}", method = RequestMethod.GET)
    public Item getItem(@PathVariable int id){
        return dao.getItemById(id);
    }
            
    //get all items
    
    @ResponseBody
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Item> getEmAll(){
        return dao.getAllItems();
    }
    
    //update an item
    
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/updateStock/{id}", method = RequestMethod.PUT)
    public void updateStock(@PathVariable int id, @RequestBody Item updatedItem){
        updatedItem.setId(id);
        dao.updateItem(updatedItem);
    }
    
    //update by id
    
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/updateStockId/{id}", method = RequestMethod.PUT)
    public void updateStockId(@PathVariable int id){
        dao.stockMinusOne(id);
    }
}
