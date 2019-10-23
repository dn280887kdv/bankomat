/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankomat.pratsOfATM;

import bankomat.abstractClasses.Card;
import bankomat.currencysImpl.CurrencyEnumeration;
import bankomat.exeptions.MonitorException;
import bankomat.interfaces.Printable;
import bankomat.interfaces.Scrinable;

/**
 *
 * @author user
 */
public class Monitor implements Printable, Scrinable {

    private int width;
    private int height;

    public Monitor() {
    }

    public Monitor(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getSize() {
        return width;
    }

    public void setSize(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void init(int width, int height) {
        if ((width > 0 && width < 800) && (height > 0 && height <= 600)) {
            this.width = width;
            this.height = height;
        } else {
            try {
                throw new MonitorException();
            } catch (MonitorException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void print(Card card) {
        StringBuilder builder = new StringBuilder();
        builder.append("Баланс карты составляет: ").append(card.getBalance());
        System.out.println(builder.toString());
    }

    
    @Override
    public void view(int size, int hight, CurrencyEnumeration enumeration) {
        init(size, hight);
    }

}
