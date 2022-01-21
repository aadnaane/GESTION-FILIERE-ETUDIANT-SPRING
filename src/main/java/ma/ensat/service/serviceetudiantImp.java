/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.ensat.service;

import java.util.List;
import ma.ensat.dao.etudiantdao;
import ma.ensat.model.etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACHAHBAR
 */
@Service
public class serviceetudiantImp implements serviceetudiant {

    @Autowired
    etudiantdao dao;
    
    @Override
    public int createEtudiant(etudiant etd) {
        return dao.createEtudiant(etd);
    }

    @Override
    public List<etudiant> getAll() {
        return dao.getAll();
    }

    @Override
    public etudiant getById(int id) {
        return dao.getById(id);
    }

    @Override
    public int editEtudiant(etudiant etd) {
        return dao.editEtudiant(etd);
    }

    @Override
    public int removeEtudiant(int id) {
        return dao.removeEtudiant(id);
    }

    @Override
    public int removeEtudiant(etudiant etd) {
        return dao.removeEtudiant(etd);
    }
    
}
