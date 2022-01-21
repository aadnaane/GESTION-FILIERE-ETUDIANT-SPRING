/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ma.ensat.dao;

import java.util.List;
import ma.ensat.model.etudiant;

/**
 *
 * @author ACHAHBAR
 */
public interface etudiantdao {
    public int createEtudiant(etudiant etd);
    public List<etudiant> getAll();
    public etudiant getById(int id);
    public int editEtudiant(etudiant etd);
    public int removeEtudiant(int id);
    public int removeEtudiant(etudiant etd);
    
}
