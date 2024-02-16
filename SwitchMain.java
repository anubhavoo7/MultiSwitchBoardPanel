package BootCamp.SwitchStimulator;

import java.util.Scanner;

class SwitchMain {
    public void method() {
        Scanner sc = new Scanner(System.in);
        SwitchBoard switchBoard = null;
        Switch aSwitch = null;

        while (true) {
            System.out.println("1. Initialize the SwitchBoard.");
            System.out.println("2. View the SwitchBoard.");
            System.out.println("3. Switch ON/OFF the Appliances.");
            System.out.println("4. Re-initialize the SwitchBoard.");
            System.out.println("5. Exit");

            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter the number of Fans:");
                    int numFan = sc.nextInt();
                    System.out.println("Enter the number of Bulbs:");
                    int numBulb = sc.nextInt();
                    System.out.println("Enter the number of ACs:");
                    int numAc = sc.nextInt();
                    aSwitch = new Switch(numFan, numBulb, numAc);
                    switchBoard = new SwitchBoard(aSwitch);
                    break;
                case 2:
                    if (switchBoard != null) {
                        switchBoard.displayMainMenu();
                    } else {
                        System.out.println("SwitchBoard is not initialized. Please initialize first.");
                    }
                    break;
                case 3:
                    if (switchBoard != null) {
                        switchBoard.displayMainMenu();
                    } else {
                        System.out.println("SwitchBoard is not initialized. Please initialize first.");
                    }
                    break;
                case 4:
                    if (switchBoard != null) {
                        System.out.println("Re-initializing the SwitchBoard.");
                        switchBoard = null;
                        aSwitch = null;
                    } else {
                        System.out.println("SwitchBoard is not initialized. Please initialize first.");
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }
}

