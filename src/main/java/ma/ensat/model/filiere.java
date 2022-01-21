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
public class filiere {
    @Id
    @NotNull
    @Column(name="idfiliere")
    private int idfiliere;
    @Column(name="codefiliere")
    private String codefiliere;
    @Column(name="designation")
    private String designation;

    public filiere() {
    }

    
    
    public filiere(int idfiliere, String codefiliere, String designation) {
        this.idfiliere = idfiliere;
        this.codefiliere = codefiliere;
        this.designation = designation;
    }

    
    
    public int getIdfiliere() {
        return idfiliere;
    }

    public void setIdfiliere(int idfiliere) {
        this.idfiliere = idfiliere;
    }

    public String getCodefiliere() {
        return codefiliere;
    }

    public void setCodefiliere(String codefiliere) {
        this.codefiliere = codefiliere;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    
}
