package javatest;

/**
 * Created by brahim on 11/3/16.
 */
public class Compte {
    private double idcompte,sold,taux;
    public Compte(){
        this.idcompte = 0;
        this.sold=0;
    }
    public double getIdcompte() {
        return idcompte++;
    }



    public void depot(double valeur){
        sold += valeur;
    }
    public void retrait(double valeur){
        sold -= valeur;
    }

    public void calcultaux(int taux) {
        sold = sold - (sold * taux * 0.01);
    }
    public double getSold() {
        return sold;
    }
}
