import util.CardUtil;
import util.CustomerUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            Menu.printMenu();
            System.out.println("Seciminizi edin: ");
            int option = scanner.nextInt();
            operateOption(option);
        }
    }
    private static void operateOption(int option){
        switch (option){
            case 1: CustomerUtil.createCustomer();break;
            case 2: CustomerUtil.deleteCostumer();break;
            case 3: CustomerUtil.printCostumers();break;
            case 4: CardUtil.createCard();break;
            case 5: CardUtil.printCards();break;
            case 6: CardUtil.blockedCard(true);break;
            case 7: CardUtil.blockedCard(false);break;
            case 8: System.exit(0);break;


        }
    }
}