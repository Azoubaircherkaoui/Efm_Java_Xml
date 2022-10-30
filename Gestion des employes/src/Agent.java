import java.util.Date;

public class Agent extends Employe{

    private double primeResponsabilite;

    public double getPrimeResponsabilite() {
        return primeResponsabilite;
    }

    public void setPrimeResponsabilite(double primeResponsabilite) {
        this.primeResponsabilite = primeResponsabilite;
    }

    public Agent(String nom, Date dateNaissance, Date dateEmbauche, double salaireBase, double primeResponsabilite) {
        super(nom, dateNaissance, dateEmbauche, salaireBase);
        this.primeResponsabilite = primeResponsabilite;
    }

    public double SalaireAPayer(){
        double SalaireNet = (getSalaireBase() + primeResponsabilite) * (1- IR.getIR(getSalaireBase()*12));
        return SalaireNet;
    }




    @Override
    public Date dateRetraite(int ageRetraite) {
        return null;
    }
}
