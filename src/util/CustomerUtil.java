package util;

import model.Customer;
import model.DataBase;

import java.util.Scanner;

public class CustomerUtil {
    public static void createCustomer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ad: ");
        String name = scanner.next();
        System.out.println("Soy ad: ");
        String surname = scanner.next();
        System.out.println("Dogum tarixi: ");
        String birthDate = scanner.next();
        Customer customer = new Customer(DataBase.customerLastindex,name,surname,birthDate,true);
        DataBaseUtil.addCostumer(customer);
    }

    public static void deleteCostumer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Musterinin id-ni daxil et: ");
        int id = scanner.nextInt();
        Customer costumer = DataBase.customers[id];
        costumer.setActive(false);
    }

    public static void printCostumers(){
        for(Customer costumer : DataBase.customers){
            if(costumer != null && costumer.isActive()){
                System.out.println(costumer);
            }
        }
    }
}
