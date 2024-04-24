package util;

import model.Card;
import model.DataBase;

import java.util.Scanner;

import static model.DataBase.cards;
import static model.DataBase.customers;

public class CardUtil {
    public static void createCard(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Musteri id-ni daxil ed: ");
        int idCustomer = scanner.nextInt();
        System.out.println("Kaetin 16reqemli kodu: ");
        String pam = scanner.next();
        System.out.println("cvv: ");
        String cvv = scanner.next();
        System.out.println("Son istifade tarixi: ");
        String expireDate = scanner.next();

        Card card = new Card(DataBase.cardLastindex,pam,cvv,expireDate,customers[idCustomer],false);
        DataBaseUtil.addCard(card);

    }

    public static void blockedCard(Boolean cardStatus){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Card id-ni daxil et: ");
        int idCard = scanner.nextInt();
        Card card = cards[idCard];
        card.setBlocked(cardStatus);
    }

    public static void printCards(){
        for(Card card : cards){
            if(card != null){
                System.out.println(card);
            }
        }
    }


}
