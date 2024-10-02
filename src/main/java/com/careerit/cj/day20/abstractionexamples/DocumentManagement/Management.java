package com.careerit.cj.day20.abstractionexamples.DocumentManagement;

import java.util.Scanner;

public class Management {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the document type:");
        String type = sc.nextLine();
        Document doc = new WordDocument(type);
        doc.open();
        doc.save();
        doc.close();
    }
}
