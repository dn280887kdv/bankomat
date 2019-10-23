/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankomat.pratsOfATM;

import bankomat.abstractClasses.Card;
import bankomat.interfaces.Printable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Denis
 */
public class Printer implements Printable {

    @Override
    public void print(Card card) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");
        StringBuilder builder = new StringBuilder("Текущая дата: ");
        builder.append(dateFormat.format(date)).append("\n").append(builder);
        System.out.println(builder.toString());
    }

}
