public class BandeDessineeCouleur extends BandeDessinee {

    public BandeDessineeCouleur(BandeDessinee BD) {
        super(BD);
    }

    public BandeDessineeCouleur(String titreLivre, String auteurLivre, String editeurLivre, double prixLivre, int nombrePagesLivre) {
        super(titreLivre, auteurLivre, editeurLivre, prixLivre, nombrePagesLivre);
    }
}
