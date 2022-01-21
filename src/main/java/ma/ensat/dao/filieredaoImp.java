/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.ensat.dao;

import java.util.ArrayList;
import java.util.List;
import ma.ensat.model.filiere;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ACHAHBAR
 */
@Repository
public class filieredaoImp implements filieredao {

    private Transaction Tx = null;
    private Session S = null;
    
    @Override
    public int createfiliere(filiere fil) {
       
        try {
            S = HibrenateUtil.getSessionFactory().openSession();
            Tx = S.beginTransaction();
            S.saveOrUpdate(fil);
            Tx.commit();
            System.out.println("Add ok fil: " + fil.getCodefiliere());
            return 1;
        } catch(Exception e) {
            Tx.rollback();
            System.out.println(e.getMessage());
            return -1;
        }
    }

    @Override
    public List<filiere> getAll() {
        List<filiere> liste = new ArrayList<filiere>();
        try {
            S = HibrenateUtil.getSessionFactory().openSession();
            Tx = S.beginTransaction();
            liste = S.createQuery("from filiere").list();
            System.out.println("got them filieres");
            for (filiere fil : liste) {
                System.out.println("code: " + fil.getIdfiliere());
            }
        } catch(Exception e) {System.out.println(e.getMessage());}
        return liste;
    }

    @Override
    public filiere getById(int id) {
        filiere fil = new filiere();
        try {
            S = HibrenateUtil.getSessionFactory().openSession();
            Tx = S.beginTransaction();
            fil = (filiere)S.get(filiere.class, id);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return fil;
    }

    @Override
    public int editFiliere(filiere fil) {
        try {
            S = HibrenateUtil.getSessionFactory().openSession();
            Tx = S.beginTransaction();
            S.saveOrUpdate(fil);
            Tx.commit();
            System.out.println("Add ok fil: " + fil.getCodefiliere());
            return 1;
        } catch(Exception e) {
            Tx.rollback();
            System.out.println(e.getMessage());
            return -1;
        }
    }

    @Override
    public int removefiliere(int id) {
         try {
             filiere fil = new filiere();
            S = HibrenateUtil.getSessionFactory().openSession();
            Tx = S.beginTransaction();
            fil = (filiere) S.get(filiere.class, id);
            S.remove(fil);
            Tx.commit();
            System.out.println("rmove ok fil: " + fil.getCodefiliere());
            return 1;
        } catch(Exception e) {
            Tx.rollback();
            System.out.println(e.getMessage());
            return -1;
        }
    }

    @Override
    public int removefilire(filiere fil) {
          try {
            S = HibrenateUtil.getSessionFactory().openSession();
            Tx = S.beginTransaction();
            S.remove(fil);
            Tx.commit();
            System.out.println("remove ok fil: " + fil.getCodefiliere());
            return 1;
        } catch(Exception e) {
            Tx.rollback();
            System.out.println(e.getMessage());
            return -1;
        }
    }
    
}
