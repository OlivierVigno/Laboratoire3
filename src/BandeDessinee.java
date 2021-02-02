/**
 * Nom de la classe : BandeDessinee
 * Description      : sous classe de Livre qui contient les informations importantes d'une bande dessinée
 *                    (en couleur ou en noir et blanc)
 * @version         : 1.0
 * Date             : 30/01/2021
 * @author          : Olivier Vigneault
 */

public class BandeDessinee extends Livre
{
    /**
     * copieur de BandeDessinee, crée une instance de BandeDessinee identique à la Bande dessinee envoyée en paramètre
     * @param BD instance de BandeDessinee
     */
    BandeDessinee(BandeDessinee BD)
    {
        super(BD.getTitre(), BD.getAuteur(), BD.getEditeur(), BD.getPrix(), BD.getNombrePages());
    }

    /**
     * construit une instance de BandeDessinee avec toutes les informations nécessaires envoyées en paramètre
     * @param titreLivre titre du livre
     * @param auteurLivre auteur du livre
     * @param editeurLivre editeur du livre
     * @param prixLivre prix du livre
     * @param nombrePagesLivre nombre de pages dans le livre
     */
    BandeDessinee(String titreLivre, String auteurLivre, String editeurLivre, double prixLivre, int nombrePagesLivre) {
        super(titreLivre, auteurLivre, editeurLivre, prixLivre, nombrePagesLivre);
    }
}
