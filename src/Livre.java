/**
 * Nom de la classe : Livre
 * Description      : sous classe de Produits qui contient les informations relatives aux livres, tel que l'éditeur
 *                    et le nombre de pages dans le livre
 * @version         : 1.0
 * Date             : 30/01/2021
 * @author          : Olivier Vigneault
 */

public class Livre extends Produits {
    private String editeur;
    private int nombrePages;

    /**
     * construit une instance de Livre avec les informations nécessaires envoyées en paramètre
     * @param titreLivre titre du livre
     * @param auteurLivre auteur du livre
     * @param editeurLivre editeur du livre
     * @param prixLivre prix du livre
     * @param nombrePagesLivre nombre de pages dans le livre
     */
    Livre(String titreLivre, String auteurLivre, String editeurLivre, double prixLivre, int nombrePagesLivre)
    {
        super(titreLivre, auteurLivre, prixLivre);
        editeur = editeurLivre;
        nombrePages = nombrePagesLivre;
    }

    /**
     * retourne le nom de l'éditeur du livre
     * @return nom de l'éditeur
     */
    public String getEditeur() {
        return editeur;
    }

    /**
     * modifie le nom de l'éditeur du livre
     * @param editeur nouveau nom de l'éditeur
     */
    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    /**
     * retourne le nombre de pages du livre
     * @return nombre de pages du livre
     */
    public int getNombrePages() {
        return nombrePages;
    }

    /**
     * modifie la valeur du nombre de pages dans le livre
     * @param nombrePages nouvelle valeur du nombre de pages
     */
    public void setNombrePages(int nombrePages) {
        this.nombrePages = nombrePages;
    }

    /**
     * affiche les informations relatives aux différents types de livre (editeur et nombre de pages)
     */
    public void printLivreInfo()
    {
        System.out.println("Editeur : " + getEditeur());
        System.out.println("Nombre de pages : " + getNombrePages());
    }
}
