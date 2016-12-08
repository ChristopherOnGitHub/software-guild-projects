package com.tsguild.guitarwebapp;

import com.tsguild.GuitarWebApp.guitarDAO.guitarDAO;
import guitarDTO.Guitar;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BestController {

    private guitarDAO dao;

    @Inject
    public BestController(guitarDAO dao) {
        this.dao = dao;
    }

    @RequestMapping(value = "/addGuitar", method = RequestMethod.POST)
    public String processNoAjaxAddForm(HttpServletRequest request) {
        String make = request.getParameter("make");
        String model = request.getParameter("model");
        String finish = request.getParameter("finish");

        if (!finish.equals("") && !make.equals("") && !model.equals("")) {
            if (finish != null && make != null && model != null) {

                Guitar newGuitar = new Guitar(0, make, model, finish);

                dao.addGuitar(newGuitar);
                return "redirect:index";
            }
        }
        return "addGuitar";
    }

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String displayIt(Model model) {
        model.addAttribute("guitarMap", dao.getAllProducts());
        return "index";
    }

    @RequestMapping(value = {"/addGuitar"}, method = RequestMethod.GET)
    public String displayaddGuitars() {
        return "addGuitar";
    }

    @RequestMapping(value = "/deleteOrder", method = RequestMethod.GET)
    public String deleteOrder(HttpServletRequest request) {
        String serialToDel = request.getParameter("serial");
        int id = Integer.parseInt(serialToDel);
        dao.removeGuitar(id);
        return "redirect:/index";
    }

    @RequestMapping(value = "/editForm", method = RequestMethod.GET)
    public String editOrder(Model model, HttpServletRequest request) {
        String getThatAxe = request.getParameter("serial");
        int retrievedSerial = Integer.parseInt(getThatAxe);
        Guitar thisOne = dao.getSerial(retrievedSerial);
        model.addAttribute("editThisOne", thisOne);
        return "editForm";
    }

    @RequestMapping(value = "/editForm", method = RequestMethod.POST)
    public String lameWayOfDoingIt(HttpServletRequest request) {
        String serialString = request.getParameter("specialSerial");
        String make = request.getParameter("make");
        String model = request.getParameter("model");
        String finish = request.getParameter("finish");
        int bestSerial = Integer.parseInt(serialString);

        if (finish != null && make != null && model != null) {

            Guitar x = new Guitar(bestSerial, make, model, finish);
            dao.removeGuitar(bestSerial);
            dao.updateGuitar(x);

            return "redirect:/index";
        }

        return "editForm";
    }
}
