import java.util.Date;

public class Formateur extends Employe{
    private int heureSup;
    private double remunerationHSup;

    public double getRemunerationHSup() {
        return remunerationHSup;
    }

    public void setRemunerationHSup(double remunerationHSup) {
        this.remunerationHSup = remunerationHSup;
    }

    public Formateur(String nom, Date dateNaissance, Date dateEmbauche, double salaireBase, int heureSup, double remunerationHSup) {
        super(nom, dateNaissance, dateEmbauche, salaireBase);
        this.heureSup = heureSup;
        this.remunerationHSup = remunerationHSup;
    }

    public String toString(){
        return super.toString() + " le nombre des heures supplémentaires par mois est: " + heureSup + " la rémunération par heure supplémentaire est: " + remunerationHSup ;
    }
    public double SalaireAPayer(){
        double salaireNet = (getSalaireBase() + heureSup * remunerationHSup)* (1- IR.getIR(getSalaireBase()*12));
        return salaireNet;
    }



    @Override
    public Date dateRetraite(int ageRetraite) {
        return null;
    }
}
