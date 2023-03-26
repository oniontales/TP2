// VOUS POUVEZ MODIFIER CE FICHIER

import java.util.List;

public class Phrase {
    private Mot premier, dernier;
    private int nbMots;
    private List<String> liste;

    public Phrase() {
        // N'hésitez pas à modifier ce constructeur au besoin.
        // Vos changements seront automatiquement appliqués au constructeur ci-dessous.
        premier = dernier = null;
        nbMots = 0;
    }

    public Phrase(String str) {
        // Cette fonction initialise la phrase en ajoutant chaque mot de 'str' un par un.
        // Vous devrez coder la méthode ajouter(Mot mot) pour que cela fonctionne.
        this();
        String[] mots = str.split("\s");
        nbMots = mots.length;
        premier = new Mot(mots[0]);
        dernier = new Mot(mots[nbMots - 1]);
        for (String mot : mots ) {
            ajouter(new Mot(mot));
            liste.add(mot);
        }
    }

    public String toString(){
        String phrase = "";
        for (String mot : liste) {
            phrase += mot + " ";
        }
        return phrase;
    }

    public void ajouter(String str) {
        ajouter(new Phrase(str));
    }

    public boolean inserer(String str, int indexMot) {
        return inserer(new Phrase(str), indexMot);
    }

    // AJOUTEZ VOTRE CODE CI-DESSOUS

    public void ajouter(Mot mot) {
        // Codez-moi!
    }

    public void ajouter(Phrase autre) {
        // Codez-moi!
    }

    public boolean inserer(Phrase autre, int indexMot) {
        // Codez-moi!
        return true;
    }
}
