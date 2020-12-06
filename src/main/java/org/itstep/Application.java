package org.itstep;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, TreeSet<String>> networkMap = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            TreeSet<String> show = new TreeSet<>();
            System.out.print("Enter name of the channel:");
            String channelName = scan.nextLine();
            if (networkMap.containsKey(channelName)) {
                System.out.print("Enter name of the show:");
                String showName = scan.nextLine();
                networkMap.get(channelName).add(showName);
            }
            else {
                System.out.print("Enter name of the show:");
                String showName = scan.nextLine();
                show.add(showName);
                networkMap.put(channelName, show);
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(networkMap);
        }
    }
}
