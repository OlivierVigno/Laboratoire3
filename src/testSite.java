/**
 * Nom de la classe : testSite
 * Description      : classe de test, qui crée des utilisateurs, des produits et simule diverses intéractions entre les utilisateurs et les produits (achats et échange)
 * @version         : 1.0
 * Date             : 30/01/2021
 * @Copyright       : Olivier Vigneault
 */
public class testSite {
    public static void main(String[] args)
    {
        BandeDessinee bd = new BandeDessinee("Tintin au pays des soviets", "Hergé", "Casterman", 27.95, 144, "en couleur");
        BandeDessinee bd2 = new BandeDessinee("On a marché sur la lune", "Hergé", "Casterman", 27.95, 115, "en noir et blanc");

        AlbumAColorier album = new AlbumAColorier("Livre de coloriage pour adultes Loups 1", "Nick Snels", "ColoringArtist.com", 11.39, 50);
        AlbumAColorier album2 = new AlbumAColorier("Color Therapy: Énergie", "Collectif", "Marabout", 8.95, 40);

        Film film = new Film("Forrest Gump", "Robert Zemeckis", 142, 8.99);
        Film film1 = new Film("The Matrix", "Les Wachowski", 130, 14.99);

        user user1 = new user(100);
        user user2 = new user(75);

        System.out.println("Balance initial utilisateur 1 : " + user1.getBalance() + " $");
        System.out.println("Balance initial utilisateur 2 : " + user2.getBalance() + " $\n");

        user1.buyProduit(bd);
        System.out.println("utilisateur 1 achète un 1e livre...");
        System.out.println("Balance utilisateur 1 : " + user1.getBalance() + " $");

        user1.buyProduit(album);
        System.out.println("utilisateur 1 achète un 2e livre...");
        System.out.println("Balance utilisateur 1 : " + user1.getBalance() + " $");

        user1.buyProduit(film);
        System.out.println("utilisateur 1 achète un 1e film...");
        System.out.println("Balance utilisateur 1 : " + user1.getBalance() + " $\n");

        user2.buyProduit(bd2);
        System.out.println("utilisateur 2 achète un 1e livre...");
        System.out.println("Balance utilisateur 2 : " + user2.getBalance() + " $");

        user2.buyProduit(album2);
        System.out.println("utilisateur 2 achète un 2e livre...");
        System.out.println("Balance utilisateur 2 : " + user2.getBalance() + " $");

        user2.buyProduit(film1);
        System.out.println("utilisateur 2 achète un 1e film...");
        System.out.println("Balance utilisateur 2 : " + user2.getBalance() + " $\n");

        System.out.println("\nProduits de l'utilisateur 1 : ");
        user1.printProduitsInfo();
        System.out.println("\nProduits de l'utilisateur 2 : ");
        user2.printProduitsInfo();

        //Swap des bandes dessinées entre les 2 utilisateurs
        if (user1.getProduit(0) instanceof BandeDessinee && user2.getProduit(0) instanceof BandeDessinee &&
                user1.getProduit(0).getPrix() == user2.getProduit(0).getPrix())
        {
            BandeDessinee livreTemp = new BandeDessinee((BandeDessinee) user1.swapBD((Livre) user1.getProduit(0),(Livre) user2.getProduit(0)));
            user2.swapBD((Livre) user2.getProduit(0), livreTemp);
        }
        else
        {
            System.out.println("\nvous ne pouvez pas échanger ces livres puisque ce ne sont pas des bandes dessinées et/ou que le prix des bandes dessinées n'est pas le même.");
        }

        //affichage de l'inventaire de chaque utilisateur après l'échange
        System.out.println("\nProduits de l'utilisateur 1 après swap : ");
        user1.printProduitsInfo();
        System.out.println("\nProduits de l'utilisateur 2 après swap : ");
        user2.printProduitsInfo();

    }
}
