package se1app.applicationcore.bankaccount_component;

/**
 * Created by abw286 on 06.12.2016.
 *
 */
public interface BankAccountUseCaseInterface {

    public void transferMoney(Integer sourceAccountNr, Integer targetAccountNr, Integer money) throws BankAccountNotFoundException, BankAccountIsLowOnMoneyException;

}