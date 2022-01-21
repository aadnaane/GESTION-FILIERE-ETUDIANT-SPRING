/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ma.ensat.dao;

import java.util.List;
import ma.ensat.model.filiere;

/**
 *
 * @author ACHAHBAR
 */
public interface filieredao {
    public int createfiliere(filiere fil);
    public List<filiere> getAll();
    public filiere getById(int id);
    public int editFiliere(filiere fil);
    public int removefiliere(int id);
    public int removefilire(filiere fil);
}
