package BootCamp.SwitchStimulator;
import java.util.Scanner;

public class SwitchBoard {
    Scanner sc = new Scanner(System.in);
    private Switch aSwitch;

    public SwitchBoard(Switch aSwitch) {
        this.aSwitch = aSwitch;
    }

    public void displayMainMenu() {
        while (true) {
            System.out.println("Switchboard Menu\n");
            aSwitch.Status();
            System.out.println("Write Y or N.");
            System.out.println("Do you want to Operate any Switch?");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("Enter your choice (Fan, Bulb, Ac):");
                String choice = sc.nextLine();
                switch (choice.toLowerCase()) {
                    case "fan":
                        displayFanMenu();
                        break;
                    case "bulb":
                        displayBulbMenu();
                        break;
                    case "ac":
                        displayACMenu();
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter Fan, Bulb, or AC.");
                        break;
                }
            } else if (answer.equalsIgnoreCase("N")) {
                return;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }

    private void displayFanMenu() {
        System.out.println("Fan Control Menu");
        aSwitch.displayFan();
        System.out.println("Enter the number of the fan to switch (or any other key to exit):");
        try {
            int choice = sc.nextInt();
            if (choice < 1 || choice > aSwitch.getFanCount()) {
                throw new IllegalArgumentException("Invalid fan number.");
            }
            aSwitch.toggleFan(choice);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid fan number.");
        }
    }

    private void displayACMenu() {
        System.out.println("AC Control Menu");
        aSwitch.displayAc();
        System.out.println("Enter the number of the AC to switch (or any other key to exit):");
        try {
            int choice = sc.nextInt();
            if (choice < 1 || choice > aSwitch.getACCount()) {
                throw new IllegalArgumentException("Invalid AC number.");
            }
            aSwitch.toggleAc(choice);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid AC number.");
        }
    }

    private void displayBulbMenu() {
        System.out.println("Bulb Control Menu");
        aSwitch.displayBulb();
        System.out.println("Enter the number of the bulb to switch (or any other key to exit):");
        try {
            int choice = sc.nextInt();
            if (choice < 1 || choice > aSwitch.getBulbCount()) {
                throw new IllegalArgumentException("Invalid bulb number.");
            }
            aSwitch.toggleBulb(choice);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid bulb number.");
        }
    }
}
