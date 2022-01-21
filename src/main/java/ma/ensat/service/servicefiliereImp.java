/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.ensat.service;

import java.util.List;
import ma.ensat.dao.filieredaoImp;
import ma.ensat.model.filiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACHAHBAR
 */
@Service
public class servicefiliereImp implements servicefiliere {
    
    @Autowired
    filieredaoImp dao;
    
    @Override
    public int createfiliere(filiere fil) {
        return dao.createfiliere(fil);
    }

    @Override
    public List<filiere> getAll() {
        return dao.getAll();
    }

    @Override
    public filiere getById(int id) {
        return dao.getById(id);
    }

    @Override
    public int editFiliere(filiere fil) {
        return dao.editFiliere(fil);
    }

    @Override
    public int removefiliere(int id) {
       return dao.removefiliere(id);
    }

    @Override
    public int removefilire(filiere fil) {
        return dao.removefilire(fil);
    }
    
}
