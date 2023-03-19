// VOUS POUVEZ MODIFIER CE FICHIER
import java.util.Vector;

public class Mot {
    private Vector lettres;
    private int nbLettres;

    public Mot suivant = null;

    public Mot() {
        lettres = new Vector();
        nbLettres = 0;
    }

    public Mot(String str) {
        assert str.indexOf(' ') == -1 : "Un mot ne peut contenir d'espaces";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            lettres.add(c);
        }

        nbLettres = str.length();
    }

    // AJOUTEZ VOTRE CODE CI-DESSOUS


    public String toString(){
        String word = "";
        for (int i = 0; i < lettres.size(); i++) {
            char c = (char) lettres.get(i);
            word += c;
        }
        return word;
    }

    public int getLongueur(){
        return nbLettres;
    }

    public char getLettre(int index){
        if (index < 0 || index >= nbLettres) {
            return '0';
        }
        return (char) lettres.get(index);
    }

    public void ajouter(char lettre){
        int currentSize = lettres.size();
        int newSize = currentSize * 2 + 1;
        while (newSize > lettres.capacity()) {
            lettres.ensureCapacity(lettres.capacity() * 2);
        }
        lettres.add(lettre);
        nbLettres += 1;
        lettres.trimToSize();
    }



    public boolean inserer(char lettre, int index){
        if (index < 0 || index >= nbLettres) {
            return false;
        }
        int currentSize = lettres.size();
        int newSize = currentSize * 2 + 1;
        while (newSize > lettres.capacity()) {
            lettres.ensureCapacity(lettres.capacity() * 2);
        }
        lettres.add(index, lettre);
        nbLettres += 1;
        lettres.trimToSize();
        return true;
    }





















}
