import jdk.jfr.Timespan;
import java.util.Date;

import javax.print.attribute.standard.DateTimeAtProcessing;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

public abstract class Employe implements IEmploye {
    private int mtle;
    private String nom;
    private Date dateNaissance;
    private Date dateEmbauche;
    private double salaireBase;
    private static int compteur;


    public int getMtle() {
        return mtle;
    }

    public void setMtle(int mtle) {
        this.mtle = mtle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche=dateEmbauche;
    }

    public double getSalaireBase() {
        return salaireBase;
    }

    public void setSalaireBase(double salaireBase) {
        this.salaireBase = salaireBase;
    }

    public Employe(String nom, Date dateNaissance, Date dateEmbauche, double salaireBase) {
        this.mtle = compteur++;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.dateEmbauche = dateEmbauche;
        this.salaireBase = salaireBase;
    }
    public Employe() {
        compteur++;
        this.nom = "";
        this.salaireBase = 0;
    }
    public abstract double SalaireAPayer();
    public Date age(){
        return dateNaissance;
    }
    public Date anciennete(){
        return dateEmbauche;
    }
    public Date dateRetraite(Date ageRetraite){
        Date de =dateNaissance;
        return de;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "mtle=" + mtle +
                ", nom='" + nom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", dateEmbauche=" + dateEmbauche +
                ", salaireBase=" + salaireBase +
                '}';
    }
    public boolean equals(Object o){
        Employe emp = (Employe) o;
        if (emp.getMtle() == this.mtle){
            return true;
        }else {
            return false;
        }
    }


}
