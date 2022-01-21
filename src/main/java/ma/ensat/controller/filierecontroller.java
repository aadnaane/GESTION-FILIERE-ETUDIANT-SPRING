/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.ensat.controller;

import java.util.ArrayList;
import java.util.List;
import ma.ensat.model.filiere;
import ma.ensat.service.servicefiliereImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ACHAHBAR
 */
@Controller
public class filierecontroller {
    @Autowired
    servicefiliereImp service ;
    
    @RequestMapping("/filiere")
    public String listEtudiant(Model m) {
        List<filiere> liste = new ArrayList<filiere>();
        liste = service.getAll();
        m.addAttribute("liste",liste);
        return "viewfil";
    }
    
    @RequestMapping("/filiere/nvfil")
    public ModelAndView ajouterfiliere(Model m) {
        return new ModelAndView("newfil","command", new filiere());
    }
    
    @RequestMapping(value="/filiere/Save", method = RequestMethod.POST) 
    public String enregistrerfiliere(@ModelAttribute("fil") filiere fil ) {
        service.createfiliere(fil);
        return "redirect:/filiere";
        
    }
    
    @RequestMapping(value="filiere/editfil", method= RequestMethod.GET)
    public String modifierfiliere(@RequestParam("id") int id, Model m) {
        filiere fil = new filiere();
        fil = service.getById(id);
        m.addAttribute("command",fil);
        return "editfil";
    }
    
    @RequestMapping(value="/filiere/deletefil",method=RequestMethod.GET)
    public String deletefil(@RequestParam("id") int id) {
        int r = service.removefiliere(id);
        return "redirect:/filiere";
    }
}
