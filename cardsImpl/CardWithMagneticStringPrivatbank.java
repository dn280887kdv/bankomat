/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankomat.cardsImpl;

import bankomat.abstractClasses.CardMagnetic;
import java.util.Date;

/**
 *
 * @author user
 */
public class CardWithMagneticStringPrivatbank extends CardMagnetic {

    @Override
    public boolean checkMagneticString(String magneticString) {
        if (magneticString == null) {
            return false;
        } else {
            setMagneticString(magneticString);
            return true;
        }
    }

    @Override
    public boolean checkNumber(String number) {
        if (number == null) {
            return false;
        } else {
            setNumber(number);
            return true;
        }
    }

    @Override
    public boolean checkPinCode(String pinCode) {
        if (pinCode == null) {
            return false;
        } else {
            setPinCode(pinCode);
            return true;
        }
    }

    @Override
    public boolean checkCVV(String cvv) {
        if (cvv == null) {
            return false;
        } else {
            setCvv(cvv);
            return true;
        }
    }

    @Override
    public boolean checkDate(Date date) {
        if (date == null) {
            return false;
        } else {
            setDate(date);
            return true;
        }
    }

    @Override
    public boolean checkBalance(double balance) {
        if (balance < 0) {
            return false;
        } else {
            setBalance(balance);
            return true;
        }
    }
}
