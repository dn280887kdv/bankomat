/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankomat.interfaces;

import bankomat.abstractClasses.Card;
import bankomat.currencysImpl.Currency;
import bankomat.pratsOfATM.Casset;
import bankomat.pratsOfATM.Monitor;
import java.util.List;

/**
 *
 * @author Denis
 */
public interface BankomatOperationable {

    void cashTaken(double sum, Card card, Currency currency);

    double transferMoney(Card card, Card card2, double sum);

    double showBalance(Card card);

    void initBankomat(List<Casset> list, Monitor monitor);

}
