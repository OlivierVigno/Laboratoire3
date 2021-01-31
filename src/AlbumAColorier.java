/**
 * Nom de la classe : AlbumAColorier
 * Description      : sousclasse de la superclasse Livre, présente uniquement à titre informatif puisqu'aucune
 *                    différence réelle avec la classe Livre
 * @version         : 1.0
 * Date             : 30/01/2021
 * @Copyright       : Olivier Vigneault
 */

public class AlbumAColorier extends Livre {
    AlbumAColorier(String titreLivre, String auteurLivre, String editeurLivre, double prixLivre, int nombrePagesLivre) {
        super(titreLivre, auteurLivre, editeurLivre, prixLivre, nombrePagesLivre);
    }
}
