/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.ensat.controller;

import java.util.ArrayList;
import java.util.List;
import ma.ensat.dao.filieredaoImp;
import ma.ensat.model.etudiant;
import ma.ensat.model.filiere;
import ma.ensat.service.serviceetudiantImp;
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
public class etudiantcontroller {
     
    @Autowired
    serviceetudiantImp service;
    @Autowired
    servicefiliereImp servicefiliere;
    
    @RequestMapping("/")
    public String listEtudiant(Model m) {
        List<etudiant> liste = new ArrayList<etudiant>();
        liste = service.getAll();
        m.addAttribute("liste",liste);
        return "viewetu";
    }
    
   @RequestMapping("/nvetd")
   public ModelAndView create(Model m) {
        List<filiere> listfil = new ArrayList<filiere>();
        listfil = servicefiliere.getAll();
        m.addAttribute("listfil",listfil);
       return new ModelAndView("etuform", "command", new etudiant());
   }
   
   @RequestMapping(value="/Save", method = RequestMethod.POST)
   public String save(@ModelAttribute("etd") etudiant etd) {
       service.createEtudiant(etd);
       return "redirect:/";
   }
   
   @RequestMapping("/listetu")
    public String listEtudiantagain(Model m) {
        List<etudiant> liste = new ArrayList<etudiant>();
        liste = service.getAll();
        m.addAttribute("liste",liste);
        return "viewetu";
    }
    
    @RequestMapping(value="/editetu", method= RequestMethod.GET) 
    public String editetu(@RequestParam("id") int id, Model m) {
        etudiant etd = new etudiant();
        etd = service.getById(id);
        m.addAttribute("command",etd);
        return "editetd";
    }
    
    @RequestMapping(value="/deleteetu", method= RequestMethod.GET) 
    public String deleteetu(@RequestParam("id") int id) {
        int r = service.removeEtudiant(id);
        return "redirect:/";
    }
}
    

