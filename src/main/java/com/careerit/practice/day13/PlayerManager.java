package com.careerit.practice.day13;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class PlayerManager {

        public static void main(String args[]){
          List<Player> players = loadPlayers();
          System.out.println(" Total " + players.size() + " players loaded");
          for(Player player:players){
              player.showInfo();
          }
          List<String> maxPaidPlayers = getMaxPaidPlayers(players);
          System.out.println("Max paid players : "+maxPaidPlayers);
          List<String> minPaidPlayers = getMinPaidPlayers(players);
            System.out.println("Min paid players : "+minPaidPlayers);



        }

        public static List<Player> loadPlayers(){
            List<Player> players = new ArrayList<>();
            try {
                Path path = Paths.get(ClassLoader.getSystemResources("ipl_players.csv").nextElement().toURI());
                System.out.println(path);
                List<String> lines = Files.readAllLines(path);
                for(int i = 1; i < lines.size(); i++){
                    String data = lines.get(i);
                    String[] arr = data.split(",");
                    String name = arr[0];
                    String role = arr[1];
                    String country = arr[2];
                    double amount = Double.parseDouble(arr[3]);
                    Player player = new Player(name, role, country, amount);
                    players.add(player);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return players;
        }

        public static List<String> getMaxPaidPlayers(List<Player> players){
            List<String> maxPaidPlayers = new ArrayList<>();
            double max = maxAmount(players);
            for(Player player:players){
                if(player.getAmount() == max){
                    maxPaidPlayers.add(player.getName());
                }
            }
            return maxPaidPlayers;
        }

        public static List<String> getMinPaidPlayers(List<Player> players){
            List<String> minPaidPlayers = new ArrayList<>();
            double min = minAmount(players);
            for(Player player:players){
                if(player.getAmount() == min){
                    minPaidPlayers.add(player.getName());
                }
            }
            return minPaidPlayers;
        }

        public static double maxAmount(List<Player> players){
            double max = players.get(0).getAmount();
            for(Player player:players){
                if(player.getAmount() > max){
                    max = player.getAmount();
                }
            }
            return max;
        }
        public static double minAmount(List<Player> players){
            double min = players.get(0).getAmount();
            for(Player player:players){
                if(player.getAmount() < min){
                    min = player.getAmount();
                }
            }
            return min;
        }
}
