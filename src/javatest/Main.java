package javatest;

/**
 * Created by brahim on 11/3/16.
 */
public class Main {
    public static void main(String[] args) {
        Compte a = new Compte();
        Compte b = new Compte();
        System.out.println("le sold est "+a.getSold());
        a.depot(500);
        System.out.println("le sold est "+a.getSold());
        System.out.println("le id do compte est  "+a.getIdcompte());
        a.retrait(20);
        System.out.println("le id do compte est  "+a.getSold());
        a.calcultaux(5);
        System.out.println("le id do compte est  "+a.getSold());
    }
}
