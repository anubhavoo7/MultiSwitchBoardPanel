package BootCamp.SwitchStimulator;

import java.util.Scanner;

class PanelMain {
    public static void main(String[] args) {

        Panel();
    }

    public static void Panel() {
        Scanner sc = new Scanner(System.in);
        int[] switchBoards = null;
        SwitchMain switchMain = new SwitchMain();
        while (true) {
            System.out.println("1. Initialize the number of SwitchBoard.");
            System.out.println("2. View the SwitchBoards.");
            System.out.println("3. Operate the SwitchBoard");
            System.out.println("4. Re-initialize the SwitchBoard.");
            System.out.println("5. Exit");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer choice.");
                sc.next();
                continue;
            }
                int s = sc.nextInt();
                switch (s) {
                    case 1:
                        System.out.println("Enter the number of switchBoard you want: ");

                        if (!sc.hasNextInt()) {
                            System.out.println("Invalid input. Please enter the valid input");
                            continue;
                        }
                        int n = sc.nextInt();
                        if (n <= 0) {
                            System.out.println("Number of switchboards must be greater than 0.");
                            sc.next();
                            continue;
                        }
                        switchBoards = new int[n];
                        System.out.println("SwitchBoards initialized.");
                        for (int i = 1; i <= n; i++) {
                            System.out.println("Initialized SwitchBoard: " + i);
                        }
                        break;
                    case 2:
                        if (switchBoards == null) {
                            System.out.println("SwitchBoards not initialized yet.");
                        } else {
                            System.out.println("SwitchBoards Status.");
                            for (int i = 0; i < switchBoards.length; i++) {
                                System.out.println("SwitchBoards " + (i + 1));
                            }
                        }
                        break;
                    case 3:
                        if (switchBoards == null) {
                            System.out.println("SwitchBoards not initialized yet.");
                        } else {
                            System.out.println("Select the SwitchBoard you want to operate: ");
                            while (!sc.hasNextInt()) {
                                System.out.println("Invalid input. Please enter a valid integer.");
                                sc.next();
                            }
                            int switchBoardIndex = sc.nextInt();
                            while (switchBoardIndex < 1 || switchBoardIndex > switchBoards.length) {
                                System.out.println("Invalid Switch Board selection. Please enter a valid SwitchBoard number: ");
                                while (!sc.hasNextInt()) {
                                    System.out.println("Invalid input. Please enter a valid integer.");
                                    sc.next();
                                }
                                switchBoardIndex = sc.nextInt();
                            }
                            switchMain.method();
                        }
                        break;
                    case 4:
                        if (switchBoards == null) {
                            System.out.println("SwitchBoards not initialized yet.");
                        } else {
                            switchBoards = null;
                            System.out.println("SwitchBoards Re-initialized");
                        }
                        break;
                    case 5:
                        System.out.println("Exiting");
                        return;
                    default:
                        System.out.println("Invalid choice, please choose again!");
                }
            }
        }
    }

