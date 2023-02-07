
import java.util.*;

/**
 * @author ABADLI Badreddine
 */
public interface InterfaceModèleMorpion extends Sujet {
    public Symbole grille();
    public Coup coupPropose();
    public int dimensionGrille();
    public void joueCoup();
    public bool coupValide();
    public void enregistreCoupPropose(int ligne, int colonne);
    public Joueur joueurActif();
    public void changeJoueurActif();
    public bool partieFinie();
}