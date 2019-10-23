/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankomat;

import bankomat.abstractClasses.Card;
import bankomat.interfaces.Printable;

/**
 *
 * @author user
 */
public class Journal implements Printable {

    private String massage;

    public Journal(String massage) {
        this.massage = massage;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    @Override
    public void print(Card card) {
        System.out.println("Cообщение - " + massage);
    }

}
