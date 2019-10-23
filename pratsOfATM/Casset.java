/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankomat.pratsOfATM;

import bankomat.currencysImpl.CurrencyEnumeration;
import bankomat.exeptions.CassetException;
import bankomat.interfaces.Cassetable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Denis
 */
public class Casset implements Cassetable {

    private CurrencyEnumeration curr;          //валюта
    private List<Integer> denominations;     //номиналы купюр
    private int count;
    Map<Integer, Integer> countOfdenominations;
    private int denomination;
    private int cash;

    public Casset() {
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public CurrencyEnumeration getCurr() {
        return curr;
    }

    public void setCurr(CurrencyEnumeration curr) {
        this.curr = curr;
    }

    public List getDenominations() {
        return denominations;
    }

    public void setDenominations(List denominations) {
        this.denominations = denominations;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void autoInitCasset() {
        curr = CurrencyEnumeration.UAH;
        curr.init();
    }

    @Override
    public void initCasset() {
        System.out.print("1.UAH\n2.USD\n3.EUR\nВыберите номер валюты для загрузки кассеты: ");
        Scanner scanner = new Scanner(System.in);
        countOfdenominations = new HashMap<Integer, Integer>();
        switch (scanner.nextInt()) {
            case (1):
                curr = CurrencyEnumeration.UAH;
                System.out.println("Выбрана гривна для загрузки\n");
                break;
            case (2):
                curr = CurrencyEnumeration.USD;
                System.out.println("Выбран доллар для загрузки\n");
                break;
            case (3):
                curr = CurrencyEnumeration.EUR;
                System.out.println("Выбрано евро для загрузки\n");
                break;
            default:
                try {
                    throw new CassetException("Выбранной валюты не существует\n");
                } catch (CassetException ex) {
                    ex.getMessage();
                }
                break;
        }
        curr.init();
        cash = 0;
        while (true) {
            System.out.println("Введите количество купюр и номинал для загрузки. \nДоступные для загрузки номиналы: ");
            for (Integer o : curr.getDenominations()) {
                System.out.print(o + "; ");
            }
            System.out.println("\n");
            int temp = scanner.nextInt();

            exitlabel:
            while (denomination != temp) {
                for (Integer o : curr.getDenominations()) {
                    if (temp == o) {
                        denomination = o;
                        break exitlabel;
                    }
                }
                System.out.println("Ошибка ввода, повторите попытку: ");
                temp = scanner.nextInt();
            }

            System.out.print("Количество купюр: ");
            temp = scanner.nextInt();
            if (temp > 0) {
                count = temp;
            }
            countOfdenominations.put(denomination, count);
            cash += denomination * count;
            System.out.print("1.Да\n2.Нет\nДобавить еще купюры? ");
            if (scanner.nextInt() == 2) {
                break;
            }
        }
        System.out.println("cash = " + cash);
    }

    @Override
    public void cassetEmptyInforming() {
        try {
            throw new CassetException("В кассете закончились купюры");
        } catch (CassetException ex) {
            ex.getMessage();
        }
    }

    @Override
    public void giveCash(Map<Integer, Integer> cashDenominations) {
        for (Map.Entry<Integer, Integer> entry : countOfdenominations.entrySet()) {
            for (Map.Entry<Integer, Integer> entryCash : cashDenominations.entrySet()) {
                if (entry.getKey().equals(entryCash.getKey())) {
                    cash = entry.getValue() - entryCash.getValue();
                    countOfdenominations.put(entry.getKey(), cash);
                }
            }
        }
    }

    @Override
    public List<Casset> getCassetList() {
        List<Casset> list = new ArrayList<Casset>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Casset casset = new Casset();
            casset.initCasset();
            list.add(casset);

            System.out.print("1.Да\n2.Нет\nДобавить еще кассету? ");
            if (scanner.nextInt() == 2) {
                break;
            }
        }
        return list;
    }
}
