/**
 * Nom de la classe : Film
 * Description      : sous classe de produit qui permet de contenir les informations importantes d'un film tel que sa durée
 * @version         : 1.0
 * Date             : 30/01/2021
 * @Copyright       : Olivier Vigneault
 */

public class Film extends Produits {
    private int duree;

    /**
     * construit une instance de Film avec les informations nécessaires
     * @param titreFilm titre du film
     * @param auteurFilm auteur du film
     * @param dureeFilm durée du film
     * @param prixFilm prix du fillm
     */
    Film(String titreFilm, String auteurFilm, int dureeFilm, double prixFilm)
    {
        super(titreFilm, auteurFilm, prixFilm);
        setDuree(dureeFilm);
    }

    /**
     * retourne la durée du film
     * @return durée du film
     */
    public int getDuree() {
        return duree;
    }

    /**
     * modifie la durée totale du film
     * @param duree durée du film
     */
    public void setDuree(int duree) {
        this.duree = duree;
    }

    /**
     * affiche les informations relatives au film (infos propres au film)
     */
    public void printFilmInfo()
    {
        System.out.println("Durée : " + getDuree() + " minutes");
    }
}
