package playerpartencoder;

import java.util.Scanner;

public class Main {

    public static String[] partsString = {"body", "head", "torso", "rightArm", "leftArm", "rightLeg", "leftLeg", "rightItem", "leftItem"};

    public static PlayerParts parts = new PlayerParts();

    public static void main(String[] args) {
//        System.out.println("body\nhead\ntorso\nrightArm\nleftArm\nrightLeg\nleftLeg\nrightItem\nleftItem\n\nWhich Player Part do you wish to modify?:");
//
//        Scanner in = new Scanner(System.in);
//
//        String s = in.nextLine();
//
//        for (String str : partsString) {
//            if (s.toLowerCase().equals(str)) {
//                System.out.println("\nYou have selected: " + str);
//                    System.out.println("\nx\ny\nz\npitch\nyaw\nroll\nbend\nbendDirection\nisVisible");
//                System.out.println("\nWhich of these do you wish to disable/enable?");
//
//                s = in.nextLine();
//                in.close();
//            }
//        }
//        System.out.println("\nWrong input. Restarting.\n");
//        main(null);
        System.out.println(parts.toLong());
    }
}