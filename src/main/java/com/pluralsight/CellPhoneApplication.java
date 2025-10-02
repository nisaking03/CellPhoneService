package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        CellPhone myPhone = new CellPhone();

        System.out.print("What is the serial number?: ");
        int sn = sc.nextInt();
        sc.nextLine();

        myPhone.setSerialNumber(sn);

        //model
        System.out.print("What is the model: ");
        String model = sc.nextLine();

        myPhone.setModel(model);

        //carrier
        System.out.print("What is the carrier: ");
        String carrier = sc.nextLine();

        myPhone.setCarrier(carrier);

        //phone number
        System.out.print("What is your phone number: ");
        String phoneNumber = sc.nextLine();

        myPhone.setPhoneNumber(phoneNumber);

        //owner
        System.out.print("Who is the owner: ");
        String owner = sc.nextLine();

        myPhone.setOwner(owner);
        myPhone.dial("911");


        display(myPhone);

    }
    private static void display(CellPhone phone){
        System.out.println("-------------------------------");
        System.out.println("CELL PHONE [SN: " + phone.getSerialNumber() + "]");
        System.out.println("  Owner:    " + phone.getOwner());
        System.out.println("  Carrier:  " + phone.getCarrier());
        System.out.println("  Model:    " + phone.getModel());
        System.out.println("  Number:   41" + phone.getPhoneNumber());
    }
}




