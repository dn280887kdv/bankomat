/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankomat.enumerations;

/**
 *
 * @author user
 */
public enum CurrencyEnumeration {
    UAH {
        public void init() {
            name = "grivna";
            code = 980;
            denominations = new int[]{1, 2, 5, 10, 20, 50, 100, 200, 500};
        }
    },
    USD {
        public void init() {
            name = "dollar";
            code = 940;
            denominations = new int[]{1, 2, 5, 10, 20, 50, 100};
        }
    },
    EUR {
        public void init() {
            name = "evro";
            code = 978;
            denominations = new int[]{1, 2, 5, 10, 20, 50, 100};
        }
    };

    private static int countOfCurrency;
    private static String name;
    private static int code;
    private static int[] denominations;

    public int getCountOfCurrency() {
        return countOfCurrency;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public int[] getDenominations() {
        return denominations;
    }

    public abstract void init();

}
