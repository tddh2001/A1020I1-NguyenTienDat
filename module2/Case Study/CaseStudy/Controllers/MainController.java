package CaseStudy.Controllers;

import CaseStudy.Services.ServicesManager;

import java.util.Scanner;

public class MainController {
    static ServicesManager servicesManager = new ServicesManager();
    public static void displayMainMenu() {
        int choices;
        Scanner input = new Scanner(System.in);
        System.out.println("=====SERVICES MANAGER=====");
        System.out.println("Menu:");
        System.out.println("1.Add New Services");
        System.out.println("2.Show Services");
        System.out.println("3.Add New Customer");
        System.out.println("4.Show Information of Customer");
        System.out.println("5.Add New Booking");
        System.out.println("6.Show Information of Employee");
        System.out.println("7.Exit");
        System.out.println("==========================");
        while (true) {
            System.out.println("Input menu: ");
            choices = input.nextInt();
            switch (choices) {
                case 1:
                    servicesManager.addNewServices();
                    break;
                case 2:
                    servicesManager.showServices();
                    break;
                case 3:
                    servicesManager.addNewCustomer();
                    break;
                case 4:
                    servicesManager.showInforationCustomers();
                    break;
                case 5:
//                    servicesManager.addNewBooking();
                    break;
                case 6:

                    break;
                case 7:
                    return;
            }
        }
    }


    public static void main(String[] args) {
        displayMainMenu();
    }
}
