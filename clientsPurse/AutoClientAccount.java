/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankomat.clientsPurse;

import bankomat.abstractClasses.Card;
import bankomat.cardsImpl.CardWithMagneticStringPrivatbank;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Denis
 */
public class AutoClientAccount {

    public List<Card> autoInitCards() {
        
        List<Card> list = new ArrayList<Card>();
        
        CardWithMagneticStringPrivatbank card1 = new CardWithMagneticStringPrivatbank();
        card1.setBalance(500);
        card1.setCvv("111");
        card1.setDate(new Date(01/12/2021));
        card1.setMagneticString("Купцов Денис");
        card1.setNumber("1111222233334444");
        card1.setPinCode("1234");
        list.add(card1);
        
        CardWithMagneticStringPrivatbank card2 = new CardWithMagneticStringPrivatbank();
        card2.setBalance(2000);
        card2.setCvv("111");
        card2.setDate(new Date(01/12/2021));
        card2.setMagneticString("Купцов Денис");
        card2.setNumber("4444333322221111");
        card2.setPinCode("1234");
        list.add(card2);

        return list;
    }
}
