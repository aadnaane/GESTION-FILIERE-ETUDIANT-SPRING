/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.ensat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author ACHAHBAR
 */
@Entity
public class etudiant {
    @Id
    @NotNull
    @Column(name="idetudiant")
    private int idetudiant;
    @Column(name="cne")
    private String cne;
    @Column(name="nom")
    private String nom;
    @Column(name="prenom")
    private String prenom;
    @Column(name="idfiliere")
    private int idfiliere;

    public etudiant() {
    }

    public etudiant(int idetudiant, String cne, String nom, String prenom, int idfiliere) {
        this.idetudiant = idetudiant;
        this.cne = cne;
        this.nom = nom;
        this.prenom = prenom;
        this.idfiliere = idfiliere;
    }

    public etudiant(int idetudiant) {
        this.idetudiant = idetudiant;
    }

    public int getIdetudiant() {
        return idetudiant;
    }

    public void setIdetudiant(int idetudiant) {
        this.idetudiant = idetudiant;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getIdfiliere() {
        return idfiliere;
    }

    public void setIdfiliere(int idfiliere) {
        this.idfiliere = idfiliere;
    }
    
    
}
