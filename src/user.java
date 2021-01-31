/**
 * Nom de la classe : user
 * Description      : utilisateur qui peut acheter, vendre et échanger des produits avec son compte en banque
 * @version         : 1.0
 * Date             : 30/01/2021
 * @author          : Olivier Vigneault
 */

import java.util. ArrayList;

public class user {
    private ArrayList<Produits> produits;
    private BankAccount compte;

    /**
    construit un utilisateur avec une liste de produit vide.
    @param funds balance de l'utilisateur sur le site
     */
    user(double funds)
    {
        compte = new BankAccount(funds);
        produits = new ArrayList<Produits>();
    }

    /**
     * ajoute le produit de la liste de produit possédé par l'utilisateur
     * @param produitAchat produit qui a été acheté par l'utilisateur
     */
    public void buyProduit(Produits produitAchat)
    {
        compte.withdraw(produitAchat.getPrix());
        produits.add(produitAchat);
    }

    /**
     * retire le produit de la liste des produits possédés par l'utilisateur
     * @param produitVente produit qui a été vendu par l'utilisateur
     */
    public void sellProduit(Produits produitVente)
    {
        compte.deposit(produitVente.getPrix());
        produits.remove(produitVente);
    }

    /**
     * échange un livre faisant partie de la liste des produits de l'utilisateur avec un produit de même valeur n'étant
     * pas posséder par l'utilisateur
     * @param BDPossédé Bande dessinée qui appartient à l'utilisateur
     * @param nouvelleBD Bande dessinée qui sera ajoutée à la liste de l'utilisateur
     * @return une référence à la Bande dessinée qui a été retirée de la liste de l'utilisateur
     */
    public Livre swapBD(Livre BDPossédé, Livre nouvelleBD)
    {
        Livre temp;
        temp = BDPossédé;

        produits.remove(BDPossédé);
        produits.add(nouvelleBD);

        return temp;
    }

    /**
     * récupère le produit dans la liste qui correspond à la position envoyée en paramètre
     * @param position position du produit recherché
     * @return l'objet Produits correspondant au produit recherché
     */
    public Produits getProduit(int position)
    {

        return produits.get(position);
    }

    /**
     * affiche les informations des produits possédés par l'utilisateur
     */
    public void printProduitsInfo()
    {
        for (Produits produit : produits) {
            produit.printInfo();
            if (produit instanceof Livre) {
                Livre livre = (Livre) produit;
                livre.printLivreInfo();
                if (produit instanceof BandeDessinee) {
                    BandeDessinee BD = (BandeDessinee) produit;
                    BD.printBDinfo();
                }
            } else if (produit instanceof Film) {
                Film film = (Film) produit;
                film.printFilmInfo();
            }
        }
    }

    /**
     * envoie la valeur de la balance de l'utilisateur
     * @return valeur de la balance
     */
    public double getBalance() {
        return compte.getBalance();
    }
}
