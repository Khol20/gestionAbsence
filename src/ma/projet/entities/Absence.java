/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entities;

import java.lang.annotation.Native;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author kholo
 */
@Entity
//@NamedNativeQuery(
//    name = "findAbsencesByEtudiantAndModule",
//    query = "SELECT * FROM Absence a WHERE a.etudiant = :etudiant AND a.module = :module",
//    resultClass = Absence.class
//)
public class Absence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Temporal(TemporalType.DATE)
    private Date dateAbsence;
    private String motif;
    private String justifiee;
    @ManyToOne
    private Etudiant etudiant;

    public Absence() {
    }

    public Absence(Date dateAbsence, String motif, String justifiee) {
        this.dateAbsence = dateAbsence;
        this.motif = motif;
        this.justifiee = justifiee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateAbsence() {
        return dateAbsence;
    }

    public void setDateAbsence(Date dateAbsence) {
        this.dateAbsence = dateAbsence;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getJustifiee() {
        return justifiee;
    }

    public void setJustifiee(String justifiee) {
        this.justifiee = justifiee;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    
    
            
    
    
}
