/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankomat.pratsOfATM;

import bankomat.abstractClasses.Card;
import bankomat.currencysImpl.Currency;
import bankomat.interfaces.BankomatOperationable;
import java.util.List;

/**
 *
 * @author Denis
 */
public class Bankomat implements BankomatOperationable {

    @Override
    public void cashTaken(double sum, Card card, Currency currency) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double transferMoney(Card card, Card card2, double sum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double showBalance(Card card) {
        return card.getBalance();
    }

    @Override
    public void initBankomat(List<Casset> list, Monitor monitor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
