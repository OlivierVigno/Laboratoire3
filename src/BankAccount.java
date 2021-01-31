/**
 * Nom de la classe : BankAccount
 * Description      : gère un compte de banque avec une certaine balance qu'il est possible de modifier
 * @version         : 1.0
 * Date             : 30/01/2021
 * @Copyright       : Olivier Vigneault
 */

public class BankAccount {
    private double balance;

    /**
     * construit une instance de BankAccount avec une valeur de balance envoyé en paramètre
     * @param balanceValue valeur de la balance du compte
     */
    BankAccount(double balanceValue)
    {
        balance = balanceValue;
    }

    /**
     * dépose un certain montant dans le compte
     * @param DepositValue valeur du montant à déposer
     */
    public void deposit(double DepositValue)
    {
        balance += DepositValue;
    }

    /**
     * retire un certain montant dans le compte
     * @param WithdrawValue valeur du montant à retirer
     */
    public void withdraw(double WithdrawValue)
    {
        balance -= WithdrawValue;
    }

    /**
     * retourne la valeur de la balance du compte
     * @return la valeur de la balance
     */
    public double getBalance()
    {
        return balance;
    }
}
