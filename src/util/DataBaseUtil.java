package util;

import model.Card;
import model.Customer;
import model.DataBase;

public class DataBaseUtil {
    public static void addCostumer(Customer costumer){
        DataBase.customers[(DataBase.customerLastindex++).intValue()] = costumer;
    }
    public static void addCard(Card card){
        DataBase.cards[(DataBase.cardLastindex++).intValue()] = card;
    }
}
