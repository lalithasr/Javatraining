package com.careerit.cj.day11;

import java.util.Scanner;

public class Monitoringaserverusingwhileloop {
    public static boolean checkServerStatus(){
        boolean result = Math.random() > 0.2;
        System.out.println("Checking the server status, please wait");
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the server status:");
        boolean status = sc.nextBoolean();
        System.out.println("Enter the max retries:");
        int maxRetries = sc.nextInt();
        System.out.println("Enter the retry count:");
        int retryCount = sc.nextInt();

        while(!status && retryCount <= maxRetries){
           System.out.println("Checking the server status, please wait");
           status = checkServerStatus();
              retryCount++;
        }
        if(!status) {
            System.out.println("Server is not responding, please try after some time");
        }
        if(status){
            System.out.println("Server is up and running");
        }else {
            System.out.println("Failed to connect to the server after "+maxRetries+" retries");
        }

    }
}
