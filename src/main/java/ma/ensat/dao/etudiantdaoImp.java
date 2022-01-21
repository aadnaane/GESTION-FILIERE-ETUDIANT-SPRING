/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.ensat.dao;

import java.util.ArrayList;
import java.util.List;
import ma.ensat.model.etudiant;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ACHAHBAR
 */
@Repository
public class etudiantdaoImp implements etudiantdao {
    private Transaction Tx = null;
    private Session S = null;
    @Override
    public int createEtudiant(etudiant etd) {
        try {
            S = HibrenateUtil.getSessionFactory().openSession();
            Tx = S.beginTransaction();
            S.saveOrUpdate(etd);
            Tx.commit();
            System.out.println("Add OK");
            return 1;
        } catch(Exception e) {
            Tx.rollback();
            System.out.println(e.getMessage());
            return -1;
        }
    }

    @Override
    public List<etudiant> getAll() {
        List<etudiant> liste = new ArrayList<etudiant>();
        try {
            S = HibrenateUtil.getSessionFactory().openSession();
            Tx = S.beginTransaction();
            liste = S.createQuery("from etudiant").list();
            System.out.println("got them students");
            for (etudiant etd : liste) {
                System.out.println("code: " + etd.getIdetudiant());
            }
        } catch(Exception e) {System.out.println(e.getMessage());}
        return liste;
        
    }

    @Override
    public etudiant getById(int id) {
        etudiant etd = new etudiant();
        try {
            S = HibrenateUtil.getSessionFactory().openSession();
            Tx = S.beginTransaction();
            etd = (etudiant)S.get(etudiant.class, id);
            System.out.println("fetched " + etd.getIdetudiant());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return etd;
    }

    @Override
    public int editEtudiant(etudiant etd) {
        try {
            S = HibrenateUtil.getSessionFactory().openSession();
            Tx = S.beginTransaction();
            S.saveOrUpdate(etd);
            Tx.commit();
            System.out.println("Add OK");
            return 1;
        } catch(Exception e) {
            Tx.rollback();
            System.out.println(e.getMessage());
            return -1;
        }
    }

    @Override
    public int removeEtudiant(int id) {
        try {
            etudiant etd = new etudiant();
            S = HibrenateUtil.getSessionFactory().openSession();
            Tx = S.beginTransaction();
            etd = (etudiant) S.get(etudiant.class, id);
            S.remove(etd);
            Tx.commit();
            System.out.println("removed " + etd.getIdetudiant());
            return 1;
        } catch(Exception e) {
            Tx.rollback();
            System.out.println(e.getMessage());
            return -1;
        }
    }

    @Override
    public int removeEtudiant(etudiant etd) {
       try {
            S = HibrenateUtil.getSessionFactory().openSession();
            Tx = S.beginTransaction();
            S.remove(etd);
            Tx.commit();
            System.out.println("Add OK");
            return 1;
        } catch(Exception e) {
            Tx.rollback();
            System.out.println(e.getMessage());
            return -1;
        }
    }
    
}
