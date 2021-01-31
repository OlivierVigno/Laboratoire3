/**
 * sousclasse de la superclasse Livre, présente uniquement à titre informatif puisqu'aucune différence réelle avec Livre
 */
public class AlbumAColorier extends Livre {
    AlbumAColorier(String titreLivre, String auteurLivre, String editeurLivre, double prixLivre, int nombrePagesLivre) {
        super(titreLivre, auteurLivre, editeurLivre, prixLivre, nombrePagesLivre);
    }
}
