// VOUS POUVEZ MODIFIER CE FICHIER

import java.util.ArrayList;
import java.util.List;

public class Phrase {
    private Mot premier, dernier;
    private int nbMots;
    private List<Mot> liste;

    public Phrase() {
        // N'hésitez pas à modifier ce constructeur au besoin.
        // Vos changements seront automatiquement appliqués au constructeur ci-dessous.
        premier = dernier = null;
        nbMots = 0;
       liste = new ArrayList<Mot>();
    }

    public Phrase(String str) {
        // Cette fonction initialise la phrase en ajoutant chaque mot de 'str' un par un.
        // Vous devrez coder la méthode ajouter(Mot mot) pour que cela fonctionne.
        this();
        liste= new ArrayList<Mot>();
        String[] mots = str.split("\s");
        nbMots = mots.length;
        premier = new Mot(mots[0]);
        dernier = new Mot(mots[nbMots - 1]);
        for (String mot : mots ) {
            ajouter(new Mot(mot));
        }
    }

    public String toString(){
        String phrase = "";
        for (Mot mot : liste) {
            phrase += mot.toString() + " ";
        }
        return phrase;
    }
    public int getNbMots() {
        return nbMots;
    }

    public int getLongueur() {
        int longueur = 0;
        for (Mot mot : liste) {
            longueur += mot.toString().length();
        }
        int espace = liste.size();
        return longueur + espace;
    }

    public Mot getMot(int indexMot){
        if (indexMot < 0 || indexMot >= nbMots) {
            return null;
        }
        return liste.get(indexMot);
    }

    public char getLettre(int indexMot, int indexLettre) {
        if (indexMot < 0 || indexMot > nbMots) {
            return '0';
        }
        return liste.get(indexMot).getLettre(indexLettre);
    }

    public char getLettre(int indexLettre){
        if (indexLettre < 0 || indexLettre > this.toString().length()) {
            return '0';
        }
        return this.toString().charAt(indexLettre);
    }
    public void ajouter(char c){
        dernier.ajouter(c);
    }

    public void ajouter(String str) {
        ajouter(new Phrase(str));
    }

    public boolean inserer(String str, int indexMot) {
        return inserer(new Phrase(str), indexMot);
    }

    // AJOUTEZ VOTRE CODE CI-DESSOUS

    public void ajouter(Mot mot) {
        liste.add(mot);
        dernier = liste.get(liste.size() - 1);
        nbMots = liste.size();
    }

    public void ajouter(Phrase autre) {
        String[] mots = autre.toString().split("\s");
        for (String mot : mots ) {
            ajouter(new Mot(mot));
        }
    }

    public boolean inserer(char c, int indexMot, int indexLettre){
        if (indexMot < 0 || indexMot >= nbMots) {
            return false;
        }
        return liste.get(indexMot).inserer(c, indexLettre);
    }
    public boolean inserer(Mot mot, int indexMot){
        if (indexMot < 0 || indexMot > nbMots) {
            return false;
        }
        liste.add(indexMot, mot);
        premier = liste.get(0);
        dernier = liste.get(liste.size() - 1);
        nbMots = liste.size();
        return true;
    }

    public boolean inserer(Phrase autre, int indexMot) {
        if (indexMot < 0 || indexMot > nbMots) {
            return false;
        }
        String[] mots = autre.toString().split("\s");
        for (int i = 0; i <= liste.size(); i++) {
            if (i == indexMot){
                for (int j = 0; j < mots.length; j++) {
                    liste.add(indexMot + j, new Mot(mots[j]));
                }
                break;
            }
        }
        premier = liste.get(0);
        dernier = liste.get(liste.size() - 1);
        nbMots = liste.size();
        return true;
    }
}
