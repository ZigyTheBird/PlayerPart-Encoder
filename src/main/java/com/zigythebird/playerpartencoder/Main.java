package com.zigythebird.playerpartencoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static PlayerParts parts = new PlayerParts();

    public static Map<String, PlayerPart> partsStringMap = new HashMap<String, PlayerPart>() {
        {
            put("body", parts.body);
            put("head", parts.head);
            put("torso", parts.torso);
            put("rightarm", parts.rightArm);
            put("leftarm", parts.leftArm);
            put("rightleg", parts.rightLeg);
            put("leftleg", parts.leftLeg);
            put("rightitem", parts.rightItem);
            put("leftitem", parts.leftItem);
        }
    };

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("body\nhead\ntorso\nrightArm\nleftArm\nrightLeg\nleftLeg\nrightItem\nleftItem\n\nWhich Player Part do you wish to modify? (Type encode to get the current output):");

        String input = scanner.nextLine().toLowerCase();

        if (input.equals("encode")) {
            System.out.println("\nOutput: " + parts.encode() + "\nPress enter to continue");
            scanner.nextLine();
            clearConsole();
            main(null);
            return;
        }

        if (partsStringMap.containsKey(input)) {
            for (Map.Entry<String, PlayerPart> entry : partsStringMap.entrySet()) {
                if (input.equalsIgnoreCase(entry.getKey())) {
                    boolean stop = false;
                    boolean isEnabled = true;
                    System.out.println("\nYou have selected: " + entry.getKey());
                    while (!stop) {
                        PlayerPart part = entry.getValue();
                        System.out.println("\nisEnabled\nx: " + part.x + "\ny: " + part.y + "\nz: " + part.z + "\npitch: " +
                                part.pitch + "\nyaw: " + part.yaw + "\nroll: " + part.roll + "\nbend: " + part.bend +
                                "\nbendDirection: " + part.bendDirection + "\nisVisible: " + part.isVisible);
                        System.out.println("\nWhich of these do you wish to disable/enable? (Type return to choose a different part)");

                        switch (scanner.nextLine()) {
                            case "isEnabled" -> {
                                clearConsole();
                                isEnabled = !isEnabled;
                                part.setX(isEnabled);
                                part.setY(isEnabled);
                                part.setZ(isEnabled);
                                part.setPitch(isEnabled);
                                part.setYaw(isEnabled);
                                part.setRoll(isEnabled);
                                part.setBend(isEnabled);
                                part.setBendDirection(isEnabled);
                            }
                            case "x" -> {
                                clearConsole();
                                part.setX(!part.x);
                            }
                            case "y" -> {
                                clearConsole();
                                part.setY(!part.y);
                            }
                            case "z" -> {
                                clearConsole();
                                part.setZ(!part.z);
                            }
                            case "pitch" -> {
                                clearConsole();
                                part.setPitch(!part.pitch);
                            }
                            case "yaw" -> {
                                clearConsole();
                                part.setYaw(!part.yaw);
                            }
                            case "roll" -> {
                                clearConsole();
                                part.setRoll(!part.roll);
                            }
                            case "bend" -> {
                                clearConsole();
                                part.setBend(!part.bend);
                            }
                            case "bendDirection" -> {
                                clearConsole();
                                part.setBendDirection(!part.bendDirection);
                            }
                            case "isVisible" -> {
                                clearConsole();
                                part.isVisible(!part.isVisible);
                            }
                            case "return" -> {
                                clearConsole();
                                stop = true;
                            }
                            default -> {
                                clearConsole();
                                System.out.println("\nInvalid property\n");
                            }
                        }
                    }
                    main(null);
                }
            }
        }
        else {
            clearConsole();
            System.out.println("\nWrong input\n");
            main(null);
        }
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}