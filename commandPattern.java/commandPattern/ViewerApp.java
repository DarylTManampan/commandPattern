package commandPattern;

import java.util.*;
import java.util.Scanner;
public class ViewerApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        DeviceAction light = new Lights();
        DeviceAction tv = new Tv();
        DeviceAction thermoStat = new Thermostat();
        DeviceAction musicPlayer = new MusicPlayer();

        CentralHub hub = new CentralHub();

        System.out.println("\n====================");
        System.out.println("SMART HOME AUTOMATION");
        System.out.println("====================");

        while(true) {
            System.out.println("\nSelect from Home Devices: ");
                System.out.println("1) Lights");
                System.out.println("2) Tv");
                System.out.println("3) Thermostat");
                System.out.println("4) Music Player");
                System.out.println("5) Exit");
            System.out.println("\n----------------------------");
            System.out.print("\nChoose 1-5: ");
            String choice = scan.nextLine();

            if (choice.equals("1")) {
                while (true) {

                    System.out.println("\nCommands for Lights");
                        System.out.print("\n\t(1) Switch On");
                        System.out.print("\n\t(2) Switch Off");
                        System.out.print("\n\t(3) Increase Brightness");
                        System.out.print("\n\t(4) Decrease Brightness");
                        System.out.print("\n\t(5) Turn to Cooler Color");
                        System.out.print("\n\t(6) Turn to Warmer Color");
                        System.out.print("\n\t(7) Exit Lights");
                        System.out.println("\n---------------------------------");
                    System.out.print("\nChoose command action: ");
                    String deviceCommand = scan.nextLine();

                    if (deviceCommand.equals("7")) {
                        System.out.println("Exit");
                        System.out.println("----------------------------");
                        break;
                    }
                    System.out.println();
                    actions(deviceCommand, light, hub);

                    System.out.println();
                }
            } else if (choice.equals("2")) {
                while (true) {

                    System.out.println("\nCommands for Tv");
                        System.out.print("\n\t(1) Switch On");
                        System.out.print("\n\t(2) Switch Off");
                        System.out.print("\n\t(3) Next Channel");
                        System.out.print("\n\t(4) Previous Channel");
                        System.out.print("\n\t(5) Decrease Volume");
                        System.out.print("\n\t(6) Increase Volume");
                        System.out.print("\n\t(7) Exit Tv");
                        System.out.println("\n---------------------------------");
                    System.out.print("\nChoose command action: ");
                    String deviceCommand2 = scan.nextLine();

                    if (deviceCommand2.equals("7")) {
                        System.out.println("Exit");
                        System.out.println("----------------------------");
                        break;
                    }
                    System.out.println();
                    actions(deviceCommand2, tv, hub);

                    System.out.println();
                }
            } else if (choice.equals("3")) {
                while (true) {

                    System.out.println("\nCommands for Thermostat");
                        System.out.print("\n\t(1) Switch On");
                        System.out.print("\n\t(2) Switch Off");
                        System.out.print("\n\t(3) Increase Temperature");
                        System.out.print("\n\t(4) Decrease Temperature");
                        System.out.print("\n\t(5) Slower Speed");
                        System.out.print("\n\t(6) Faster Speed");
                        System.out.print("\n\t(7) Exit Thermostat");
                        System.out.println("\n---------------------------------");
                    System.out.print("\nChoose command action: ");
                    String deviceCommand3 = scan.nextLine();

                    if (deviceCommand3.equals("7")) {
                        System.out.println("Exit");
                        System.out.println("----------------------------");
                        break;
                    }
                    System.out.println();
                    actions(deviceCommand3, thermoStat, hub);

                    System.out.println();
                }
            } else if (choice.equals("4")) {
                while (true) {

                    System.out.println("\nCommands for Music Player");
                        System.out.print("\n\t(1) Switch On");
                        System.out.print("\n\t(2) Switch Off");
                        System.out.print("\n\t(3) Increase Volume");
                        System.out.print("\n\t(4) Decrease Volume");
                        System.out.print("\n\t(5) Previous Song");
                        System.out.print("\n\t(6) Next Song");
                        System.out.print("\n\t(7) Exit Music Player");
                        System.out.println("\n---------------------------------");
                    System.out.print("\nChoose command action: ");
                    String deviceCommand4 = scan.nextLine();

                    if (deviceCommand4.equals("7")) {
                        System.out.println("Exit");
                        System.out.println("----------------------------");
                        break;
                    }
                    System.out.println();
                    actions(deviceCommand4, musicPlayer, hub);

                    System.out.println();
                }
            } else if (choice.equals("5")) {
                System.out.println("\n====================");
                System.out.println("EXIT APPLICATION\n");
                System.exit(0);
                break;
            } else {
                System.out.println("\nInvalid Input. Please choose again");
            }


        }


    }

    public static void actions(String deviceCommand, DeviceAction device, CentralHub hub){


        switch (deviceCommand){
            case "1":
                Command powerOnAction = new PowerOn(device);
                hub.addCommand(powerOnAction );
                hub.clickButton();
                break;
            case "2":
                Command powerOffAction = new PowerOff(device);
                hub.addCommand(powerOffAction);
                hub.clickButton();
                break;
            case "3":
                Command upAction = new Up(device);
                hub.addCommand(upAction);
                hub.clickButton();
                break;
            case "4":
                Command downAction = new Down(device);
                hub.addCommand(downAction);
                hub.clickButton();
                break;
            case "5":
                Command leftAction = new Left(device);
                hub.addCommand(leftAction);
                hub.clickButton();
                break;
            case "6":
                Command rightAction = new Right(device);
                hub.addCommand(rightAction);
                hub.clickButton();
                break;
            default:
                System.out.println("Invalid Input");
                break;

        }

    }

}