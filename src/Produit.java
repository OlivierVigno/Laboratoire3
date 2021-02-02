/**
 * Nom de la classe : Produits
 * Description      : superclasse englobant l'ensemble des produits vendus sur le site (Film, Livre, BandeDessinée, etc),
 *                    permettant de modifier et d'obtenir diverses informations sur ces produits
 * @version         : 1.0
 * Date             : 30/01/2021
 * @author          : Olivier Vigneault
 */

public class Produit {
    private String titre;
    private String auteur;
    private double prix;

    /**
     * construit une instance de Produits avec les informations nécessaires
     * @param titreProduit titre du produit
     * @param auteurProduit auteur du produit
     * @param prixProduit prix du produit
     */
    Produit(String titreProduit, String auteurProduit, double prixProduit)
    {
        titre = titreProduit;
        auteur = auteurProduit;
        prix = prixProduit;
    }

    /**
     * retourne le titre du produit
     * @return titre du produit
     */
    public String getTitre() {
        return titre;
    }

    /**
     * modifie le titre du produit
     * @param titre nouveau titre du produit
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * retourne l'auteur du produit
     * @return auteur du produit
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     * modifie l'auteur du produit
     * @param auteur nouvel auteur du produit
     */
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    /**
     * retourne le prix du produit
     * @return prix du produit
     */
    public double getPrix() {
        return prix;
    }

    /**
     * modifie le prix du produit
     * @param prix nouveau prix du produit
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

    /**
     * affiche les informations générales du produit
     */
    public void printInfo()
    {
        System.out.println("\nTitre : " + getTitre());
        System.out.println("Auteur : " + getAuteur());
        System.out.println("Prix : " + getPrix() + " $");
    }
}
