/**
 * sous classe de Livre qui contient les informations importantes d'une bande dessinée (en couleur ou en noir et blanc)
 */
public class BandeDessinee extends Livre
{
    private boolean couleur;

    /**
     * copieur de BandeDessinee, crée une instance de BandeDessinee identique à la Bande dessinee envoyée en paramètre
     * @param BD instance de BandeDessinee
     */
    BandeDessinee(BandeDessinee BD)
    {
        super(BD.getTitre(), BD.getAuteur(), BD.getEditeur(), BD.getPrix(), BD.getNombrePages());
        setCouleur(BD.isCouleur());
    }

    /**
     * construit une instance de BandeDessinee avec toutes les informations nécessaires envoyées en paramètre
     * @param titreLivre titre du livre
     * @param auteurLivre auteur du livre
     * @param editeurLivre editeur du livre
     * @param prixLivre prix du livre
     * @param nombrePagesLivre nombre de pages dans le livre
     * @param couleurLivre livre en couleur ou non
     */
    BandeDessinee(String titreLivre, String auteurLivre, String editeurLivre, double prixLivre, int nombrePagesLivre, boolean couleurLivre) {
        super(titreLivre, auteurLivre, editeurLivre, prixLivre, nombrePagesLivre);
        setCouleur(couleurLivre);
    }

    /**
     * retourne la valeur de couleur, à savoir si c'est une Bande dessinée en couleur ou en noir et blanc
     * @return la valeur du boolean couleur
     */
    public boolean isCouleur() {
        return couleur;
    }

    /**
     * modifie la valeur du boolean couleur avec la valeur envoyée en paramètre
     * @param couleur nouvel valeur du boolean couleur
     */
    public void setCouleur(boolean couleur) {
        this.couleur = couleur;
    }

    /**
     * affiche les informations relatives uniquement au bande dessinée (couleur ou non)
     */
    public void printBDinfo()
    {
        if (couleur)
            System.out.println("En couleur : oui");
        else
            System.out.println("En couleur : non");
    }
}
