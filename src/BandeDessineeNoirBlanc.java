public class BandeDessineeNoirBlanc extends BandeDessinee {

    public BandeDessineeNoirBlanc(BandeDessinee BD) {
        super(BD);
    }

    public BandeDessineeNoirBlanc(String titreLivre, String auteurLivre, String editeurLivre, double prixLivre, int nombrePagesLivre) {
        super(titreLivre, auteurLivre, editeurLivre, prixLivre, nombrePagesLivre);
    }
}
